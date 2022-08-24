package home;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {

		// �־��� �迭�� �̿��Ͽ� ���� ������ �����ϼ���.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };

		// ����1. �־��� �迭 �߿��� ���� 60�� ���� �ε����� ����غ���.
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 60) {
				System.out.println(i);
			}
		}

		// ����2. �־��� �迭�� �ε����� 3�� ���� ������� ����, �������� ����غ���.
		for (int i = 0; i < arr1.length; i++) {
			if (i == 3) {
				continue;
			}

			System.out.println("arr[" + i + "]: " + arr1[i]);
		}

		// ����3. �־��� �迭 ���� �����ϰ� ���� ���� �ε��� ��ȣ�� �Է¹޾�, �� ���� 1000���� �����غ���.
		// �Է�) �ε���: 3 -> {10, 20, 30, 1000, 3, 60, -3}
		Scanner scn = new Scanner(System.in);
		System.out.println("�ٲٰ� ���� �迭�� �ε��� ��ȣ�� �Է��ϼ���.");
		int choice = scn.nextInt();
		arr1[choice] = 1000;

		String msg = "";
		for (int i = 0; i < arr1.length; i++) {
			msg += arr1[i] + " ";
		}

		System.out.printf(msg);

		// ����4. �־��� �迭�� ��ҿ��� �ִ밪�� �ּҰ��� ���غ���.

		int max = arr1[0];
		for (int num : arr1) {
			if (num > max) {
				max = num;
			}
		}
		System.out.println(max);

		int min = arr1[0];
		for (int num : arr1) {
			if (num < min) {
				min = num;
			}
		}
		System.out.println(min);

		// ����5. ������ �迭�� �����Ͽ� ���� ���� 10���� �Է¹޾� �迭�� �����ϰ�, �迭�� �ִ� ���� �߿��� 3�� ����� ����غ���.
		System.out.print("���� ���� 10���� �Է��Ͻÿ� >> ");

		Scanner scn1 = new Scanner(System.in);
		int[] arry = new int[10];

		for (int i = 0; i < arry.length; i++) {
			arry[i] = scn1.nextInt();
		}

		for (int i = 0; i < arry.length; i++) {
			if (arry[i] % 3 == 0)
				System.out.print(arry[i] + " ");
		}
	}
}
