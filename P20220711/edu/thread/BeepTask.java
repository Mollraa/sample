package co.edu.thread;
/*1교시 첫번째 예제 
 * 
 */

import java.awt.Toolkit;

public class BeepTask implements Runnable { // Runnalbe 추상메소드

	@Override
	public void run() {
		// 스피커 소리
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(800);// 0.8초동안 잠시 멈췄다가 다시 작동
			} catch (InterruptedException e) {
				e.printStackTrace();

			}

		}
	}
}
