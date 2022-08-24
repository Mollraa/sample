package co.edu.referece;

public class ArrayExample03 {
	public static void main(String[] args) {
		// 배열선언
		int[] intAry = { 22, 33 };
		intAry = new int[] { 24, 56, 77, 43, 99 }; // 변수에 배열 재할당.
		int sum = 0;
		double avg = (double) sum / intAry.length;

		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
			avg = (double) sum / intAry.length;
		}
		System.out.printf("합계 %d, 평균 %.1f 입니다. \n", sum, avg);

		// 배열선언.
		int[][] nestAry = new int[2][3];
		nestAry[0][0] = 10;
		nestAry[0][2] = 30;
		nestAry[1][1] = 40;

		System.out.println("nestAry 첫번째 배열.");
		for (int i = 0; i < nestAry[0].length; i++) {
			System.out.println(nestAry[0][i]);
		}
		System.out.println("nestAry 두번째 배열.");
		for (int i = 0; i < nestAry[0].length; i++) {
			System.out.println(nestAry[1][i]);
		}
		
		nestAry = new int [][] {{1,2},{3,4,5},{6,7,8}} ;
		
		System.out.println("중첩배열.");
		for (int i = 0; i < nestAry.length; i++) {
			for (int j = 0; j < nestAry[i].length; j++) {
				System.out.println("("+i+", "+j+") => " + nestAry[i][j]);
			}
		}
		}
}
