package co.edu.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/*3교시 2번째 예제
 * HashSet
 */

public class HashSetEx {
	public static void main(String[] args) {
		// 데이터 저장 => 배열.
		// 컬렉션 ArrayList => 인덱스 값 지정, 동일한 값도 다른 인덱스로 봄. 
		// 컬렉션 HashSet => 인덱스 값 지정(X), 동일한 값 저장(X) = 중복된 값 받아들이지 않음
		
		
		System.out.println("======= HashSet ======");
		HashSet<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("김길동");
		set.add("홍길동");
		
		System.out.println(set.size());
		Iterator<String>iter = set.iterator(); //HashSet의 경우 for문 대신 Iterator 사용
		while(iter.hasNext()) { //hasNext : 컬렉션에서 가지고 올 요소 있는지 체크.
			System.out.println(iter.next()); // next : 요소 선택.
		}
		
		System.out.println("======= ArrayList ======");
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("김길동");
		list.add("홍길동");
		
		System.out.println(list.size());
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
