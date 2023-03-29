package MINIBus;
import java.util.Scanner;
/*-----------------------------------------3. Select seat number (Max 20 seats)------------------------------------------------------------------------------*/

/*-----------------------------------------Selectseat Class--------------------------------------------------------------------------------------------------*/
public class Selectseat {
    private int numSeats;

    public Selectseat(int numSeats){
        int seatNumber;
        

        /*----------------------------------------------While Seat = false-----------------------------------------------------------------------*/
        while(true){
            System.out.print("Enter seat number (Max20): ");
            Scanner scanner = new Scanner(System.in);/*-----------------scan keyboard----------------------------------------------------------------------------*/
            seatNumber = scanner.nextInt();
        
            if(seatNumber<=20&&seatNumber>0){
                System.out.println("Your seat no. = " + seatNumber);
                break;/*------------------------------------------------exit the loop------------------------------------------------------------*/
            }else{
                System.out.println("please select only 1-20");
            }
        }
        
           
    }
}
