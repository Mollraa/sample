package co.edu.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

/* 4번째 시간 예제
 * 이름, 점수 => map 저장.
 * 김민수, 80 / 황현익, 75 / 이현승, 88 
 * Scanner 클래스 입력 > 학생 이름 입력 -> 점수 반환.
 * List, Set과 달리 클래스 선언 없이 사용 가능
 */

public class MapExample {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		HashMap<String, Integer> students = new HashMap<String, Integer>();
		students.put("김민수", 80);
		students.put("황현익", 75);
		students.put("이현희", 88);

		// 출력결과 :
		// 평균점수 : 81,
		// 최고점수 : 88, 최고점수 학생의 이름 : 이현승

		Set<Entry<String, Integer>> set = students.entrySet();
		System.out.println("시험명단" +set);
		
		Collection values = students.values();//value값들 넣기
		  Iterator iter = values.iterator();
		  int total = 0;
		  while(iter.hasNext()){
		   total += (Integer)iter.next();
		  }
		  int max = 0;
		  String best = "";

		  for(Entry<String, Integer> entry:set){	
			  
				if (entry.getValue() >= max) {
				max = entry.getValue();
				best = entry.getKey();
			}

				
		  }
		  
		  
		  System.out.println("=========출력결과===========");
		  System.out.println("총점 : " + total);
		  System.out.println("평균 : " + (double)total/students.size());
		  System.out.println("최대값 : " + Collections.max(values));
		  System.out.println("최소값 : " + Collections.min(values));
		 System.out.println("최고점수 : "+ max+", 최고 점수 학생의 이름 : "+best);

}

	}

//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Scanner;
//import java.util.Set;
//import java.util.Map.Entry;
//
///*
// * 4번째 시간 예제 이름, 점수 => map 저장. 김민수, 80 / 황현익, 75 / 이현승, 88 Scanner 클래스 입력 > 학생
// * 이름 입력 -> 점수 반환. List, Set과 달리 클래스 선언 없이 사용 가능
// */
//
//public class MapExample {
//	public static void main(String[] args) {
//
//		Scanner scn = new Scanner(System.in);
//
//		HashMap<String, Integer> students = new HashMap<String, Integer>();
//		students.put("김민수", 80);
//		students.put("황현익", 75);
//		students.put("이현희", 88);
//
//		// 출력결과 :
//		// 평균점수 : 81,
//		// 최고점수 : 88, 최고점수 학생의 이름 : 이현승
//
//		Set<Entry<String, Integer>> set = students.entrySet();
//		System.out.println("=========출력결과===========");
//		int max = 0;
//		String best = "";
//		int sum = 0;
//		int avg = 0;
//
//		for (Entry<String, Integer> entry : set) {
//
//			if (entry.getValue() >= max) {
//				max = entry.getValue();
//				best = entry.getKey();
//			}
//
//		}
//
//		System.out.println("최고점수 : " + max + ", 최고 점수 학생의 이름 : " + best);
//
//	}

//
//of https:// github.com/FINE100/sample_workspace.git
//
////		
////		
////		
////
////		System.out.println("학생 이름을 입력해주세요 >> ");
////		String name = scn.nextLine();
//////	
//////	int score = students.get(name);	
//////	System.out.println(score);				//>> 내가 만든 코드 ; 잘못된 값 입력시 오류뜸
////
////		Set<Entry<String, Integer>> set = students.entrySet();
////
////		for (Entry<String, Integer> entry : set) {
////			if (entry.getKey().equals(name)) {
////				System.out.println("학생의 점수 : " + entry.getValue());
////			}
////		}
////
////	}
////}