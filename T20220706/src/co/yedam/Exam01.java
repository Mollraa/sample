package co.yedam;

import java.util.Scanner;

/*
 * 문제1: 정수형 변수 num1, num2를 선언하세요.
 * 두변수에 각각 임의의 값을 저장을 한다면 두 수 중에서 큰수에서 작은 수를 뺀 결과를 result 변수에 대입하는 코드를 작성하세요.
 * 출력 예) 35 - 27 의 결과 8.
 */
public class Exam01 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int num1;
		int num2;
		
		System.out.println("첫번째 값을 입력.");
		num1 = scn.nextInt();
		
		System.out.println("두번째 값을 입력.");
		num2 = scn.nextInt();
		
		
		int result = 0;
		if (num1 > num2) {
				result = num1 - num2 ;
				System.out.printf( "입력값 %d와 %d의 차이는 %d 입니다. ", num1, num2, result);
			} else {
				result = num2 - num1 ;
				System.out.printf( "입력값 %d와 %d의 차이는 %d 입니다. ", num2, num1, result);
			}
		
	}
}
