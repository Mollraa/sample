package co.edu.inherit.friend;

/*
 * 학교친구.
 */
public class UnivFriend extends Friend{
	private String univ;
	private String major;
	
	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ = univ;
		this.major = major;
		
		
	}

	@Override
	public String toString() {
		return "UnivFriend [이름: " + getName() + ", 연락처: " + getPhone() + ", 학교: " + univ + ", 전공: "
				+ major + "]";
	}
	@Override
	public void showInfo() {
		//친구이름 연락처 학교이름 전공
		super.showInfo();
		System.out.printf("학교: %8s 전공: %14s\n", univ, major);
	}

	
	

}
