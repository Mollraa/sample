package co.edu.api;
/* 4번째 시간 책 예제풀기
 * P.494 문자열 대치하기
 * 문자열 대치(replace()) > 첫번째 매개값 문자열을 찾아서 두번째 매개값의 문자열로 대치한 새로운 문자열 생성
 * String객체의 문자열은 원래 변경이 불가능 > replace가 리턴하는 값은 새로운 문자열임
 */

public class StringReplaceExample {
public static void main(String[] args) {
	String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
	String newStr = oldStr.replace("자바","JAVA");
	System.out.println(oldStr);
	System.out.println(newStr);
}
}
