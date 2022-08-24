package co.edu.api;
/* 4번째 시간 책 예제풀기
 * P.496 전부 소문자 or 대문자 변경
 * 알파벳 소.대문자 변경(toLowerCase(), toUpperCase())
 * 두 메소드를 사용하여도 기존의 문자열이 변경된 것은 x 새로운 힙영역 생긴것(새로운 문자열)
 * equalsIgnoreCase() 이용하면 대소문자 맞추지 않아도 문자열 비교 가능
 * equal() 사용시 동일 문자열을 대문자 또는 소문자로 통일해야함
 */

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 =str1.toLowerCase();
		String lowerStr2 =str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2)); //소문자 통일하여 eqaul 사용 가능
		
		System.out.println(str1.equalsIgnoreCase(str2));
		

	}

}
