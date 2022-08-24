package co.edu.loop;

import java.util.Scanner;

public class p161 {

	public static void main(String[] args) {

		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");

			int menu = scanner.nextInt();
			if (menu == 1) {
				System.out.print("예금액>");
				int amt = scanner.nextInt();
				balance += amt;
				break;
			}

			else if (menu == 2) {
				System.out.print("출금액>");
				int amt = scanner.nextInt();
				balance -= amt;
				break;
			} else if (menu == 3) {
				System.out.println("현재 잔액은 : " + balance);
				break;
			} else if (menu == 4) {
				break;
			}
			System.out.println();
		}
		System.out.println("\n프로그램 종료");
	}
}
