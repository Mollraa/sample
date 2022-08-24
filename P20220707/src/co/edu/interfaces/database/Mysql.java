package co.edu.interfaces.database;

public class Mysql implements Dao {

	@Override
	public void insert() {
		System.out.println("Mysql 입력합니다.");
		
	}

	@Override
	public void update() {
		System.out.println("Mysql 수정합니다.");
		
	}

	@Override
	public void delete() {
		System.out.println("Mysql 삭제합니다.");
		
	}

}
