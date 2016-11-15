/**
 * Main test method which uses all the methods and variables from the inherited classes
 */
package JavaOOPS;

/**
 * @author yerras
 *
 */
public class VehicleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car personalCar = new Car(4);
		personalCar.setLicensePlate("PERSONAL-SY4");
		System.out.println(personalCar);
		SportsCar sc= new SportsCar(2,236);
		sc.setLicensePlate("SPORTS-SY22Z");
		System.out.println(sc);
	}

}
