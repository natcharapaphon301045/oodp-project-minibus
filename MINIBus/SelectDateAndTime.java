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