package co.edu;

public class Example01 {
	public static void main(String[] args) {
		String name = " 신짱구 ";
		int age = 5;
		double height = 99.9;
		
		System.out.println("이름은 " + name + "이고, 나이는 " + age + "살이고, 키는 " + height + "cm 입니다." );
		
		boolean a1 = true;
		
		int Age = 8;
		
		a1 = age < Age;
		if (a1) {
				System.out.println("유치원을 다니고 있습니다.");
		} else {
				System.out.println("유치원을 다니고 있지않습니다.");
		}
		
		// float, double : double default.
		float f1 = 23.4f; //4byte
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		double d1 = 23.4; //8byte
		
		//0~10 정수
		//0~1 실수
		double result = 1.1 + 2.2;
		System.out.println(result);
		
		//long(8byte) float(4byte);
		float sum = 2345L + 22.3F;
		
	}
}
