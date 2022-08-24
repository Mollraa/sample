package co.edu.thrad.synchronize;
/*1번째 시간 2번째 예제
 * 동기화 메소드 p533 
 */

public class MainThread {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		

	}

}
