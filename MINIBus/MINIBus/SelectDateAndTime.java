package MINIBus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SelectDateAndTime {

    private static final String DATE_PATTERN = "yyyy-MM-dd";
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_PATTERN);
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

    public static LocalDate selectDate() {
        System.out.println("");
        System.out.println("----------");
        LocalDate today = LocalDate.now();
        System.out.println("Today is " + today);
    
        LocalDate firstDate = today.plusDays(1);
        LocalDate lastDate = today.plusDays(7);
        System.out.println("You can select the date between " + firstDate + " and " + lastDate);
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter departure date (yyyy-MM-dd): ");
        String inputDateTime = scanner.nextLine();
        System.out.println(inputDateTime);
    
        LocalDate departureDate = LocalDate.parse(inputDateTime, DATE_FORMATTER);
    
        if (departureDate.isBefore(firstDate) || departureDate.isAfter(lastDate)) {
            System.out.println("Departure date must be between " + firstDate.format(DATE_FORMATTER) +
                    " and " + lastDate.format(DATE_FORMATTER) + ".");
            return selectDate();
        } else {
            System.out.println("Departure date selected: " + departureDate.format(DATE_FORMATTER));
            return departureDate;
        }
    }
    
    public static LocalTime selectTimeSlot() {
        LocalDateTime currentTime = LocalDateTime.now();
    
        System.out.println("Available time slots:");
        for (int i = 0; i < TimeSlot.length; i++) {
            String formattedTime = TimeSlot[i].format(TIME_FORMATTER);
            System.out.println((i + 1) + ". " + formattedTime);
        }
    
        Scanner scanner = new Scanner(System.in);
        int selectedTimeSlotNumber = -1;
        System.out.println(DATE_PATTERN);
        do {
            System.out.print("Enter the number of the time slot you would like to select: ");
            if (scanner.hasNextInt()) {
                selectedTimeSlotNumber = scanner.nextInt();
            } else {
                scanner.nextLine();
            }
        } while (selectedTimeSlotNumber < 1 || selectedTimeSlotNumber > TimeSlot.length);
    
        LocalTime selectedTimeSlot = TimeSlot[selectedTimeSlotNumber - 1];
        System.out.println("You have selected the time slot: " + selectedTimeSlot.format(TIME_FORMATTER));
        return selectedTimeSlot;
    }

    public static String getSelectedTimeSlot() {
        return getSelectedTimeSlot();
    }
    public static String getSelectedDate() {
        return null;
    }
}