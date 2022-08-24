package co.edu.api;
/*p.503 포장 객체 비교
 * 포장 객체는 내부의 값을 비교하기 위해 
 * 1) 직접 내부 값을 언박싱해서 비교,  2) .equals() 메소드로 내부 값을 비교.
 * <주의> == or !=로 비교할 경우, 객체의 참조 비교가 일어나 내부 값 비교X 
 * 언박싱한 값의 범위가 아래와 같으면 == or !=로 비교해도 TRUE  
 * [boolean : true,false / char : \u0000~\u0071 / byte, short, int : -128 ~ 127] 
 */

public class ValueCompareExample {

	public static void main(String[] args) {
	System.out.println("[-128~127 초과값일 경우"); //byte, short, int 타입 박싱된 값 범위
	Integer obj1 = 300;
	Integer obj2 = 300;
	System.out.println("=== 결과" + (obj1==obj2));
	System.out.println("언박싱 후 == 결과 " + obj1.equals(obj2));
	System.out.println();
	
	System.out.println("[-128 ~ 127 범위값의 경우");
	Integer obj3 = 10;
	Integer obj4 = 10;
	System.out.println("=== 결과 " + (obj3==obj4));
	System.out.println("언박싱후 == 결과 " +(obj3.intValue()==obj4.intValue())); // 언박싱: 기본타입+Value()
	System.out.println("equals() 결과 " + obj3.equals(obj4));
	}

}
