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

        // Create an instance of the Selectseat class
        Selectseat selectSeat = new Selectseat(20);

        // Call the Selectseat constructor with the number of available seats
        // This example assumes that there are 20 available seats in the bus

        // Note that you can adjust the number of available seats as needed by changing the argument value
        
        //Print the results to the console
        /*System.out.println("Your origin station: "+originResult);
        System.out.println("Your destination station: "+destinationResult);
        */
    }
}
