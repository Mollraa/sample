package com.yedam.member;

//DTO(Data transfer object)
//BEANS
public class Member {
	//필드 
	private String id;
	private String pw;
	private String name;
	//생성자
		
	
	//메소드
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	
	
	
	
	
}
