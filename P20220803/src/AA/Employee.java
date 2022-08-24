package AA;

public class Employee {
	
	//필드
	protected String name;
	protected int salary;

	//생성자
	public Employee () {}
	
	public Employee (String name, int salary) { //오버로딩 - 생성자에서 매개 변수를 넣어서 사용 하는 기능 (여러개 만들 수 있음)
		this.name = name; // 생성자를 이용하여 값을 초기화.
		this.salary = salary;
	}
	
	/*
	 * public Employee (String name){} -오버로딩
	 * public Employee (int salary, String name){} 순서 다르게 만들 수 있음
	 */
	

	//메소드
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}

	
	public void getInformation() {
		System.out.println("이름 : " + name + "연봉 : " + salary);
	}
	

	public void print() {
		System.out.println("슈퍼클래스");
	}
	
	
}
