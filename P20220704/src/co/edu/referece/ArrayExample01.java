package co.edu.referece;

public class ArrayExample01 {
	public static void main(String[] args) {
		// 배열의 저장공간 선언.
		int[] intAry = new int[10]; // 저장공간 10개인 객체. byte,short,int,long=>0
		intAry[0] = 10; // 첫번째 위치 10값을 할당.
		intAry[4] = 50;
//		System.out.println(intAry.length);
		for (int i = 0; i < 10; i++) {
			System.out.println(intAry[i]);
		}
		
		double[] dblAry = new double[5]; // double 형 공간 5개 선언.
		for (int i = 0; i < dblAry.length; i++ ) {
			System.out.println(dblAry[i]);
		}
		
		boolean[] boolAry = new boolean[3]; //boolean 형 초기값 false
		boolAry[1] = true;
//		boolAry[2]="true"; // boolAry에는 boolean형 대입.
		for (int i = 0; i < boolAry.length; i++) {
			System.out.println(boolAry[i]);
		}
		String[] strAry = {"홍길동", "김민수", "허민기"}; // 3개 값을 할당.
	//	strAry[3] = "황경영";//실행오류 발생.
		strAry[2] = "황경영";
		for(int i=0; i<strAry.length; i++) {
			System.out.println(strAry[i]);
		}
		
	}
}
