package Question2;
//- StandardWeightInfo Ŭ������ ����Ѵ�.
//- �޼ҵ�� ������ ���� �����Ѵ�.
//(1) public void getInformation() : �̸�, Ű, �����Կ� �񸸵��� ����ϴ� ���
//(2) public double getObesity() : �񸸵��� ���ϴ� ���
//( * �񸸵� : (Weight - ǥ�� ü��)/ǥ��ü�� * 100 )
public class ObesityInfo extends StandardWeightInfo {
	
	public static void main(String[] args) {
		Human aa = new Human();
		
		aa.setName("ȫ�浿");
		aa.setHeight(168);
		aa.setWeight(45);
		aa.getStandarweight();
		
				
		Human bb = new Human();
		
		bb.setName("�ڵ���");
		bb.setHeight(168);
		bb.setWeight(90);
		
		System.out.println(aa.getName()+"���� ���� "+ aa.getHeight()+", ������ "+ aa.getWeight() + ", ǥ��ü��" + );
		
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
