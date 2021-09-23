package co.yedam.inherit;
/*
 * Bus -> Vehicle, Taxi -> Vehicle
 * 
 */

public class DriverExample {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		Driver driver = new Driver();
		driver.drive(v); // Vehicle
		driver.drive(b);
		driver.drive(t);
	}

}
