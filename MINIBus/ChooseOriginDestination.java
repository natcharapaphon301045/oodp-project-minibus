package MINIBus;

/*---------------------------------------------1. Choose the origin and destination------------------------------------------------------------------------*/
public class ChooseOriginDestination {
    
    public boolean ChooseOrigin(String oString) {
        String[] stations = StationArray();
        
        System.out.println("Select original stutation");
        for (String station : stations) {
            System.out.println(station);
            /*ADD keyboard reading */
           
        }
        return true;
    }
    /*------------------------------------------Array--------------------------------------------------------------------------------------------------------*/
    public String[]StationArray() {
        String[] stations = new String[10];
        stations[0] = "station 1 -??? Baht";
        stations[1] = "station 2 -??? Baht";
        stations[2] = "station 3 -??? Baht";
        stations[3] = "station 4 -??? Baht";
        stations[4] = "station 5 -??? Baht";
        stations[5] = "station 6 -??? Baht";
        stations[6] = "station 7 -??? Baht";
        stations[7] = "station 8 -??? Baht";
        stations[8] = "station 9 -??? Baht";
        stations[9] = "station 10-??? Baht";
        return stations;
    }
    /*------------------------------------------Array--------------------------------------------------------------------------------------------------------*/
}

