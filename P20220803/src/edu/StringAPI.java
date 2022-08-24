package edu;

import java.util.Scanner;

public class StringAPI {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("생년월일 13자리를 입력하시오.");
		System.out.println(" - 는 생략하세요^^");
		String jm = scn.nextLine().trim();
		
		if(jm.charAt(6) == '1' || jm.charAt(6) == '2') {
			System.out.println(2023 - 1900 - Integer.parseInt(jm.substring(0,2)) + "살");
		} else if (jm.charAt(6) == '3' || jm.charAt(6) == '4') {
			System.out.println(2023 - 2000 - Integer.parseInt(jm.substring(0,2)) + "살");			
		}
		
	}
}
