/*-----------------------------------------2.1 Select departure date ((Reserve up to 7 days in advance)-------------------------------------------------------*/
/*-----------------------------------------2.2 Choose the desired time slot-----------------------------------------------------------------------------------*/

//TRY (T_T) P'Jab check hai nong duay naka 
public class SelectDateAndTime {
    
	public static void SelectDate(String[] args) {	
		LocalDate today = LocalDate.now();
	   System.out.print("Today is " +today);
	
	   LocalDate FirstDate = today.plusDays(1);
	   LocalDate LastDate = today.plusDays(7);
	   System.out.println("You can select the date between" + FirstDate + "and" + LastDate);
   
	   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	   Scanner scanner = new Scanner(System.in);
	   System.out.print("Enter departure date (yyyy-MM-dd)");
	   String inputDate = scanner.nextLine();
	  
	   LocalDate departureDate = LocalDate.parse(inputDate, formatter);
	  
	   if (departureDate.isBefore(FirstDate) || departureDate.isAfter(LastDate)) {
			 System.out.println("Departure date must be between " + FirstDate.format(formatter) 
			 + " and " + LastDate.format(formatter) + ".");
	   } else {
		   System.out.println("Departure date selected: " + departureDate.format(formatter));
	   }
	   
			   
	   scanner.close();
	}
}
/*-----------------------------------------2.2 Choose the desired time slot-----------------------------------------------------------------------------------*/

public static void main(String[] args) {
	selectTimeSlot();
}
    private static final String TIME_PATTERN = "H:mm";
    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern(TIME_PATTERN);

    private static final LocalTime[] TimeSlot = {
            LocalTime.parse("5:30", TIME_FORMATTER),
            LocalTime.parse("7:00", TIME_FORMATTER),
            LocalTime.parse("8:30", TIME_FORMATTER),
            LocalTime.parse("10:00", TIME_FORMATTER),
            LocalTime.parse("11:30", TIME_FORMATTER),
            LocalTime.parse("13:00", TIME_FORMATTER),
            LocalTime.parse("14:30", TIME_FORMATTER),
            LocalTime.parse("16:00", TIME_FORMATTER),
            LocalTime.parse("17:30", TIME_FORMATTER),
            LocalTime.parse("19:00", TIME_FORMATTER)
    };

    public static void selectTimeSlot() {
        LocalDateTime currentTime = LocalDateTime.now();
		
  /*--------------------------------------Print------------------------------------------------------*/	
		System.out.println("Available time slots:");
		for (int i = 0; i < TimeSlot.length; i++) {
            String formattedTime = TimeSlot[i].format(TIME_FORMATTER);
            System.out.println((i + 1) + ". " + formattedTime);
        }
  /*------------------------------------------------------------------------------------------------*/
        Scanner scanner = new Scanner(System.in);
        int selectedTimeSlotNumber = -1;

        do {
            System.out.print("Enter the number of the time slot you would like to select: ");
            if (scanner.hasNextInt()) {
                selectedTimeSlotNumber = scanner.nextInt();
            } else {
                scanner.nextLine(); 
            }
        } while (selectedTimeSlotNumber < 1 || selectedTimeSlotNumber > TimeSlot.length);

        String selectedTimeSlot = TimeSlot[selectedTimeSlotNumber - 1].format(TIME_FORMATTER);
        System.out.println("You have selected the time slot: " + selectedTimeSlot);
    }

//เลือกเวลาได้แต่บัค เลือกเวลาที่ผ่านมาแล้วได้ TT