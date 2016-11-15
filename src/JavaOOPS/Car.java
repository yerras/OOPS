/**
 * Car class extends Vehicle (which is the super class) 
 */
package JavaOOPS;

/**
 * @author yerras
 *
 */
class Car extends Vehicle {
	
	protected int numberOfSeats=0;
	
	public Car(int i_NumberOfSeats){
		
		super();
		
		numberOfSeats=i_NumberOfSeats;
	}
	
	public void setLicensePlate(String license){
		super.setLicensePlate(license);

	}
	
	public String toString() {
		return "The car has "+numberOfSeats+" seats. Its license plate is "+licensePlate;
	}
	
	public int getNumberOfSeats() {
		return this.numberOfSeats;
	}
}
