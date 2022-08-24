package co.edu.api;
/*6번째 시간 예제
 * P.501 자동 박싱과 언박싱
 * 자동 박싱 > 포장클래스 타입에 기본값 대입될 경우 
 *   예) int 타입값 Integer 클래스 변수 대입 >>> 힙 영역에 Integer 객체 생성
 * 자동 언박싱> 기본 타입에 포장 객체가 되는 경우와 연산 
 *   예) Integer 객체를 int타입 변수에 대입 or Integer 객체와 int 값 연산. >>> Integer 객체로 부터 int 값 자동 언박싱
 */

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		// 자동 박싱
		Integer obj = 100;
		System.out.println("Value : " + obj.intValue());
		
		//대입 시 자동 언박싱
		int value = obj;
		System.out.println("Value : "+value);
		
		//연산 시 자동 언박싱
		int result = obj + 100 ;
		System.out.println("result : " + result);

	}

}
