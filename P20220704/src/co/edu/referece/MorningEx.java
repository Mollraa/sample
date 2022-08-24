package co.edu.referece;

import java.util.Scanner;

public class MorningEx {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		double avg = 0;
		int max = 0;
		
		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scn.nextLine()); // nextInt()=>int , nextLine()=>String

			if (selectNo == 1) {
				System.out.print("학생수 > ");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];
				System.out.print("정상적으로 처리되었습니다.");

			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]");
					scores[i] = Integer.parseInt(scn.nextLine());
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]>" + scores[i] + "\n");
				}
			} else if (selectNo == 4) {
				for (int i = 0; i < scores.length; i++) {
					if( (scores[i] > max) )	// 배열의 첫번째 숫자거나 max보다 큰 경우
						max = scores[i];
					sum += scores[i];
					avg = (double) sum / scores.length;
				
				}
				System.out.println("분석 ");
				System.out.println("최고값 : " + max);
				System.out.printf("합: %d \n평균 : %.1f \n", sum, avg);
			
			} else if (selectNo == 5) {
				run = false;
			}

		}

		System.out.println("프로그램 종료");
	}
}
