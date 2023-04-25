package MINIBus;

public class Main {

    public static void main(String[] args) {
        System.out.println("MINIbus program");

        // Call ChooseOriginDestination Class
        ChooseOriginDestination chooseOD = new ChooseOriginDestination();
        chooseOD.ChooseOrigin(null);
        chooseOD.ChooseDestination(null);

        // Call the Selectseat Class max20 seat
        Selectseat selectSeat = new Selectseat(20);
        // Get the selected seat number
        int seatNumber = selectSeat.getSeatNumber();
        
        // Call the calculateFareAmount method to get the fare amount
        int amount = ChooseOriginDestination.calculateFareAmount();
        
        // Call fillInformation class
        fillInformation info = new fillInformation();
        String[] personalInfo = fillInformation.fillPersonalInformation();
        String[] confirm = fillInformation.confirmInformation();

        // Call the PrintAllinfo class to display all information
        PrintAllinfo.print(personalInfo, seatNumber, amount);
    }
}
