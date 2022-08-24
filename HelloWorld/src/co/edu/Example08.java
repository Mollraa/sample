package co.edu;

import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("[필수 정보 입력] \n1. 이름: ");
		String str1 = scanner.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		String str2 = scanner.nextLine();
		System.out.print("3. 전화번호: ");
		String str3 = scanner.nextLine();
	
		System.out.println("\n[입력한 내용]");
		System.out.println( str1 );
		System.out.println( str2 );
		System.out.println( str3 );
	}

}
