package co.yedam.person;

public class CarExample {
	public static void main(String[] args) {
		// sonata
		Car sonata = new Car("¼Ò³ªÅ¸", "SonataHybird", 2000, 200, new Tire());
		sonata.getCarName();
		sonata.getCarModel();
		sonata.getCarPrice();
		sonata.getMaxSpeed();
		sonata.getTire();
		
	}

}
