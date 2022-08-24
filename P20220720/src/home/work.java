package home;

import java.util.Scanner;

public class work {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 문제1) 차례대로 x와 y의 값이 주어졌을 때 어느 사분면에 해당되는지 출력하도록 구현하세요.
		// 각 사분면에 해당 하는 x와 y의 값은 아래를 참조하세요.
		// 제1사분면 : x>0, y>0
		// 제2사분면 : x<0, y>0
		// 제3사분면 : x<0, y<0
		// 제4사분면 : x>0, y<0
		// 문제출처, 백준(https://www.acmicpc.net/) 14681번 문제
		
		System.out.println("x와 y에0이 아닌 실수를 대입하세요");
		System.out.println("x>");
		int x = scanner.nextInt();
		System.out.println("y>");
		int y = scanner.nextInt();

		
		if( x > 0) {
			if (y > 0 ) {
				System.out.println("제 1사분면");
			} else {
				System.out.println("제 4사분면");
			} 
		} else if ( x<0 ) {
			if( y >0) {
			System.out.println("제 2사분면");
			} else {
			System.out.println("제 3사분면");
			}
		} else {
			System.out.println( " 0 이외의 실수를 대입하세요.");
		}
	
		


		// 문제2) 연도가 주어졌을 때 해당 년도가 윤년인지를 확인해서 출력하도록 하세요.
				// 윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일때입니다.
				// 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이며,
				// 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아닙니다.
				// HiNT : 이중 IF문 사용
				// 문제출처, 백준(https://www.acmicpc.net/) 2753번 문제
		
		
		System.out.println("연도를 입력하세요. > ");
		int year = scanner.nextInt();
		
		if( year % 4 == 0 ) {
			if(year % 100 != 0) {
				System.out.println("윤년입니다.");
			} else if (year % 400 == 0) {
				System.out.println("윤년입니다.");
			} else {
				System.out.println("윤년이 아닙니다.");
			}
		} else {
			System.out.println("윤년이 아닙니다.");
		}
	
		

		// 문제3) switch문을 이용하여 가위, 바위, 보 중 하나가 주어졌을 때 사용자 어떤 값을 가져야 이길 수 있는 지를 출력하도록
		// 구현하세요.
		// 예를 들어, 가위가 주어졌을 때 "이기기 위해선 바위를 내야합니다." 라고 출력하도록 하세요.
		// 한 단어를 입력받을 경우 Scanner객체의 next() 함수를 사용하면 됩니다.

		System.out.println("가위, 바위, 보! 게임 시작 > ");
		String a = scanner.next();
		
		switch(a) {
		case "가위" :
			System.out.println("이기기 위해선 바위를 내야합니다.");
			break;
		case "바위" :
			System.out.println("이기기 위해선 보를 내야합니다.");
			break;
		case "보" :
			System.out.println("이기기 위해선 가위를 내야합니다.");
			break;
		default :
			System.out.println("이기기 위해선 가위 바위 보를 해야합니다.");
			break;
		}
		
		
		// 문제4) for문과 "*"를 이용하여 아래와 같이 출력하도록 하세요.
		// *
		// **
		// ***
		// ****
		// *****
		
		for (int i=1; i<6; i++) {
			for (int j=1; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// 문제5) 차례대로 m과 n을 입력받아 m단을 n번째까지 출력하도록 하세요.
		// 예를 들어 2와 3을 입력받았을 경우 아래처럼 출력합니다.
		// 2 X 1 = 2
		// 2 X 2 = 4
		// 2 X 3 = 6
		System.out.print("출력하고 싶은 단을 입력하세요> ");
		int m = scanner.nextInt();
		System.out.print("원하는 수까지 입력하세요> ");
		int n = scanner.nextInt();
		int z = n;

		for (n = 1; n <= z; n++) {
			System.out.println(m + " x " + n + " = " + (m * n));
			
		}

	}
}
