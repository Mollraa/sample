package home;

import java.util.Scanner;

public class work {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// ����1) ���ʴ�� x�� y�� ���� �־����� �� ��� ��и鿡 �ش�Ǵ��� ����ϵ��� �����ϼ���.
		// �� ��и鿡 �ش� �ϴ� x�� y�� ���� �Ʒ��� �����ϼ���.
		// ��1��и� : x>0, y>0
		// ��2��и� : x<0, y>0
		// ��3��и� : x<0, y<0
		// ��4��и� : x>0, y<0
		// ������ó, ����(https://www.acmicpc.net/) 14681�� ����
		
		System.out.println("x�� y��0�� �ƴ� �Ǽ��� �����ϼ���");
		System.out.println("x>");
		int x = scanner.nextInt();
		System.out.println("y>");
		int y = scanner.nextInt();

		
		if( x > 0) {
			if (y > 0 ) {
				System.out.println("�� 1��и�");
			} else {
				System.out.println("�� 4��и�");
			} 
		} else if ( x<0 ) {
			if( y >0) {
			System.out.println("�� 2��и�");
			} else {
			System.out.println("�� 3��и�");
			}
		} else {
			System.out.println( " 0 �̿��� �Ǽ��� �����ϼ���.");
		}
	
		


		// ����2) ������ �־����� �� �ش� �⵵�� ���������� Ȯ���ؼ� ����ϵ��� �ϼ���.
				// ������ ������ 4�� ����̸鼭 100�� ����� �ƴ� �� �Ǵ� 400�� ����϶��Դϴ�.
				// ���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̸�,
				// 1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴմϴ�.
				// HiNT : ���� IF�� ���
				// ������ó, ����(https://www.acmicpc.net/) 2753�� ����
		
		
		System.out.println("������ �Է��ϼ���. > ");
		int year = scanner.nextInt();
		
		if( year % 4 == 0 ) {
			if(year % 100 != 0) {
				System.out.println("�����Դϴ�.");
			} else if (year % 400 == 0) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("������ �ƴմϴ�.");
			}
		} else {
			System.out.println("������ �ƴմϴ�.");
		}
	
		

		// ����3) switch���� �̿��Ͽ� ����, ����, �� �� �ϳ��� �־����� �� ����� � ���� ������ �̱� �� �ִ� ���� ����ϵ���
		// �����ϼ���.
		// ���� ���, ������ �־����� �� "�̱�� ���ؼ� ������ �����մϴ�." ��� ����ϵ��� �ϼ���.
		// �� �ܾ �Է¹��� ��� Scanner��ü�� next() �Լ��� ����ϸ� �˴ϴ�.

		System.out.println("����, ����, ��! ���� ���� > ");
		String a = scanner.next();
		
		switch(a) {
		case "����" :
			System.out.println("�̱�� ���ؼ� ������ �����մϴ�.");
			break;
		case "����" :
			System.out.println("�̱�� ���ؼ� ���� �����մϴ�.");
			break;
		case "��" :
			System.out.println("�̱�� ���ؼ� ������ �����մϴ�.");
			break;
		default :
			System.out.println("�̱�� ���ؼ� ���� ���� ���� �ؾ��մϴ�.");
			break;
		}
		
		
		// ����4) for���� "*"�� �̿��Ͽ� �Ʒ��� ���� ����ϵ��� �ϼ���.
		// *
		// **
		// ***
		// ****
		// *****
		
		for (int i=1; i<6; i++) {
			for (int j=1; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// ����5) ���ʴ�� m�� n�� �Է¹޾� m���� n��°���� ����ϵ��� �ϼ���.
		// ���� ��� 2�� 3�� �Է¹޾��� ��� �Ʒ�ó�� ����մϴ�.
		// 2 X 1 = 2
		// 2 X 2 = 4
		// 2 X 3 = 6
		System.out.print("����ϰ� ���� ���� �Է��ϼ���> ");
		int m = scanner.nextInt();
		System.out.print("���ϴ� ������ �Է��ϼ���> ");
		int n = scanner.nextInt();
		int z = n;

		for (n = 1; n <= z; n++) {
			System.out.println(m + " x " + n + " = " + (m * n));
			
		}

	}
}
