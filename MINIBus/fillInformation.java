package MINIBus;
import java.util.Scanner;

public class fillInformation {
    /*--------------------------------------4.1.1 Fill personal information---------------------------------------------------------------------*/
    public static String[] fillPersonalInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please fill out the following personal information:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Phone number: ");
        String phone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        String[] personalInfo = {name, phone, email};


        return personalInfo;
    }

    /*-----------------------------------------4.2 Press confirm information----------------------------------------------------------------------------------*/
    public static String[] confirmInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please confirm your information (Y/N): ");
        String input = scanner.nextLine();
    if (input.equalsIgnoreCase("Y")) {
        System.out.println("Thank you for your confirmation!");
        return fillPersonalInformation();
    } else if (input.equalsIgnoreCase("N")) {
        System.out.println("Please fill out your personal information again:");
        return fillPersonalInformation();
    } else {
        System.out.println("Invalid input. Please enter Y or N.");
        return confirmInformation();
    }
    }
}
