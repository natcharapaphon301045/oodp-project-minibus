package MINIBus;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
/*-----------------------------------------2.1 Select departure date ((Reserve up to 7 days in advance)-------------------------------------------------------*/
/*-----------------------------------------2.2 Choose the desired time slot-----------------------------------------------------------------------------------*/

//TRY (T_T) P'Jab check hai nong duay naka 
public class SelectDateAndTime {
     public static void SelectDate(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.print("Today is " +today);
	
		LocalDateTime FirstDate = now.plusDays(1);
		LocalDateTime LastDate = now.plusDays(7);
		System.out.print("You can select the date between" + FirstDate + "and" + LastDate);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter departure date");
		String inputDate = scanner.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDateTime departureDate = LocalDateTime.parse(inputDate, formatter);

		if (departureDate.isBefore(FirstDate) || departureDate.isAfter(LastDate)) {
			  System.out.println("Departure date must be between " + FirstDate.format(formatter) 
              + " and " + LastDate.format(formatter) + ".");
		} else {
		    System.out.println("Departure date selected: " + departureDate.format(formatter));
		}
		
				
		scanner.close();
	 }
}
