package co.edu.collect;
/* 2교시 1번째 예제 제네릭
 * 제네릭 : 타입을 클래스 정의하는 시점이 아니라 사용하는 시점에 지정
 * 컬렉션 : 객체 추가, 삭제,검색할 수 있도록 인터페이스와 구현 클래스 제공함
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//ArrayList에 담을 값은 String이라는 뜻
		
		list.add("사과");
		list.add("100");
		
		for(int i =0; i<list.size(); i++) {
			String result = (String) list.get(i);
			System.out.println(result);
		}
		
		// List 컬렉션. List (인터페이스) => ArrayList, LinkedList, Vector
		List<String>sList = new ArrayList<String>();
		sList.add("홍길동");
		sList.add("김민기");
		String result = sList.get(1); // 값을 읽어올 때.
		sList.remove(0); // 값을 삭제 >> 홍길동이 삭제되고 김민기가 인덱스 0번으로 이동됨
		sList.set(0, "황길동"); // 값을 변경. >> 김민기 -> 황길동으로 변경
		sList.add("홍길동");
		sList.add("홍길동");
		sList.add("홍길동");
		
		

		
		
		Iterator<String> iter = sList.iterator(); // 반복자 생성
		while(iter.hasNext()) {	//  .hasNext : 요소의 존재 여부를 체크하는 메소드
			String val = iter.next();
			System.out.println(val);
		}
		
		//index 기반으로 요소를 저장 
		for (int i =0; i < sList.size(); i++) {
			System.out.println(sList.get(i));
		}
		
		// 확장 for구문.
		for(String val : sList) {
			System.out.println(val);
		}

		
	}

}
