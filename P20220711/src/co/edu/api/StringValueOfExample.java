package co.edu.api;
/* 4번째 시간 책 예제풀기
 * P.497 기본 타입 값을 문자열로 변환
 * 문자열 변환(valueOf())
 * 매개변수 타입별로 boolean b / char c /int i /long l/double d/float f 오버로딩 되어 있음
 */

public class StringValueOfExample {

	public static void main(String[] args) {
		String str1 = String.valueOf(10);   // int
		String str2 = String.valueOf(10.5); // double
		String str3 = String.valueOf(true); // boolean
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);


	}

}
