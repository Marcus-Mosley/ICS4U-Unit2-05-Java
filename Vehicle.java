/**
* This class creates a vehicle.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-06-01
*/
public class Vehicle {
  private String colour;
  private String plateNo;
  private int doorNo;
  private int maxSpeed;
  private int speed;
  
  // Constructors
  
  /**
  * The Vehicle method constructs a vehicle.
  */
  public Vehicle(String startColour, String startPlateNo, int startDoorNo, int startMaxSpeed) {
    colour = startColour;
    plateNo = startPlateNo;
    doorNo = startDoorNo;
    maxSpeed = startMaxSpeed;
    speed = 0;
  }
  
  // Getters
  
  public String getColour() {
    return this.colour;
  }
  
  public String getPlateNo() {
    return this.plateNo;
  }
  
  public int getDoorNo() {
    return this.doorNo;
  }
  
  public int getMaxSpeed() {
    return this.maxSpeed;
  }
  
  public int getSpeed() {
    return this.speed;
  }
  
  // Setters
  
  public void setPlateNo(String newPlateNo) {
    this.plateNo = newPlateNo;
  }
  
  public void setColour(String newColour) {
    this.colour = newColour;
  }
  
  // Methods
  
  public void accelerate(int increment) {
    this.speed += increment;
  }
  
  public void applyBrake(int decrement) {
    this.speed -= decrement;
  }
  
  /**
  * The printVehicleInfo method outputs the vehicle info.
  */
  public final void printVehicleInfo() {
    System.out.print("\nLicense Plate No.: " + plateNo);
    System.out.print("\nColour: " + colour);
    System.out.print("\nNo. of Doors: " + doorNo);
    System.out.print("\nMax. Speed: " + maxSpeed);
    System.out.print("\nCurrent Speed: " + speed);
  }
}