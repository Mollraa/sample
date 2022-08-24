package co.edu.compound;

/*
 * 이름, 연락처, email, 생일, 키, 몸무게:
 */
public class Friend {

	// 필드. 명명규칙(소문자, camelCase, 영문, )

	private String fullname;
	private String phone;
	String email;
	String birth;
	private double height;
	private double weight;

	// 생성자:기본생성자를 생성.

	public Friend() {
		System.out.println();
	}

	// 메소드
	// 이름, 연락처를 보여주는 showInfo()
	public void showInfo() {
//		System.out.println("이름은 "+ fullname +"이고, 연락처는 " + phone + "입니다.");
		System.out.printf("이름은 %s, 연락처는 %s", fullname, phone);
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setHeight(double height) {
		if (height < 0) {
			System.out.println("잘못된 값이 입력됐습니다.");
			this.height = 165.0;
		} else {
			this.height = height;
		}
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public void setWeight(double weight) {
		if (weight < 0) {
			System.out.println("웃기지마");
			this.weight = 99.9;
		} else {
			this.weight = weight;
		}
	}
	// get 메소드...
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}

	public String getFullname() {
		return fullname;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getBirth() {
		return birth;
	}
	
}
