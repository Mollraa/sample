package co.edu.loop;

public class ForExample {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
				System.out.println("i의 값: " + i + ", sum의 값: " + sum);
			}
		}
		System.out.println("짝수 합: " + sum);

		// 1 ~10까지 result => 누적.
		// 1, 4, 7, 10 => 누적.
		int result = 0;
		for (int i = 1; i <= 10; i++) {
			result += i;
		}
		System.out.println("1~10까지 누적 합: " + result);

		
		// 1, 3, 5, 7, 9 => 누적.
		for (int i = 1; i <= 10; i ++) {
			if (i % 2 == 1) {
				result += i;
				}
		}
			System.out.println("1, 3, 5, 7, 9의 누적 합: " + result);
		
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				result += i;
				System.out.println("1, 4, 7, 10의 누적 합: " + result);
			}
		}

//		for (int i = 1; i <= 5; i++) {
//			int sum0 = 0;
//			sum0 = sum0 + 1;
//			sum0 = sum0 + 2;
//			sum0 = sum0 + 3;
//			sum0 = sum0 + 4;
//			sum0 = sum0 + 5;
//		System.out.println("결과값: " + sum0);
//		}

	}
}
