package co.edu.emp;

import java.util.Scanner;

/*
 * 실행클래스.
 */
public class EmployeeApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		EmployeeList app = EmployeeList.getInstance();
		
		while (true) {
			System.out.println("1.초기화(사원수) 2.사원입력 3.리스트 4.상세조회 5.달력보기 9.종료 ");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == 1) {
				app.init(); // 사원수 지정 => 배열크기.
			} else if (selectNo == 2) {
				app.input();
			} else if (selectNo == 3) {
				app.printList();
			} else if (selectNo == 4) {
				app.search();
			} else if (selectNo == 5) {
				app.showCalender();
			}
				 else if (selectNo == 9) {
			
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}
}
