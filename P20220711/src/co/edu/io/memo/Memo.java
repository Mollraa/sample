package co.edu.io.memo;

import java.io.Serializable;

/*
 * 메모번호, 날짜시간, 메모내용
 */

public class Memo implements Serializable { 
	//MemoManager에서 객체->바이트 변경(직렬화) 하기 위해 implements Serializable 추가함
	//Serializable은 따로 기능이 있진 않음
	
	// 필드
	private int no;
	private String date;
	private String content;
	
	// 생성자
	public Memo(int no, String date, String content) {
		this.no = no;
		this.date = date;
		this.content = content;
	}
	public Memo() {}
	
	// getter, setter
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Memo [no=" + no + ", date=" + date + ", content=" + content + "]";
	}
	
	
}
