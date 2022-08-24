package com.yedam.exam;

import java.util.HashMap;
import java.util.Scanner;

public class MapApp {

	HashMap<String, String> map = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	String menuNo = ""; 
	
	public MapApp(){
		run();
	}	
	
	private void run() {
		//menuNo = "99"
		//menuNo.equals("99") => true
		//!menuNo.equals("99") => false
		//boolean a = true
		// !a = false
		while(!menuNo.equals("99")) {
			System.out.println("*********************************************************************");
			System.out.println("1.단어 등록 2. 단어 전체 조회 3. 단어 검색 4. 단어 수정" + " 5 .단어 삭제 99. 종료");
			System.out.println("*********************************************************************");
			System.out.println("입력>");
			menuNo = sc.nextLine();
			
			//단어 등록
			if(menuNo.equals("1")) {
				String word = "";
				while(true) {
					System.out.println("단어를 입력하세요. 종료를 원하면 q를 눌러주세요");
					System.out.println("입력>");
					word = sc.nextLine();
					if(word.equals("q")) {
						break;
					}
					System.out.println("뜻 입력>");
					String mean = sc.nextLine();
					map.put(word, mean);							
				}
			}
			//단어 전체 조회
			else if(menuNo.equals("2")) {
				if(map.size() == 0) {
					System.out.println("등록된 단어가 없습니다.");
				} else {
					System.out.println("*******예담 단어장*******");
					// 1. 향상된 for문을 이용해 key를 가져옴
					// 2. 가져온 key를 활용하여 value를 가져옴
					for(String key : map.keySet()) {
						String value = map.get(key);
						System.out.println("단어 : " + key + "\n 뜻 : " + value);
					}
				}
			}
			//단어 검색
			else if(menuNo.equals("3")) {
				System.out.println("단어 입력> ");
				String key = sc.nextLine();
				if(map.containsKey(key)) {
					String value = map.get(key);
					System.out.println("단어 : " + key + "\n 뜻 : " + value);
				}else { 
					System.out.println("등록되지 않은 단어입니다.");
				}
			}
			//단어 수정
			else if(menuNo.equals("4")) {
				System.out.println("수정 단어 입력>");
				String key = sc.nextLine();
				if(map.containsKey(key)) {
					System.out.println("수정 할 뜻> ");
					String value = sc.nextLine();
					map.put(key, value);
				} else {
					System.out.println("등록되지 않은 단어입니다.");
				}
			}
			//단어 삭제
			else if(menuNo.equals("5")) {
				System.out.println("1. 한건 삭제 2. 전체 삭제");
				System.out.println("입력>");
				String menu = sc.nextLine();
				// 한건 삭제
				if(menu.equals("1")) {
					System.out.println("삭제 단어 입력>");
					String key = sc.nextLine();
					map.remove(key);
					if(!map.containsKey(key)) {
						System.out.println("삭제 완료");
					} else {
						System.out.println("삭제되지 않았습니다. 관리자에게 문의하세요.");
					}
				}
				// 전체 삭제
				else if(menu.equals("2")) {
					//map에 있는 데이터 전체 삭제
					map.clear();
					if(map.size()==0) {
						System.out.println("전체 삭제 완료");						
					} else {
						System.out.println("삭제되지 않았습니다. 관리자에게 문의하세요.");
					}
				}
			}
		}
	}
}
