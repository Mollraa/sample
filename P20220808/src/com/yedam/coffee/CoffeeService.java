package com.yedam.coffee;

import java.util.List;
import java.util.Scanner;

public class CoffeeService {
	
	Scanner sc = new Scanner(System.in);
	
	//1)메뉴 조회
	public void getCoffee() {
		List<Coffee> list = CoffeeDAO.getInstance().getCoffee();
		for ( Coffee coffee : list) {
			System.out.println("메뉴 : " + coffee.getCoffeeMenu() + " 가격 : " + coffee.getCoffeePrice());			
		}
		
	}
	
	
	//2)메뉴 상세 조회
	public void getDetailCoffee() {
		System.out.println("메뉴 입력>");
		String coffee_menu = sc.nextLine();
		List<Coffee> list = CoffeeDAO.getInstance().getDetailCoffee();
		
		
		for(Coffee coffee : list) {
			System.out.println("메뉴 : " + coffee.getCoffeeMenu() + " 가격 : " + coffee.getCoffeePrice() 
							+ " 설명 : " + coffee.getCoffeeExplain());
		}
	}
	
	//3)메뉴 등록
	public void insertCoffee() {
		Coffee coffee = new Coffee();
		
		System.out.println("메뉴 입력>");
		String coffeeMenu = sc.nextLine();
		
		System.out.println("가격 입력>");
		int coffeePrice = Integer.parseInt(sc.nextLine());
		
		System.out.println("설명 입력>");
		String coffeeExplain = sc.nextLine();
		
		coffee.setCoffeeMenu(coffeeMenu);
		coffee.setCoffeePrice(coffeePrice);
		coffee.setCoffeeExplain(coffeeExplain);
		
		int result = CoffeeDAO.getInstance().insertCoffee(coffee);
		
		if(result == 1) {
			System.out.println("메뉴 등록 완료");
		} else {
			System.out.println("메뉴 등록 실패");
		}
	}
		//4)판매
		public void salesCoffee() {
			Coffee coffee = new Coffee();
			
			System.out.println("메뉴 입력>");
			
			String coffeeMenu = sc.nextLine();
			
			coffee.setCoffeeMenu(coffeeMenu);
			
			int result = CoffeeDAO.getInstance().salesCoffee(coffee);
			
			if(result == 1) {
				System.out.println("판매량 완료");

			} else {
				System.out.println("실패");
			}
		}
		
		
		
		
		//5)메뉴 삭제
		public void deleteCoffee() {
			
			System.out.println("메뉴 입력>");
			
			String coffeeMenu = sc.nextLine();
			
			int result = CoffeeDAO.getInstance().deleteCoffee(coffeeMenu);
			if (result==1) {
				System.out.println("메뉴 삭제 완료");
			} else {
				System.out.println("메뉴 삭제 실패");
			}

			//coffeSales += (coffee.getCoffeePrice() * coffee.getCoffeePrice());
		}
		
		
		//6) 매출
		public void calCoffee() {
			List<Coffee> list = CoffeeDAO.getInstance().getDetailCoffee();
			int sum = 0;
			
			for (Coffee coffee : list) {

				System.out.println("메뉴> " + coffee.getCoffeeMenu() + "가격> " + coffee.getCoffeePrice());
				sum += (coffee.getCoffeePrice() * coffee.getCoffeePrice());
				
			}
		}
	
	
	
	
}
