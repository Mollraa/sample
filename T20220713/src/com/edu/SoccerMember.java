package com.edu;

public class SoccerMember extends Member {
	// 축구반의 코치이름.
	// 락커룸의 이름.(A, B, C, D)
	
	// 정보출력시 => 코치이름: 홍길동, 락커룸: A 
	
	private String couch;
	private String rocker;
	
	// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실  //투스트링 오버
	public SoccerMember(int memberId, String memberName, String phone, String couch, String rocker) {
		super(memberId, memberName, phone);
		this.couch = couch;
		this.rocker = rocker;
	}

	
	public String getCouch() {
		return couch;
	}


	public void setCouch(String couch) {
		this.couch = couch;
	}


	public String getRocker() {
		return rocker;
	}


	public void setRocker(String rocker) {
		this.rocker = rocker;
	}


	@Override
	public String toString() {
		return "축구반 [Id: " + getMemberId() + ", 이름:" + getMemberName()+ ", 연락처: "+ getPhone() + ", 강사: " + couch +", 락커룸: "+ rocker +"]";
	}
	
}
