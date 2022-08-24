package co.edu.thread;
/*1교시 첫번째 예제 
 * 
 */

import java.awt.Toolkit;

public class ThreadExample {

	public static void main(String[] args) { // 메인 스레드
		
		//Thread의 생성자 매개값 (Runnable 구현 객체)
		Thread beep = new Thread(new BeepTask());
		beep.start();
		
		//Thread 클래스 상속 받은 하위클래스 생성자.
		beep = new BeepWorkerThread();
		beep.start();
		

		// 스피커 소리
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(800);// 0.8초동안 잠시 멈췄다가 다시 작동
			} catch (InterruptedException e) {
				e.printStackTrace();

			}

		} // 콘솔 출력
		for (int i = 0; i < 5; i++) {
			System.out.println("print");
			try {
				Thread.sleep(800);// 0.8초동안 잠시 멈췄다가 다시 작동
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}

	}
}
