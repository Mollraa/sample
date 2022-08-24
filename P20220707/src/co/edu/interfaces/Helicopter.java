package co.edu.interfaces;
/*
 * Flyer 인터페이스를 구현하는 클래스.
 */
public class Helicopter implements Flyer{

	@Override
	public void takeOff() {
		System.out.println("헬리콥터가 이륙합니다.");
		
	}

	@Override
	public void fly() {
		System.out.println("헬리콥터가 비행합니다.");
		
	}

	@Override
	public void land() {
		System.out.println("헬리콥터가 착륙합니다.");
		
	}

}
