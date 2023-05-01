package MINIBus;
import java.util.Scanner;

public class fillInformation {
    private static String[] personalInfo = new String[0];
    private static boolean loop = true;

    /*--------------------------------------4.1.1 Fill personal information---------------------------------------------------------------------*/
    public static String[] fillPersonalInformation() {
        Scanner scanner = new Scanner(System.in);
        
        while (loop) {
            System.out.println("Please fill out the following personal information:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Phone number: ");
            String phone = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
        
            personalInfo = new String[]{name, phone, email};
/*-----------------------------------------4.2 Press confirm information----------------------------------------------------------------------------------*/
            System.out.print("Please confirm your information (Y/N): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Y")) {
                System.out.println("Thank you for your confirmation!");
                loop = false;
            } else if (input.equalsIgnoreCase("N")) {
                System.out.println("Please fill out your personal information again:");
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
        
        return personalInfo;
    }

    
}
