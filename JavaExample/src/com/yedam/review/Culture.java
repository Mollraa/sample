package com.yedam.review;

public abstract class Culture {
/*
 * 1) Culture 클래스를 정의한다.
	- 제목, 참여감독 수, 참여배우 수, 관객수, 총점을 필드로 가진다.
	- 제목, 참여감독 수, 참여배우 수는 생성자를 이용하여 값을 초기화한다.
	- 메소드는 다음과 같이 정의한다.
	(1) public void setTotalScore(int score) : 관객수와 총점을 누적시키는 기능
	(2) public String getGrade() : 평점을 구하는 기능
	(3) public abstract void getInformation() : 정보를 출력하는 추상메소드
 */
	//필드
	protected String title;
	protected int director;
	protected int actor;
	protected int audience;
	protected int totalScore;
	//생성자
	public Culture(String title, int director, int actor) {
		this.title =title;
		this.director = director;
		this.actor = actor;
	}
	//메소드
	/*
	(1) public void setTotalScore(int score) : 관객수와 총점을 누적시키는 기능
	(2) public String getGrade() : 평점을 구하는 기능
	(3) public abstract void getInformation() : 정보를 출력하는 추상메소드
	 */
	public void setTotalScore(int score) {
		//평점 인원 한명 추가
		audience++;
		//총점에 평점 추가
		totalScore += score;
	}
	
	public String getGrade() {
		int avg = totalScore/audience;
		String grade = null;
		switch (avg) {
		case 1:
			grade = "★☆☆☆☆"; //ㅁ + 한자 + 7
			break;
		case 2:
			grade = "★★☆☆☆";
			break;
	
		case 3:
			grade = "★★★☆☆";
			break;
	
		case 4:
			grade = "★★★★☆";
			break;
		case 5:
			grade = "★★★★★";			
			break;	
		}
		return grade;
	}
	
	//추상화 메소드
	public abstract void getInformation();	
	
	
	
	
}
