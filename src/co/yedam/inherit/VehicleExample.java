package co.yedam.inherit;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run(); // protected - 동일한 패키지 내에 있으면 default와 동일
		
		vehicle.stop(); // default
	}

}
