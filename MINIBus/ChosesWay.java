package MINIBus;
import java.util.Scanner;
public class ChosesWay {
    
    private String origin;
    private int Originfare=0;
    private String destination;
    private int destinationfare=0;
    private int amount =0;

    public String[]OriStationArray() {/*need to change to collection but not now */
        String[] Oristations = new String[10];
        Oristations[0] = "station 1 "+Integer.toString(100)+" Baht";
        Oristations[1] = "station 2 "+Integer.toString(200)+" Baht";
        Oristations[2] = "station 3 "+Integer.toString(300)+" Baht";
        Oristations[3] = "station 4 "+Integer.toString(400)+" Baht";
        Oristations[4] = "station 5 "+Integer.toString(500)+" Baht";
        Oristations[5] = "station 6 "+Integer.toString(600)+" Baht";
        Oristations[6] = "station 7 "+Integer.toString(700)+" Baht";
        Oristations[7] = "station 8 "+Integer.toString(800)+" Baht";
        Oristations[8] = "station 9 "+Integer.toString(900)+" Baht";
        Oristations[9] = "station 10 "+Integer.toString(1000)+" Baht";
        return Oristations;
    }
    public String[]DestStationArray() {/*need to change to collection but not now */
        String[] Destistations = new String[10];
        Destistations[0] = "station 1 "+Integer.toString(100)+" Baht";
        Destistations[1] = "station 2 "+Integer.toString(200)+" Baht";
        Destistations[2] = "station 3 "+Integer.toString(300)+" Baht";
        Destistations[3] = "station 4 "+Integer.toString(400)+" Baht";
        Destistations[4] = "station 5 "+Integer.toString(500)+" Baht";
        Destistations[5] = "station 6 "+Integer.toString(600)+" Baht";
        Destistations[6] = "station 7 "+Integer.toString(700)+" Baht";
        Destistations[7] = "station 8 "+Integer.toString(800)+" Baht";
        Destistations[8] = "station 9 "+Integer.toString(900)+" Baht";
        Destistations[9] = "station 10 "+Integer.toString(1000)+" Baht";
        return Destistations;
    }
/*---------------------------------------------1. Choose the origin and destination------------------------------------------------------------------------*/
    public boolean ChooseOrigin(String sampleOrigin) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The Original Stutation");
    
        // Initialize stations array by calling the StationArray method
        String[] stations = OriStationArray();
    
        for (int i = 0; i < stations.length; i++) {
            System.out.println((i+1) + ". " + stations[i]);
        }
        System.out.print("Select original stutation: ");
        int choice = scanner.nextInt();
    
        switch (choice) {
            case 1:
                origin = "station 1 ";
                Originfare = 100;
                break;
            case 2:
                origin = "station 2 ";
                Originfare = 200;
                break;
            case 3:
                origin = "station 3 ";
                Originfare = 300;
                break;
            case 4:
                origin = "station 4 ";
                Originfare = 400;
                break;
            case 5:
                origin = "station 5 ";
                Originfare = 500;
                break;
            case 6:
                origin = "station 6 ";
                Originfare = 600;
                break;
            case 7:
                origin = "station 7 ";
                Originfare = 700;
                break;
            case 8:
                origin = "station 8 ";
                Originfare = 800;
                break;
            case 9:
                origin = "station 9 ";
                Originfare = 900;
                break;
            case 10:
                origin = "station 10 ";
                Originfare = 1000;
                break;
            default:
                System.out.println("Invalid choice.");
                return false;
        }  
        System.out.println("You have selected " + origin + " as your origin.");
        return true;
    }
 /*------------------------------------------1.2 Choose the Destination----------------------------------------------------------------------------------*/ 
    public boolean ChooseDestination(String sampleOrigin) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("The Original Stutation");

    // Initialize stations array by calling the StationArray method
    String[] stations = DestStationArray();

    for (int i = 0; i < stations.length; i++) {
        System.out.println((i+1) + ". " + stations[i]);
    }
    System.out.print("Select destination stutation: ");
    int choice = scanner.nextInt();

    switch (choice) {
        case 1:
            destination = "station 1 ";
            destinationfare = 100;
            break;
        case 2:
            destination = "station 2 ";
            destinationfare = 200;
            break;
        case 3:
            destination = "station 3 ";
            destinationfare = 300;
            break;
        case 4:
            destination = "station 4 ";
            destinationfare = 400;
            break;
        case 5:
            destination = "station 5 ";
            destinationfare = 500;
            break;
        case 6:
            destination = "station 6 ";
            destinationfare = 600;
            break;
        case 7:
            destination = "station 7 ";
            destinationfare = 700;
            break;
        case 8:
            destination = "station 8 ";
            destinationfare = 800;
            break;
        case 9:
            destination = "station 9 ";
            destinationfare = 900;
            break;
        case 10:
            destination = "station 10 ";
            destinationfare = 1000;
            break;
        default:
            System.out.println("Invalid choice.");
            return false;
    }  
    System.out.println("You have selected " + destination + " as your destination.");
    return true;
}
    

    public String getOrigin() {
        return origin;
    }
    public String getDestination() {
        return destination;
    }   
}

