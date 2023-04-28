package MINIBus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SelectDateAndTime {
    public static void SelectDate(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Today is " + today);

        LocalDateTime FirstDate = today.plusDays(1);
        LocalDateTime LastDate = today.plusDays(7);
        System.out.println("You can select the date between " + FirstDate + " and " + LastDate);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter departure date (dd-MM-yyyy): ");
        String inputDate = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            LocalDateTime departureDate = LocalDateTime.parse(inputDate, formatter);

            if (departureDate.isBefore(FirstDate) || departureDate.isAfter(LastDate)) {
                System.out.println("Departure date must be between " + FirstDate.format(formatter)
                        + " and " + LastDate.format(formatter) + ".");
            } else {
                System.out.println("Departure date selected: " + departureDate.format(formatter));
            }
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter the date in the format dd-MM-yyyy.");
        } finally {
            scanner.close();
        }
    }
}
