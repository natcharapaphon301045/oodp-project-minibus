package MINIBus;

public class PrintAllinfo {
    public static void print(String[] personalInfo, int seatNumber, int amount) {
        System.out.println("----------");
        System.out.println("Name: " + personalInfo[0]);
        System.out.println("Phone: " + personalInfo[1]);
        System.out.println("Email: " + personalInfo[2]);
        System.out.println("Seat Number: "+ seatNumber);
        System.out.println("Fare Amount: "+ amount);
    }
}
