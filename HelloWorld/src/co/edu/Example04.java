package co.edu;

import java.io.IOException;

/*
 * 키보드 입력값 코드 or 값을 메소드.
 */
public class Example04 {
	public static void main(String[] args) {
		
		System.out.println("값을 입력하세요.");
		// System:
		int num = 10;
		boolean run = true;
		while(run) {
			int result = 0;
			try {
				result = System.in.read();
				System.out.printf("입력값은 %d 입니다.", result);
			} catch (IOException e) {
				e.printStackTrace();
			}
			run = result != 48;
		}
		System.out.println("end of prog");

	}
}
