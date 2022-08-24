package co.edu.thrad.synchronize;
/*1번째 시간 2번째 예제
 * 동기화 메소드 p533 
 */


public class User1 extends Thread{
		private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		setName("User-1");
		this.calculator = calculator;
	}

	@Override
	public void run() {
		calculator.setMemory(100);
	}

	
}
