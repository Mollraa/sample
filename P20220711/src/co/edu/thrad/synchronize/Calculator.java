package co.edu.thrad.synchronize;
/*1번째 시간 2번째 예제
 * 동기화 메소드 p533 
 */

public class Calculator {
	private int memory;
	public int getMemory() {
		return memory;
	}
	
	
		public synchronized void setMemory(int momory) {
			this.memory = memory; //  synchronized 메모리가 수행되는 동안 동기화하지 못하도록 막음
		
		
		try {
			Thread.sleep(2000); // 2초간 멈췄다가 실행
		} catch (InterruptedException e) {			
			e.printStackTrace();
		} 
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}

}
