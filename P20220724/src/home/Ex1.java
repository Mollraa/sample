package home;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {

		// 주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };

		// 문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 60) {
				System.out.println(i);
			}
		}

		// 문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		for (int i = 0; i < arr1.length; i++) {
			if (i == 3) {
				continue;
			}

			System.out.println("arr[" + i + "]: " + arr1[i]);
		}

		// 문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
		// 입력) 인덱스: 3 -> {10, 20, 30, 1000, 3, 60, -3}
		Scanner scn = new Scanner(System.in);
		System.out.println("바꾸고 싶은 배열의 인덱스 번호를 입력하세요.");
		int choice = scn.nextInt();
		arr1[choice] = 1000;

		String msg = "";
		for (int i = 0; i < arr1.length; i++) {
			msg += arr1[i] + " ";
		}

		System.out.printf(msg);

		// 문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자.

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

		// 문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		System.out.print("양의 정수 10개를 입력하시오 >> ");

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
