package home;

import java.util.Scanner;

public class work {
	public static void main(String[] args) {
		// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		
		
		// 1) 메뉴는 다음과 같이 구성하세요.
		
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		//	출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.


		boolean run = true;
		int[] goodsprice = null;
		String[] goodsname = null;
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("메뉴를 선택하세요> ");
			int selectNo = Integer.parseInt(scn.nextLine());

			switch (selectNo) {
			case 1:
				System.out.println("상품 수를 입력하세요 > ");
				int goodsnum= scn.nextInt();
				goodsprice = new int[goodsnum];
				goodsname  = new String[goodsnum];
				break;
			case 2:
				for (int i = 0; i < goodsnum; i++) {
					System.out.println("상품의 이름을 입력하세요");
					String goodsname2 = scn.nextLine();
					goodsname[i] = goodsname2;
				}
				break;
			case 3:
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}

				break;
			case 4:
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				for (int i = 0; i < studentNum; i++) {
					sum += scores[i];
					if (scores[i] > max) {
						max = scores[i];
					}
				}
				avg = (double) sum / studentNum;
				System.out.println("�ְ� ���� : " + max);
				System.out.println("��� ���� : " + avg);
				break;
			case 5:
				System.out.println("���α׷� ����");
				return;
			}

		}

	
		
		

	}

}
