package co.yedam.inheritance;

import co.yedam.inherit.Vehicle;

public class Bus extends Vehicle {
	
	public Bus() {
		super("msg");
	}
	
	@Override
	protected void run() { // 상속의 관계에 있을 때는 패키지가 달라도 가능
		System.out.println("버스가 달립니다.");
	}

	@Override
	public void stop() {
		super.stop();
	}
	
	
}
