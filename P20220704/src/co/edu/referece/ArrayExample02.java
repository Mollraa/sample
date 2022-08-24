package co.edu.referece;

public class ArrayExample02 {
	public static void main(String[] args) {
		int[] intAry = { 20, 27, 15, 33, 29 };
		// 배열의 크기: 5, intAry.length
//		for (int i = 0; i < intAry.length; i++) {
//			if (intAry[i] > 25) {
//				System.out.println("25보다 큰 수는: " + intAry[i]);
//				break;
//			}
			for (int i = 0; i < intAry.length; i++) {
				if (intAry[i] % 2 == 0) {
					System.out.println("짝수는: " + intAry[i]);
				} else {
					System.out.println("홀수는: " + intAry[i]);
				}
				break;
			}

			for (int i = 0; i < intAry.length; i++) {
				if (i % 2 == 0) {
					System.out.println("짝수값은: " + intAry[i]);
				}
				break;

			}
			intAry[2] = 30;
			int temp = intAry[0];
			intAry[0] = intAry[1];
			intAry[1] = temp;
			
			int sum =0;
			for (int i = 0; i < intAry.length; i++) {
				// if (i % 2 == 0 ) {
				//System.out.println(intAry[i]);
				//}
				sum += intAry[i];
			}
			System.out.println("합계 : " + sum);
		}
	}
