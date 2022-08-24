package co.edu.api;
/* 4번째 시간 책 예제풀기
 * P.492 문자열 포함 여부 조사
 * 문자열 찾기(indexOf())_인덱스는 0부터 시작함 
 */

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("자바")!= -1) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련없는 책이군요.");
		}

	}

}
