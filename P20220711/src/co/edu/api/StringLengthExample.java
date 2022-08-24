package co.edu.api;
/* 4번째 시간 책 예제풀기
 * P.492 문자열의 문자 수 얻기
 * 문자열 길이(length())_공백을 포함하여 카운트
 * 예) "자바 프로그래밍"의 경우 총 8개
 *      --------
 */

public class StringLengthExample {
	public static void main(String[] args) {
		String ssn = "7306241230123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}
	}

}
