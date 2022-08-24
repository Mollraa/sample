package AA;

public class EmpDept extends Employee{ // 자식 extends 부모 상속
	
	//필드
	private String deptName;
	
	//생성자
	public EmpDept(String name, int salary,String deptName) {
		super(name,salary); // 부모생성자 만들어주고 자식것도 만들어야함 / 부모를 거쳐서~ 자식개체를 만들어짐 / 부모에 없으면 자식것만 초기화해도 됨
		this.deptName = deptName;
	}

	//메소드
	public String getDeptName() {
		return deptName;
	}

	@Override
	public void getInformation() {
		System.out.println("이름 : " + name + ", 연봉 : " + salary + ", 부서 : " + deptName);
	}

	@Override
	public void print() {
		super.print(); // 부모 클래스에 있는 print 출력
		System.out.println("서브클래스"); // 내가 가진 내용 출력
	}
	
	
}