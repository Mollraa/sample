package Question1;


public class EmpDept extends Employee{
	public static void main(String[] args) {
		EmpDept ex = new EmpDept("������",3000,"������");
		
//		�̸�:������  ����:3000  �μ�:������
//		����Ŭ����
//		����Ŭ����
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
		System.out.println("�̸���:" + getFullname() + " ������:" + getYsalary() + " �μ���:" + department );
	}

	@Override
	public void print() {
		System.out.println("����Ŭ����\n����Ŭ����");
		return;
	}

	

	
	
}
