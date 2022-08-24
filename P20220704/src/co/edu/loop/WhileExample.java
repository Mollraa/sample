package co.edu.loop;

public class WhileExample {
	public static void main(String[] args) {
		
		// 1~10까지 반복.
		int i = 1;
		while(i <= 10) {
			System.out.println("i의 값>> " + i);
			i++;  //증감식.
		}
		
		boolean isTrue = true;
		while(isTrue) {
			int num = (int) (Math.random()*10);
			System.out.println("num의 값>> " + num);
			if(num == 5) {
				isTrue = false;
			}
		}
		System.out.println("end of program.");
		
		while(true) {
			int num = (int) (Math.random()*10);
			System.out.println("num의 값>> " + num);
			if(num == 5) {
				break; //switch, for, while 블럭을 중단.
			}
		}
		System.out.println("end of program2.");
		
	}
}
