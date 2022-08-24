package co.edu.interfaces;

public class Airplane implements Flyer{

	@Override
	public void takeOff() {
		System.out.println("비행기가 이륙합니다.");
		
	}

	@Override
	public void fly() {
		System.out.println("비행기가 비행합니다.");
		
	}

	@Override
	public void land() {
		System.out.println("비행기가 착륙합니다.");
		
	}

}
