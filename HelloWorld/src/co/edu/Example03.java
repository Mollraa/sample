package co.edu;
/*
 * 문자열 타입의 변수 사용.
 */

public class Example03 {
	public static void main(String[] args) {
		// 10+20 => 30, "10" + "20" => "1020"
		System.out.println(10 + 20);
		System.out.println("10" + "20");

		// 내 이름은 "홍길동" 입니다.
		//교재 p66
		System.out.println("내 이름은 \"정다슬\" 입니다.");
		//{"name":"홍길동","age":20} json데이터타입.
		System.out.println("{\"name\":\"홍길동\",\"age\":20}");
		
		//문자열 ->정수,실수.
		int num1 = Integer.parseInt("100"); // "100" -> 100
		double num2 = Double.parseDouble("127.99");
		double num3 = Double.parseDouble("122.01");
	
		double result = sum(num1, num2);
		result = minus(num2, num3);
		System.out.println("합결과: " + result);
		System.out.printf("\n차이는 %.2f 입니다.\n", result);
		
		System.out.printf("\n저의 이름은 %s이고 나이는 %d 입니다.", "홍길동", 14);
		
		// 이름, 나이, 몸무게(소수점) => 3개의 변수 선언.
		// 나의 이름은 홍길동이고
		// 나이는 16이고
		// 몸무게는 65.4 입니다.
		
		String name = "홍길동";
		int age = 16;
		double weight = 65.4;
		
		System.out.printf("\n나의 이름은 %s이고 \n나이는 %d 이고 \n몸무게는 %.1f 입니다.", name, age, weight);
		
		
		}
	
	// 2개의 숫자를 합한 결과를 반환. method.
	public static int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public static double sum(int n1, double n2) {
		double sum = n1 + n2;
		return sum;
	}
	
	public static double minus(double n1, double n2) {
		double sum = n1 - n2;
		return sum;
	}
}
