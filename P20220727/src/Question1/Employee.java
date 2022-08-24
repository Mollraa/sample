package Question1;

public class Employee {
	private String fullname;
	private int ysalary;

	public Employee () {}
	
	public Employee (String fullname, int ysalary) {
		this.fullname = fullname;
		this.ysalary = ysalary;
	}
	
	public void getInformation() {
		System.out.printf("이름은 %s, 연봉은 %s", fullname, ysalary);
	}
	
	public void print() {
		System.out.println("수퍼클래스");
	}

	public String getFullname() {
		return fullname;
	}

	public int getYsalary() {
		return ysalary;
	}
	
	
	
}
