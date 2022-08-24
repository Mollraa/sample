package com.yedam.exe;

import java.util.Scanner;

import com.yedam.product.ProductService;

public class Application {
	
	Scanner sc = new Scanner(System.in);
	ProductService ps = new ProductService();
	
	public Application() {
		start();
	}

	private void start() {
		while (true) {
			System.out.println("1. 상품 조회 | 2. 상품 상세 조회 | 3. 점포별 상품 조회"
					+ " | 4. 상품등록 | 5. 상품 삭제 | 6. 매출 | 7. 종료");
			int menuNo = Integer.parseInt(sc.nextLine());
			if(menuNo ==1 ) {
				ps.getProduct();
			}else if(menuNo ==2) {
				ps.getDetailProduct();
			}else if(menuNo ==3) {
				ps.getStoreProduct();
			}else if(menuNo ==4) {
				ps.insertProduct();
			}else if(menuNo ==5) {
				ps.deleteProduct();
			}else if(menuNo ==6) {
				ps.calProduct();
			}else if(menuNo ==7) {
				System.out.println("종료");
				break;
			}
		
		}
		
	}
	
	
}
