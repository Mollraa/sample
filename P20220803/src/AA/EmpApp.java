package AA;
//다형성?
public class EmpApp {

	public static void main(String[] args) {
		
		Employee emp = new EmpDept("이지나", 3000, "교육부");
		
		emp.getInformation();
		emp.print();

	}

}
