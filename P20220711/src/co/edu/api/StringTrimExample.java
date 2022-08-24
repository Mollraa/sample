package co.edu.api;
/* 4번째 시간 책 예제풀기
 * P.497 문자열 앞뒤 공백제거
 * 문자열 앞뒤 공백 잘라내기(trim())
 * 앞뒤 공백 제거 후 새로운 문자열 리턴, 중간 공백은 제거X
 */

public class StringTrimExample {

	public static void main(String[] args) {
		String tel1 = " 02";
		String tel2 = "123 ";
		String tel3 = "   1234   ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);

	}

}
