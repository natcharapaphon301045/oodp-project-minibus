package MINIBus;
import java.util.Scanner;

/*-----------------------------------------3. Select seat number (Max 20 seats)------------------------------------------------------------------------------*/

/*-----------------------------------------Selectseat Class--------------------------------------------------------------------------------------------------*/
public class Selectseat {
    private String seatNumber;

    public Selectseat(int maxSeats){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter seat number (Max " + maxSeats + " seats): ");
            int num = scanner.nextInt();
        
            if(num <= maxSeats && num > 0){
                seatNumber = String.valueOf(num);
                System.out.println("Your seat no. = " + seatNumber);
                break;
            } else {
                System.out.println("Please select only 1-" + maxSeats + " seats.");
            }
        }
    }

    public String getSeatNumber(){
        return seatNumber;
    }
}
