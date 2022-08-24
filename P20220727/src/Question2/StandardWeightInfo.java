package Question2;
/*		- Human 클래스를 상속한다.
		- 메소드는 다음과 같이 정의한다.
		(1) public void getInformation() : 이름, 키, 몸무게와 표준체중을 출력하는 기능
		(2) public double getStandardWeight() : 표준체중을 구하는 기능
		( * 표준 체중 : (Height - 100) * 0.9 )
 * 
 */
public class StandardWeightInfo extends Human{

		private double standarweight;
		
		public StandardWeightInfo (double standarweight) {
			this.standarweight = standarweight;
		}

		public double getStandarweight() {
			return (getHeight() - 100) * 0.9 ;
		}

		@Override
		public void getInformation() {
			System.out.println(getName() + getHeight() + getWeight() + standarweight);
		}
		
}
