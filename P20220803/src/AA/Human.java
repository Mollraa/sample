package AA;

public class Human{	
	
	//필드
	String name;
	double tall;
	double weight;
	
	//생성자
	public Human () {}
	
	public Human (String name,double tall,double weight) {
		this.name = name;
		this.tall = tall;
		this.weight = weight;
	}
	
	//메소드
	public void getInformation() {
		System.out.printf("이름 : " + name + " 키 : " + tall + " 몸무게 : " + weight) ;
	}
	
}

