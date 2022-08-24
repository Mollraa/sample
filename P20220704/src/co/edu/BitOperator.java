package co.edu;

public class BitOperator {
	public static void main(String[] args) {
		int num1 = 10;
		int result = ~num1; //-11
		result++;
		System.out.println(result);
		
		// 대입연산자 : =, +=, -=, *=, /= ...등등
		String names = "홍길동";
		names = names + " 김민수";
		names += " 박의식";
		
		System.out.println(names);
		

		result = result - 2;
		result -= 2;
		System.out.println(result);
		
		
	}
}
