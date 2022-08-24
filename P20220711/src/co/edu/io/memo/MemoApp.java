package co.edu.io.memo;

import java.util.Scanner;

public class MemoApp {
	public static void main(String[] args) {
		// MemoManager 기능 구현
		MemoManager memoApp = MemoManager.getInstance(); // 정적 메소드로 선언.(MemoManager에서 인스턴스로 가져옴)
															// [ new MemoManager] 으로 할 경우 private 때문에 접근 X
		Scanner scn = new Scanner(System.in);
		int selectNo;
		boolean run = true;

		while (run) { // 참일 경우 반복됨
			System.out.println("1. 등록 | 2. 검색 | 3. 삭제 | 4. 종료 ");
			System.out.println("메뉴 선택 >>>>");
			selectNo = Integer.parseInt(scn.nextLine());

			switch (selectNo) {
			case 1:
				memoApp.inputDate();
				break;
			case 2:
				memoApp.seearch();
				break;
			case 3:
				memoApp.deleteDate();
				break;
			case 4:
				memoApp.storeToFile();
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
	}
}
