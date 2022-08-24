package com.yedam.review;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.sun.jdi.Value;

public class StringApi2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = { "010102-4", "991012-1", "960304-1", "881012-2", "040403-3" };
		
		System.out.println("# 변환 성공\n");
		for (String temp : arr) {
			System.out.print(temp + "-> ");
			char cut = temp.charAt(7);
			if (cut == '1') {
				temp = temp.replace(cut, '2');
			} else if (cut == '2') {
				temp = temp.replace(cut, '1');
			} else if (cut == '3') {
				temp = temp.replace(cut, '4');
			} else if (cut == '4') {
				temp = temp.replace(cut, '3');
			}
			System.out.println(temp);
		}
		
		System.out.println("생년월일(6자리)를 입력하세요.");
		
		int age = 0;
		
		String birth = sc.nextLine();
		
		Date now = new Date();
		 
		SimpleDateFormat formatter = new SimpleDateFormat("yyMMdd");
		String today = formatter.format(now);
		
		int bYear = Integer.parseInt(birth.substring(0, 2));
		int tYear = Integer.parseInt(today.substring(0, 2));
		
		int bDay = Integer.parseInt(birth.substring(3));
		int tDay = Integer.parseInt(today.substring(3));
		
		
		if(bYear > tYear) {
			age = bYear - tYear;
			age = 100 - age;
		}else {
			age = tYear - bYear;
		}
		if(bDay <= tDay) {
			age++;
		}
		System.out.println("나이는 "+ age);
	}
}
