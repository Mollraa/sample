package co.edu;

import java.util.Scanner;

/*1교시 예제
 * 과일 배열이 입력한 값과 일치되는지
 */

public class MorningEx {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);	
		String[] fruits = {"딸기","바나나","오렌지","파인애플"};
		
		boolean isExist = false;		
		
		
		System.out.println("과일을 입력하세요! >> ");
		String fruit = scn.nextLine();
		for(int i=0;i<fruits.length; i++) {
			if(fruits[i].equals(fruit)) {
				System.out.println((i+1)+"번째 위치.");
				break;
			}
		}
		
		if(!isExist) {
		System.out.println("찾는 과일이 없습니다.");

	}

}
}
