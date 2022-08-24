package com.yedam.student;

import java.util.Scanner;

public class StudentService {

	Scanner sc = new Scanner (System.in);
	//1.학생 등록
	public void insertStudent(StudentDTO std) {
//		return StudentManage.getInstance().insertStudent(std); // void -> int 로 수정
	
		int result = StudentManage.getInstance().insertStudent(std);
		if (result ==1 ) {
			System.out.println("학생 정보 입력 성공");
		} else {
			System.out.println("학생 정보 입력 실패");
		}
	}
	
	public void insertSubject(StudentDTO std) {
		//1. 성적 입력 -> 1. 국어 2. 영어 3. 수학
		int menu = 0;
		System.out.println("=========성적 입력=========");
		System.out.println("1. 국어 | 2. 영어 | 3. 수학");
		menu = Integer.parseInt(sc.nextLine());
		
		System.out.println("입력>");

		if(menu ==1 ) {
			int kor = Integer.parseInt(sc.nextLine());
			//국어 점수 입력
			std.setStudentKor(kor);
			checkResult(StudentManage.getInstance().insertKor(std));
		}else if (menu ==2) {
			int eng = Integer.parseInt(sc.nextLine());
			//영어 점수 입력
			std.setStudentEng(eng);
					
			int result = StudentManage.getInstance().insertEng(std);	
			checkResult(result);
			
		}else if (menu == 3) {
			int math = Integer.parseInt(sc.nextLine());
			//수학 점수 입력
			std.setStudentMath(math);
			checkResult(StudentManage.getInstance().insertMath(std));	
			
		}
		
	}
	
	public void updateTel() {
		
		StudentDTO std = new StudentDTO();
		
		System.out.println("ID 입력>");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("변경할 전화번호 입력>");
		String tel = sc.nextLine();
		
		std.setStudentId(id);
		std.setStudentTel(tel);
		
		int result = StudentManage.getInstance().updateTel(std);
		checkResult(result);
		
	}
	
	
	//학생 정보 조회
	public StudentDTO getStudent(StudentDTO std) {

		
//		StudentDTO std = StudentManage.getInstance().getStudent(id);
//		return std;
		
		return StudentManage.getInstance().getStudent(std.getStudentId());
	}
	
	
	private void checkResult(int value) {
		if (value == 1 ) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
