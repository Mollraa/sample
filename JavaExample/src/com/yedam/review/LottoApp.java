package com.yedam.review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoApp {

	Scanner sc = new Scanner(System.in);

	int menu = 0;

	List<int[]> list = new ArrayList<>();

	public LottoApp() {
		run();
	}
	//캡슐화,정보은닉
	private void run() {

		while (menu != 99) {
			
			//메뉴 출력하는 메소드 호출
			menuInfo();
			
			menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				makeLotto();
				break;
			case 2:
				showInfo();
				break;

			case 99:
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

	private void menuInfo() {
		System.out.println("메뉴를 선택해주세요.\n");
		System.out.println("1. 로또생성 2. 로또조회 99. 프로그램 종료");
	}

	private void makeLotto() {
		
		System.out.println("금액을 투입해주세요.");
		
		int money;
		
		money = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < (money / 1000); i++) {
			list.add(makeNumber());
		}
		
		System.out.println("번호 출력 완료\n");
	}

	private void showInfo() {
		
		System.out.println("구매 한 금액> " + (list.size() * 1000) + "원");
		
		for (int i = 0; i < list.size(); i++) {
			// 1번, 2번
			System.out.print((i % 5 + 1) + "번>");
			// 로또 번호 출력
			for (int j = 0; j < 6; j++) {
				System.out.print(list.get(i)[j] + " ");
			}
			
			System.out.println();
			//&&, &
			               // i=0, i % 5 == 0
			if ((i+1) % 5 == 0) {
				System.out.println("-------------------------------------");
			}
		}
	}

	private int[] makeNumber() {
		
		int[] lottoNo = new int[6];

		for (int i = 0; i < 6; i++) {
			
			//int randomNo = (int) (Math.random() * 45) + 1;
			lottoNo[i] = (int) (Math.random() * 45) + 1;
			//i = 0 ->첫번째 값은 중복체크 할 필요 없음.
			//ex)i = 4
			if (i > 0) { // if문이 없어도 기능함
			   // i = 1, j = 0
				//ex)j = 0~3, i =4
				//lottoNo[0] <=비교=>lottoNo[4]
				//lottoNo[1] <=비교=>lottoNo[4]
				//lottoNo[2] <=비교=>lottoNo[4]
				//lottoNo[3] <=비교=>lottoNo[4]
				//중복 비교 이후 lottoNo[3] -> lottoNo[4]의 자리로가서 데이터를 덮어받게됨
				for (int j = 0; j < i; j++) {
				//40, 30, 20 <-배열에 들어있는 값
				//20 <- randomNo
					//i=2
					if (lottoNo[j] == lottoNo[i]) {
						i -= 1;
						System.out.println("중복제거!");
						break;
					}
				}
			}
		}
		
		return lottoNo;
	}
}
