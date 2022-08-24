package com.yedam.review;

public class Movie extends Culture{
/*
 * 2) Movie 클래스를 정의한다.
	- 추가로 장르를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
	- 메소드는 다음과 같이 정의한다.
	(1) public abstract void getInformation() :
	제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능
 */
	

	//필드
	String gerne = "액션";
	
	//생성자
	public Movie(String title, int director, int actor) {
		super(title, director, actor);
	}

	@Override
	public void getInformation() {
		System.out.println("영화제목 : " + title);
		System.out.println("감독 수  : " + director);
		System.out.println("배우 수 : " + actor);
		System.out.println("영화 총점 : " + totalScore);
		System.out.println("영화 평점 : " + getGrade());
	}
	
	
	//메소드
	
	
}
