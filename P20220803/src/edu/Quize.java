package edu;

import java.util.Scanner;

public class Quize {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
				
		boolean run = true;
		int money = 0;
		int lottoNo[] = new int [6];
		
		while (run) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1.로또생성 2.로또조회 99.종료");
			int selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == 1 ) {
				System.out.println("금액을 투입해주세요>");
				money = Integer.parseInt(scn.nextLine());
				System.out.println("번호출력완료");
				System.out.println();
		} else if (selectNo == 2) {
			System.out.println("구입한 금액>" + money);
			int mm = money/1000;
			
			for (int a = 0; a <=mm; a++) {				
				for (int i =0; i<6; i++) {
					int randomNo = (int) (Math.random()*45)+1;
					
					//첫번째 값은 중복체크할 필요없음
					if(i>0) {
										//j =0, i번째까지
						for (int j = 0; j<i; j++) {
						//40,30,20 <- 배열에 들어있는 값
						//20<-randomNo
							if (lottoNo[j]==randomNo) {
								i -= 1;
								System.out.println("중복제거!");
								break;
							}else if {
								lottoNo[i] = randomNo;
							}
						}
					}else {
						lottoNo[i] = randomNo;						
						System.out.println(lottoNo[1]);
					}
				}
			}
					
				} else if (selectNo == 99) {
					System.out.println("시스템을 종료합니다.");
					run = false;
					break;
				}
			
			}			
		}
}	
//	}
//}
