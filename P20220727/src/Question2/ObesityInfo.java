package Question2;
//- StandardWeightInfo 클래스를 상속한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름, 키, 몸무게와 비만도를 출력하는 기능
//(2) public double getObesity() : 비만도를 구하는 기능
//( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )
public class ObesityInfo extends StandardWeightInfo {
	
	public static void main(String[] args) {
		Human aa = new Human();
		
		aa.setName("홍길동");
		aa.setHeight(168);
		aa.setWeight(45);
		aa.getStandarweight();
		
				
		Human bb = new Human();
		
		bb.setName("박둘이");
		bb.setHeight(168);
		bb.setWeight(90);
		
		System.out.println(aa.getName()+"님의 신장 "+ aa.getHeight()+", 몸무게 "+ aa.getWeight() + ", 표준체중" + );
		
	}

	public ObesityInfo(double standarweight) {
		super(standarweight);
		// TODO Auto-generated constructor stub
	}
	
	private double Obesity;

	public double getObesity() {
		return Obesity;
	}

	public void setObesity(double obesity) {
		Obesity = obesity;
	}

	@Override
	public double getStandarweight() {
		return (getHeight() - 100) * 0.9 ;
	}

	@Override
	public void getInformation() {
		System.out.println(getName() + getHeight() + getWeight() + getStandarweight() + Obesity);
	}
	
	
	

}
