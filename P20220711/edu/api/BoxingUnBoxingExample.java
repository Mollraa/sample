package co.edu.api;
/* 6번째 시간 예제
 * p500. 기본 타입의 값을 박싱, 언박싱
 * Character 타입은 문자열 줄 경우 X
 * 언박싱하기 위해서 정적 valueOf() 메소드 사용
 * > 기본타입 이름+valueOf() 호출
 */
public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		//박싱
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = new Integer("300");
		
		//언박싱
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
