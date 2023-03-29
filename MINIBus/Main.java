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

        // Call SelectDateAndTime Class

         // Call fillInformation class
         fillInformation info = new fillInformation();
         info.fillPersonalInformation();
         boolean confirm = info.confirmInformation();

        // Call Print all information
        

        
        
    }
}
