/**
 * SportsCar class extending Car class
 */
package JavaOOPS;

/**
 * @author yerras
 *
 */
class SportsCar extends Car {
	
	double maxSpeed=0;

	public SportsCar(int i_NumberOfSeats, double d_MaxSpeed ) {
		super(i_NumberOfSeats);
		// TODO Auto-generated constructor stub
		maxSpeed=d_MaxSpeed;
	}
	
	@Override
	public void setLicensePlate(String license){
		this.licensePlate=license.toLowerCase();
	}
	
	@Override
	public String toString() {
		return super.toString() + ". Its max speed is "+maxSpeed;
	}

}
