package com.edu;

public class BookMember extends Member {
	
	private String bookb;
	private String bookc;
	// 도서반의 반장이름. bookb
	// 도서반의 강의실정보. bookc (지혜실, 지식실, 모험실) //필드
	
	// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실  //투스트링 오버
	public BookMember(int memberId, String memberName, String phone, String bookb, String bookc) {
		super(memberId, memberName, phone);
		this.bookb = bookb;
		this.bookc = bookc;
	}
	

	public String getBookb() {
		return bookb;
	}


	public void setBookb(String bookb) {
		this.bookb = bookb;
	}


	public String getBookc() {
		return bookc;
	}


	public void setBookc(String bookc) {
		this.bookc = bookc;
	}


	@Override
	public String toString() {
		return "도서반 [Id: " + getMemberId() + ", 이름:" + getMemberName()+ ", 연락처: "+ getPhone() + ", 반장이름: " + bookb +", 강의실: "+ bookc +"]";
	}
	
}
