package com.yedam.exam;

public class SimplePayment implements Payment {
	/*
	 * - 필드로 간편결제 할인율(simplePaymentRatio)을 가진다. - 생성자를 통해 매개변수로 값을 받아 필드를 초기화 한다. -
	 * 아래의 실행코드와 실행결과를 참조하여 Payment 인터페이스 메서드를 오버라이딩 한다.
	 */

	// 필드
	public double simplePaymentRatio;

	// 생성자
	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}

	// 메소드
	@Override
	public int online(int price) {
		// 간편결제에 대한 할인율 simplePaymentRatio
		// 온라인 결제에 대한 할인율 ONLINE_PAYMENT_RATIO
		// 간편 결제 할인율 + 온라인 결제 할인율 = ?
		// price 금액에 해서 할인율 적용하고, 거기에 대한 가격을 표시
		// price price 할인율
		// 원가 - (원가*할인율) = 할인 후 금액
		// 10000-(10000*0.1) = 9000
		// price - (price * (simplePaymentRatio + ONLINE_PAYMENT_RATIO))=할인 후 금액
		
		int pay =(int) ( price - (price * (simplePaymentRatio + Payment.ONLINE_PAYMENT_RATIO))); 
		//할인된 금액 반환
		return pay;
	}

	@Override
	public int offline(int price) {
		int pay = (int) (price - (price *(simplePaymentRatio + Payment.OFFLINE_PAYMENT_RATIO)));
		return pay;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 간편결제 시 할인정보");
		System.out.println("온라인 결제 시 총 할인율 : " + (simplePaymentRatio + Payment.ONLINE_PAYMENT_RATIO));
		System.out.println("오프라인 결제 시 총 할인율 : " + (simplePaymentRatio + Payment.OFFLINE_PAYMENT_RATIO));

	}

}
