package co.edu.api;
/* 4번째 시간 책 예제풀기
 * P.495 문자열 추출하기
 * 문자열 잘라내기(substring())
 * 두 가지 형태로 사용 
 * 1)substring(int beginIndex, int EndIndex) > 주어진 시작과 끝 인덱스 사이의 문자열(시작,끝포함)
 * 2)substring(int beginIndex) > 주어진 인덱스부터 끝까지 문자열 추출(주어진 인덱스 포함)
 */

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	

	}

}
