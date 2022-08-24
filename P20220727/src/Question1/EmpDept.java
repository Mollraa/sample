package Question1;


public class EmpDept extends Employee{
	public static void main(String[] args) {
		EmpDept ex = new EmpDept("이지나",3000,"교육부");
		
//		이름:이지나  연봉:3000  부서:교육부
//		수퍼클래스
//		서브클래스
		ex.getInformation();
		ex.print();
	}
	
	private String department;
	
	public EmpDept() {
		super();
	}
	
	public EmpDept (String fullname, int ysalary, String department) {	
		super(fullname,	ysalary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	

	@Override
	public void getInformation() {
		System.out.println("이름은:" + getFullname() + " 연봉은:" + getYsalary() + " 부서는:" + department );
	}

	@Override
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
		return;
	}

	

	
	
}
