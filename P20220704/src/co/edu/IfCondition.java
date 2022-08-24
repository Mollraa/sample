package co.edu;

public class IfCondition {
	public static void main(String[] args) {
		int num = 6;
		
		//if ~ else
		if(num % 2 ==0) {
			System.out.println(num + "은 짝수입니다.");			
		} else {
			System.out.println(num + "은 홀수입니다.");
		}
		
		// if ~ else if ~ else
//		if(num%2==0 && num%3==0) {
//			System.out.println("2와 3의 배수입니다.");			
//		}
		
		if(num % 2 == 0 && num % 3 == 0) {
			System.out.println("2와 3의 배수입니다.");
		} else if (num % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else if(num % 2 == 0) {
			System.out.println("2의배수입니다."); 
		} else {
			System.out.println("2 또는 3의 배수가 아닙니다.");
		}
		
		int score = 80;
		String grade = "";
		// 100 ~ 90 => A, 89 ~ 80 => B, 79~70 => C 그외 D
		if (score >= 90 && score <= 100) {
			grade = "A";
		} else if(score >= 80 /*&& score <= 89*/) {
			grade = "B";
		} else if(score >= 70 /*&& score <=79*/) {
			grade = "C";
		} else {
			grade = "D";
		}
		System.out.println(score + "는" + grade + "입니다.");
	}
}
