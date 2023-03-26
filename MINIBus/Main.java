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
        
        //Print the results to the console Check status
        /*System.out.println("Your origin station: "+originResult);
        System.out.println("Your destination station: "+destinationResult);
        */
    }
}
