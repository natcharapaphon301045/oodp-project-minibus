package MINIBus;

public class PrintAllinfo {
    public static void print(String[] personalInfo, int seatNumber, int origin, int originFare,
                             int destination, int destinationFare, int amount) {
        System.out.println("----------");
        System.out.println("Name: " + personalInfo[0]);
        System.out.println("Phone: " + personalInfo[1]);
        System.out.println("Email: " + personalInfo[2]);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Origin: station " + origin + " " + originFare + " Baht");
        System.out.println("Destination: station " + destination + " " + destinationFare + " Baht");
        //System.out.println("Departure Date: " + departureDate);
        //System.out.println("Departure Time Slot: " + SelectDateAndTime.getSelectedTimeSlot());
        System.out.println("Fare Amount: " + amount);
    }
}
