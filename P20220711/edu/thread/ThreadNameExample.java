package co.edu.thread;
/*1교시 첫번째 예제  
 */

// Thread 상속 1) ThreadA, 2)ThreadB
class ThreadA extends Thread {
	public ThreadA() {
		setName("Thread-A");
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("Thread명 = " + getName()); // thread명 호출시 getName
		}
	}

}

class ThreadB extends Thread {
	public ThreadB() {
		setName("Thread-B");
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("Thread명 = " + getName()); // thread명 호출시 getName
		}
	}

}

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread threadA = new ThreadA();
		threadA.start();
		
		Thread threadB = new ThreadB();
		threadB.start();

	}
}
