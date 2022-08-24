
package AA;

public class ObesityInfo extends StandardWeightInfo {
	
	//필드
	
	//생성자
	
	public ObesityInfo(String name,double tall,double weight) {
		super(name, tall, weight);
	}

	//메소드
	

	public double getObesity(double weight,double tall) {
		return (weight-super.getStandardWeightInfo(tall))/super.getStandardWeightInfo(tall)*100;
		//( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )

	}
	@Override
	public void getInformation() {
		System.out.print("이름 : " + name + " 키 : " +  tall + 
				" 몸무게 : " + weight + 
				" 비만도 : " + getObesity(weight,tall));
	}
	
	

}