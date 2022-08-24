package co.edu.referece;

public class ArrayExample04 {
	public static void main(String[] args) {
		// A반 80, 85, 83
		// B반 79, 84, 90
		int[][] banAry = new int[2][3];
		banAry[0][0] = 80;
		banAry[0][1] = 85;
		banAry[0][2] = 83;
		banAry[1][0] = 79;
		banAry[1][1] = 84;
		banAry[1][2] = 90;

		int sum = 0;
		System.out.println();
		for (int i = 0; i < banAry[0].length; i++) {
			sum += banAry[0][i];
		}
		System.out.printf("A반 평균 %.1f 입니다. \n", (double) sum / banAry[0].length);

		// B반 평균
		sum = 0;
		for (int i = 0; i < banAry[1].length; i++) {
			sum += banAry[1][i];
		}
		System.out.printf("B반 평균 %.1f 입니다. \n", (double) sum / banAry[1].length);
	}
}
