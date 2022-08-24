package co.edu.exception;
/*1교시 5번째 예제
 * 다중 catch
 */

import java.util.Scanner;

public class MultiCatchEx {
	public static void main(String[] args) {

		int[] intAry = new int[2];
		Scanner scn = new Scanner(System.in);
	
		System.out.println("숫자를 입력하세요 >>>");
		
		
		

		try {
			intAry[0] = (int) (Math.random() * 100) + 1;
			intAry[2] = (int) (Math.random() * 100) + 1;		
			intAry[1] = Integer.parseInt(scn.nextLine());//문자열 숫자 -> 숫자
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 초과함");

		} catch (NumberFormatException e1) {
			System.out.println("숫자를 입력하세요");
		} catch (Exception e2) {
			System.out.println("알 수 없는 예외.");
		}
		
		System.out.println("프로그램 종료");

	}

}
