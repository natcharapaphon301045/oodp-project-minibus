package MINIBus;
import java.util.Scanner;

/*---------------------------------------------1. Choose the origin and destination------------------------------------------------------------------------*/
public class ChooseOriginDestination {
    /*------------------------------------------1.1 Choose the original------------------------------------------------------------------------------------*/
    public boolean ChooseOrigin(String oString) {
        String[] stations = StationArray();
        
        System.out.println("the riginal stutation");
        /*--------------------------------------Print array station information------------------------------------------------------*/
        for (int i = 0; i < stations.length; i++) {
            System.out.println((i+1) + ". " + stations[i]);
        }
        System.out.print("Select original stutation: ");
        /*--------------------------------------ADD keyboard reading-----------------------------------------------------------------*/
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        /*--------------------------------------Output-------------------------------------------------------------------------------*/
        try {
            int selection = Integer.parseInt(input);
            if (selection > 0 && selection <= stations.length) {
                System.out.println("You selected: " + stations[selection-1]);
            } else {
                System.out.println("Invalid selection.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
        }
        
        return true;
    }
    /*------------------------------------------1.2 Choose the Destination----------------------------------------------------------------------------------*/
    public boolean ChooseDestination(String oString){
        String[] stations = StationArray();

        System.out.println("the Destination stutation");
        /*--------------------------------------Print array station information------------------------------------------------------*/
        for (int i = 0; i < stations.length; i++) {
            System.out.println((i+1) + ". " + stations[i]);
        }
        System.out.print("Select destination stutation: ");
        /*--------------------------------------ADD keyboard reading-----------------------------------------------------------------*/
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        /*--------------------------------------Output-------------------------------------------------------------------------------*/
        try {
            int selection = Integer.parseInt(input);
            if (selection > 0 && selection <= stations.length) {
                System.out.println("You selected: " + stations[selection-1]);
            } else {
                System.out.println("Invalid selection.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
        }
        
        return true;
    }
    /*------------------------------------------Array--------------------------------------------------------------------------------------------------------*/
    public String[]StationArray() {
        String[] stations = new String[10];
        stations[0] = "station 1 "+Integer.toString(100)+" Baht";
        stations[1] = "station 2 "+Integer.toString(200)+" Baht";
        stations[2] = "station 3 "+Integer.toString(300)+" Baht";
        stations[3] = "station 4 "+Integer.toString(400)+" Baht";
        stations[4] = "station 5 "+Integer.toString(500)+" Baht";
        stations[5] = "station 6 "+Integer.toString(600)+" Baht";
        stations[6] = "station 7 "+Integer.toString(700)+" Baht";
        stations[7] = "station 8 "+Integer.toString(800)+" Baht";
        stations[8] = "station 9 "+Integer.toString(900)+" Baht";
        stations[9] = "station 10 "+Integer.toString(1000)+" Baht";
        return stations;
    }
    /*------------------------------------------Array--------------------------------------------------------------------------------------------------------*/
}

