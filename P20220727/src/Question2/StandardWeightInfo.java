package Question2;
/*		- Human Ŭ������ ����Ѵ�.
		- �޼ҵ�� ������ ���� �����Ѵ�.
		(1) public void getInformation() : �̸�, Ű, �����Կ� ǥ��ü���� ����ϴ� ���
		(2) public double getStandardWeight() : ǥ��ü���� ���ϴ� ���
		( * ǥ�� ü�� : (Height - 100) * 0.9 )
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
