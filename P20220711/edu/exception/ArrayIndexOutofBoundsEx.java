package co.edu.exception;
/*1교시 4번째 예제
 * 배열의 크기를 벗어나서 저장 or 출력시 오류
 */

public class ArrayIndexOutofBoundsEx {

	public static void main(String[] args) {
		int[] intAry = new int[5];

		intAry[0] = 20;
		intAry[1] = 30;
//		intAry[5] = 50;	//배열 순서 오류남

		for (int i = 0; i <= intAry.length; i++) {
//			intAry[i] = (int) (Math.random() * 100) + 1;
			try {
				intAry[i] = (int) (Math.random() * 100) + 1;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 범위를 벗어났습니다");
			}
		}
		System.out.println("프로그램 종료.");
	}
}