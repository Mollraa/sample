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
		System.out.printf("�̸��� %s, ������ %s", fullname, ysalary);
	}
	
	public void print() {
		System.out.println("����Ŭ����");
	}

	public String getFullname() {
		return fullname;
	}

	public int getYsalary() {
		return ysalary;
	}
	
	
	
}
