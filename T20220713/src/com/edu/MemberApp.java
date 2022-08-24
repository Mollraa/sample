package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberApp implements MemberService {
	// MemberService 메소드 반드시 구현해야함

	List<Member> members = new ArrayList<Member>();
	Scanner scn = new Scanner(System.in);

	public void execute() {
		// 메뉴: 1.등록 2.수정 3.전체리스트 9.종료
		// 1)도서반(BookMemeber)=>기본정보+도서반장,강의실이름 > 상속 이용
		// 축구반(SoccerMember)=>기본정보+코치이름,락커룸이름 > 상속 이용
		// 수영반(SwimMember)=>기본정보+강사이름,수영등급 > 상속 이용

		int selectNo;
		boolean run = true;

		System.out.println("YD 문화센터 회원 관리 프로그램입니다.");

		while (run) {
			System.out.println("1. 등록 | 2. 수정 | 3. 전체리스트 | 4. 종료 ");
			System.out.println("원하시는 메뉴를 선택하세요 >>>>");
			selectNo = Integer.parseInt(scn.nextLine());

			if (selectNo == 1) {

				System.out.println("1. 도서반 | 2. 축구반 | 3. 수영반 ");
				System.out.print("선택 > ");
				int choice = Integer.parseInt(scn.nextLine());
				System.out.println("회원 아이디> ");
				int memberId = Integer.parseInt(scn.nextLine());
				System.out.println("회원 이름> ");
				String memberName = scn.nextLine();
				System.out.println("연락처> ");
				String phone = scn.nextLine();

				if (choice == 1) {
					System.out.print("도서반장 > ");
					String presidentName = scn.nextLine();
					System.out.print("강의실이름> ");
					String className = scn.nextLine();

					addMember(new BookMember(memberId, memberName, phone, presidentName, className));

				} else if (choice == 2) {
					System.out.print("코치이름 > ");
					String coachName = scn.nextLine();
					System.out.print("락커룸이름> ");
					String lockerName = scn.nextLine();

					addMember(new SoccerMember(memberId, memberName, phone, coachName, lockerName));

				} else if (choice == 3) {
					System.out.print("강사이름 > ");
					String teacherName = scn.nextLine();
					System.out.print("수영등급> ");
					String grade = scn.nextLine();

					addMember(new SwimMember(memberId, memberName, phone, teacherName, grade));

				}
			} else if (selectNo == 2) {
				System.out.print("수정할 회원ID를 입력하세요");
				int modiMemberId = Integer.parseInt(scn.nextLine());

				System.out.print("새로운 핸드폰 번호를 입력하세요");
				String modiphone = scn.nextLine();

//				Member member = new Member (modiMemberId, null, modiphone);
//				modifyMember(member);
				modifyMember(new Member(modiMemberId, null, modiphone));

				System.out.print("수정되었습니다.");

			} else if (selectNo == 3) {
				List<Member> list = memberList();
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).toString());
				}

			} else if (selectNo == 4) {
				System.out.println("프로그램이 종료되었습니다.");
				break;

			}
		}

		System.out.println("프로그램 종료.");

	}

	@Override // 등록
	public void addMember(Member member) {
		members.add(member);
	}

	@Override // 수정
	public void modifyMember(Member member) {
		for (int i = 0; i < members.size(); i++) {
			if (member.getMemberId() == members.get(i).getMemberId()) {
				members.get(i).setPhone(member.getPhone());
			}
		}

	}

	@Override
	public List<Member> memberList() {
		return members;

	}
}