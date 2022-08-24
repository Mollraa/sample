package co.edu.thread;
/*1교시 첫번째 예제  
 */


class CalcThread extends Thread {

	public CalcThread(String name) {
		setName(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 2000000000; i++) {
			if(i%50000000 == 0) {
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
		System.out.println("Thread: " + getName());
	}

}

public class PriorityExample {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			Thread thread = new CalcThread("Thread-" + i);
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY); //우선 순위 설정 (1~10) MIN_PRIORITY =1
			} else {
				thread.setPriority(Thread.MAX_PRIORITY); //우선 순위 설정 (1~10) MAX_PRIORITY =10
			}
			thread.start();
		}
	}

}
