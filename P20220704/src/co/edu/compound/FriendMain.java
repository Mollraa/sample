package co.edu.compound;

public class FriendMain {
	public static void main(String[] args) {
		Friend f1 = new Friend();
//		f1.fullname = "말랑콩떡";
		f1.setFullname("김민수");
//		f1.phone = "010-5555-6666";
		f1.setPhone("010-5555-6666");
//		f1.email = "mallang@naver.com";
		f1.setEmail("aa@naver.com");
//		f1.birth = "7월 6일";
		f1.setBirth("7월7일");
//		f1.height = 170.5;
		f1.setHeight(-170.5);
		System.out.println("키는: " + f1.getHeight());
//		f1.weight = 66.6;
		f1.setWeight(-45);
		System.out.println("몸무게는: " + f1.getWeight());
		
		f1.showInfo();
		
	}
}
