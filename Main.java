import java.util.Scanner;

/**
* This class uses the Vehicle.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-06-01
*/
public class Main {
  /**
  * The Main method receives input and checks viability.
  */
  public static void main(String[] args) {
    Vehicle avehicle = new Vehicle("Grey", "T3CHN0", 4, 180);
    Vehicle avehicle2 = new Vehicle("Royal Red", "G0FA5T", 2, 250);
    
    System.out.println("Speed up by 60 on vehicle #1 and 80 on vehicle #2.");
    avehicle.accelerate(60);
    avehicle2.accelerate(80);
    System.out.println("\nThe current speed on bicycle #1 is: " + avehicle.getSpeed());
    System.out.println("The current speed on bicycle #2 is: " + avehicle2.getSpeed());
    
    System.out.println("\nApply the brake on vehicle #1 with value 13.");
    avehicle.applyBrake(2);
    System.out.println("\nThe new speed on bicycle #1 is: " + avehicle.getSpeed());
    System.out.println("The new speed on bicycle #2 is: " + avehicle2.getSpeed());

    System.out.println("\nDone.");
  }
}