package co.edu.referece;

public class Example01 {
	public static void main(String[] args) {
		// 1 ~ 100 수를 출력.
		// 짝수만 출력.
		// sum 누적.

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			// System.out.println(i);
			if (i % 2 != 0) {
				continue;
			} else {
				sum += i;
			}
			System.out.println(i);
		}

		System.out.println("합: " + sum);

	}
}
