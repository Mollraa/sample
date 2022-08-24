package co.edu.api;

import java.util.ArrayList;

/*6번째 시간 예제
 * Wrapper(포장) 클래스
 *  > 기본타입    byte, char, short,int,long,float,double,boolean
 *  > 포장 클래스  Byte, charactor, Short,Integer,Long,Float,Double,Boolean
 *  기본 타입의 값을 내부에 두고 포장, 이는 외부에서 변경 불가 
 *  변경 필요시 새로운 포장 객체 생성
 *  컬렉션 프레임 워크에서 기본 타입값 객체 생성, 관리 시 사용
 */

public class WrapperEx {
	public static void main(String[] args) {
		Integer i = new Integer("100"); 
		System.out.println(i);
		
		int i2 = 100;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100); // 100(int) => 100(Integer) 박싱.
		list.add(200); 
		list.add(new Integer(300));  // 줄 그음 deprecated 된거 차후사용중지.
		
		for(int num : list) { //integer 또는 int 모두 가능. 컬렉션
			System.out.println(num);
		}
		
		//문자열 => 숫자.
		int n1 = Integer.parseInt("1000");
		double n2 = Double.parseDouble("23.3");
		
	}

}
