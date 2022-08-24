package co.edu.referece;

public class MethodExample01 {
	public static void main(String[] args) {
		// 실행구문.
//		long sum = sum(10); // arguments (매개값)
//		showInfo("홍길동", 20);
//		showInfo("고길동", 25);
//		printStar(5, "♡");
		gugudan ();
	}
	
	public static void gugudan() {
		for (int i = 2; i <=9 ; i++) {
			for (int j =1; j <=9 ; j++) {
				System.out.print(i + " * " + j + "= " + (i * j) + "\t");
			}
			System.out.println();
		}
	}

//	public static void printGugudan(int num) {
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(num + " * " + i + "= " + (num * i));
//			System.out.printf("%d * %d = %d\n", num , i, (num * i));
//		}
//		System.out.println();
//	}

	public static void printStar(int times, String shape) {
		for (int i = 1; i <= times; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(shape);
			}
			System.out.println();
		}

	}

	public static void showInfo(String name, int age) {
		System.out.println("반갑습니다. " + name + "입니다. 나이는 " + age + "살 입니다.");
	}

	// 정의구문.
	public static long sum(int num) { // parameter(매개변수)
		int result = num * 2;
		return result; // 자동형변환(promotion)
	}
}
