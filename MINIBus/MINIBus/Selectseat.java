package MINIBus;
import java.util.Scanner;
/*-----------------------------------------3. Select seat number (Max 20 seats)------------------------------------------------------------------------------*/

/*-----------------------------------------Selectseat Class--------------------------------------------------------------------------------------------------*/
public class Selectseat {
    private int NumSeats;

    public Selectseat(int maxSeats){
        Scanner scanner = new Scanner(System.in);

        /*----------------------------------------------While Seat = true-----------------------------------------------------------------------*/
        while(true){
            System.out.print("Enter seat number (Max " + maxSeats + " seats): ");
            int seatNumber = scanner.nextInt();
        
            if(seatNumber <= maxSeats && seatNumber > 0){
                NumSeats = seatNumber;
                System.out.println("Your seat no. = " + NumSeats);
                break;
            }else{
                System.out.println("Please select only 1-" + maxSeats + " seats.");
            }
        }
           
    }
    public int getSeatNumber() {
        return NumSeats;
    }
    
}
