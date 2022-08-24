package co.edu.collect.generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*2번째 시간 3번째 예제
 * Set (인터페이스) => HashSet, TreeSet
 */

public class Hashset {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("사과");
		set.add("딸기");
		set.add("수박");
		set.add("딸기");
		System.out.println("크기 : " + set.size()); // 중복값 제거O

		set.remove("딸기");
		System.out.println(set.contains("딸기")); // 요소를 찾고 싶을 때 사용

		if (set.isEmpty()) {
			System.out.println("컬렉션이 비어있음");
		}

		// 반복요소처리
		Iterator<String> iter = set.iterator(); // 반복자
		while (iter.hasNext()) {
			String val = iter.next();
			System.out.println(val); // 한번 처리하고 나면 배열 비어있음. 반복자 다시 꺼내야함
		}

		// 반복처리.
		iter = set.iterator(); // 반복자를 획득
		while (iter.hasNext()) {
			String val = iter.next();
			System.out.println(val);
		}
		
		// 확장 for.
		for(String val :set) {
			System.out.println(val);
		}

	}
}
