package MINIBus;

public class Main {

    public static void main(String[] args) {
        System.out.println("MINIbus program");

        // Create an instance of the ChooseOriginDestination class
        ChooseOriginDestination originDestination = new ChooseOriginDestination();

        // Call the ChooseOrigin method with a sample string argument
        boolean originResult = originDestination.ChooseOrigin("sample origin string");
        
        // Call the ChooseDestination method with a sample string argument
        boolean destinationResult = originDestination.ChooseDestination("sample destination string");

        // Call the Selectseat Class max20 seat
        Selectseat selectSeat = new Selectseat(20);
        // Get the selected seat number
        int seatNumber = selectSeat.getSeatNumber();
        // Call SelectDateAndTime Class

        // Call fillInformation class
        fillInformation info = new fillInformation();
        String[] personalInfo = info.fillPersonalInformation();
        boolean confirm = info.confirmInformation();

        // Print all information
        System.out.println("----------");
        System.out.println("Name: " + personalInfo[0]);
        System.out.println("Phone: " + personalInfo[1]);
        System.out.println("Email: " + personalInfo[2]);
        System.out.println("Seat Number: "+ seatNumber);
    }
}
