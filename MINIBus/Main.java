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

        // Call the PrintAllinfo class to display all information
        PrintAllinfo.print(personalInfo, seatNumber);
    }
}
