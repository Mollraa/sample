package home;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		// ����) ������ Ű����κ��� �л����� �� �л����� ������ �Է¹޾Ƽ�, �ְ� ���� �� ��� ������ ���ϴ� ���α׷��Դϴ�.
		// �������� ����, �˸°� �ۼ��غ�����.
		// ������ó, �̰��� �ڹٴ� 183������ 9��

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------");
			System.out.println("����> ");
			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				System.out.println("�л� �� > ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "] : ");
					;
					int score = scanner.nextInt();
					scores[i] = score;
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
