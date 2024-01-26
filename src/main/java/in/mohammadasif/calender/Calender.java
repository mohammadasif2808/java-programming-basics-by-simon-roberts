package in.mohammadasif.calender;

/**
 *
 * @author mohammad asif
 * Email: mohammadasif2808@gmail.com
 * Date: Jan 26, 2024 5:44:58 PM
 */
public class Calender {
    
    public static void main(String[] args) {
        Date today = new Date(29,02,2024);
        
        System.out.println("Today is "+ today );
            
        today.nextDay();
        
        System.out.println("Tomorrow is "+ today );
    }
}
