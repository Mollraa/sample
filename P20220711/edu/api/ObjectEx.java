package co.edu.api;
/* 3교시 1번째 예제
 * 자바API _Object 클래스
 */
class Member /*extends Object*/{
	String id;
	int age;
	
	@Override // 자식 클래스의 equals 다시 정의. 문자열 값이 논리적으로 맞으면 True 뜨게 재정의
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {		//obj가 Member 타입의 인스턴스가 맞으면 {} 실행
		boolean b1 = this.id.equals(((Member)obj).id);
		boolean b2 = this.age == ((Member)obj).age;
		return b1 && b2;
		}
		
		return false;
	}
		
	@Override
	public String toString() {
		return "아이디 " + id + ", 나이 " + age; 
	}
}

public class ObjectEx {

	public static void main(String[] args) {
		
		Object obj1 = new Object(); // instance => 주소값.
		Object obj2 = new Object(); // instance => 주소값.
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.toString()); //object.toString() > 주소값 나옴
		
		String name1 = new String("홍길동"); //문자열이 오버라이딩 되어서 주소값이 아닌 문자열 비교 가능
		String name2 = new String("홍길동");
		
		System.out.println(name1.equals(name2)); 
		System.out.println(name1.toString()); //String.toString() >문자열 출력, 오버라이딩 됨
		
		Member member1 = new Member(); 
		member1.id = "user1";
		member1.age = 10;
		
		Member member2 = new Member();
		member2.id = "user1";
		member2.age = 10;
		
		System.out.println(member1.equals(member2)); //물리적 다른 개체. 논리적 동일한 값.
		System.out.println(member1.toString());
	}

}
