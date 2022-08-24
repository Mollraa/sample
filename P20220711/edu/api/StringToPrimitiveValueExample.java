package co.edu.api;
/* 6번째 시간 예제
 * P.502 문자열을 기본 타입 값으로 변환
 * 포장 클래스 > 문자열을 기본 타입 값으로 변환
 * 형식> parse+기본 타입 이름  (예) int num = Integer.parseInt("1000");
 * (정적static 메소드_문자열을 매개값으로 받아 변환)
 */

public class StringToPrimitiveValueExample {

	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1 : " +value1);
		System.out.println("value2 : " +value2);
		System.out.println("value3 : " +value3);

	}

}
