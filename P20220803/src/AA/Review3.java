package AA;

public class Review3 {
	public static void main(String[] args) {
		Human h1 = new StandardWeightInfo("홍길동", 168, 45);
		h1.getInformation();
		Human h2 = new ObesityInfo("박둘이", 168, 90);
		h2.getInformation();
	}
}
