package com.edu;

public class SwimMember extends Member {
	// 강습반의 강사이름.
	// 수영등급(A,B,C,D)
	
	// 정보출력시 => 강사이름: 홍길동, 등급: A 
	private String scouch;
	private String grade;
	
	public SwimMember(int memberId, String memberName, String phone, String scouch, String grade) {
		super(memberId, memberName, phone);
		this.scouch = scouch;
		this.grade = grade;
	}
	

	public String getScouch() {
		return scouch;
	}


	public void setScouch(String scouch) {
		this.scouch = scouch;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "수영반 [Id: " + getMemberId() + ", 이름:" + getMemberName()+ ", 연락처: "+ getPhone() + ", 강사: " + scouch +", 등급: "+ grade +"]";
	}
	
}
