package co.edu.loop;

public class Example01 {
	public static void main(String[] args) {

		// (for문)10번 반복.
		// num 변수 <= 1 ~ 10 까지의 임의 정수. Math.random();
		// sum 변수 <= 2의 배수.
		// 2의 배수의 합:22??

//		int num, sum;
//		sum = 0;
		
//		for (int i = 1; i <= 10; i++) {
		
//			num = (int) (Math.random() * 10) + 1;
//			if (num % 2 == 0 || num % 3 == 0) {
//				sum += num;
//				System.out.println(num + "," + sum);
//			} // else if ( num % 3 == 0 ) {
				//sum += num;
			//System.out.println(num + "," + sum);
//		}
//		System.out.println("2 또는 3 의 배수의 합" + sum);
		
		int num, sum2, sum3;
		sum2 = 0;
		sum3 = 0;
		
		for (int i = 1; i <= 10; i++) {
		
			num = (int) (Math.random() * 10) + 1;
			if (num % 2 == 0) {
				sum2 += num;
			}
			if (num % 3 == 0) {
				sum3 += num;
			}
		}
		System.out.println("2 의 배수의 합계: " + sum2);
		System.out.println("3 의 배수의 합계: " + sum3);

	}
}
