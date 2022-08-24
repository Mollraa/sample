package com.yedam.review;

public class StandardWeightInfo extends Human {
	/*2) StandardWeightInfo 클래스를 정의한다.
	- Human 클래스를 상속한다.
	- 메소드는 다음과 같이 정의한다.
	(1) public void getInformation() : 이름, 키, 몸무게와 표준체중을 출력하는 기능
	(2) public double getStandardWeight() : 표준체중을 구하는 기능
	( * 표준 체중 : (Height - 100) * 0.9 )*/
	
	//필드
	
	//생성자
	public StandardWeightInfo(String name, double tall, double weight) {
		super(name, tall, weight);
	}
	//메소드

	@Override
	public void getInformation() {
		System.out.println("이름 : " + name + " 키 : " + tall + 
				" 몸무게 : " + weight +
				" 표준체중 : " + getStandardWeight(tall));
	}
	
	public double getStandardWeight(double height) {
		
		return (height - 100) * 0.9;
		
	}
	
	
}
