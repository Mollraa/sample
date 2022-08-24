package co.edu.loop;

import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		// while 반복문의 종료조건.
		// 1 ~ 100까지의 임의의 수를 생성.

		Scanner scn = new Scanner(System.in);

		int temp = (int) (Math.random() * 100) + 1;
		while (true) {
			System.out.println("입력>>");
			int inputVal = scn.nextInt();

			if (inputVal == temp) {
				System.out.println("맞췄습니다.");
				break;
			} else if (inputVal > temp) {
				System.out.println("입력한 수가 더 큽니다.");
			} else if (inputVal < temp) {
				System.out.println("입력한 수가 더 작습니다.");
			}
		}
		System.out.println("end of prog.");
	}
}
