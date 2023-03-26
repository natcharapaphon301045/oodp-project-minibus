package MINIBus;
import java.util.Scanner;
/*-----------------------------------------3. Select seat number (Max 20 seats)------------------------------------------------------------------------------*/
public class Selectseat {
    private int numSeats;

    public Selectseat(int numSeats){
        int seatNumber;
        System.out.print("Enter seat number (Max20): ");
        Scanner scanner = new Scanner(System.in);
        seatNumber = scanner.nextInt();
        if(seatNumber<=20&&seatNumber>0){
            System.out.println("Your seat no. = " + seatNumber);    
        }else{
            System.out.println("please select only 1-20");
        }
           
    }
}
