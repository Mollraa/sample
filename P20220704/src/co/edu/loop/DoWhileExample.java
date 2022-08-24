package co.edu.loop;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;
		while (isTrue) {
			System.out.println("입력>>");
			int inputVal = scn.nextInt();
			System.out.println("입력값은 " + inputVal);

			if (inputVal == 9) {
				System.out.println("반복문을 종료합니다.");
				isTrue = false;
			}
		}

		do {
			System.out.println("입력>>");

			int inputVal = scn.nextInt();
			System.out.println("입력값은 " + inputVal);

			if (inputVal == 9) {
				System.out.println("반복문을 종료합니다.");
				isTrue = false;
			} else {
				isTrue = true;
			}
		} while (isTrue);
		System.out.println("end of prog");
	}

}
