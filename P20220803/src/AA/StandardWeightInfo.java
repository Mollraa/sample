package AA;

public class StandardWeightInfo extends Human{

	//필드
	
	//생성자
	public StandardWeightInfo (String name,double tall,double weight) {
		super(name, tall, weight);
	}

	
	//메소드
	@Override
	public void getInformation() {
		System.out.println("이름 : " + name + " 키 : " +  tall + 
				" 몸무게 : " + weight + 
				" 표준체중 : " + getStandardWeightInfo(tall));
	}
	
	public double getStandardWeightInfo (double tall) {
		return (tall - 100) * 0.9;		
	}

	
}
/* 비만도 80 미만
 * 80이상 90 미만
 * 90이상 110미만
 */
