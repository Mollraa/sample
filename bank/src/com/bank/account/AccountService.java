package com.bank.account;

import java.util.List;
import java.util.Scanner;

import com.bank.member.MemberService;

public class AccountService {
	Scanner sc = new Scanner(System.in);
	
	//1. 계좌개설
	//2. 입출금
	//3. 계좌 해지
	//4. 계좌 이체
	
	public void makeAccount() {
		Account ac = new Account();
		
		System.out.println("계좌 번호>");
		String accountId = sc.nextLine();
		System.out.println("고객 ID>");	
		String customId = sc.nextLine();
		
		ac.setAccountId(accountId);
		ac.setMemberId(customId);
		
		//계좌 등록 메소드
		int result = AccountManage.getInstance().insertAccount(ac);
		if( result == 1) {
			System.out.println("계좌 등록 완료");
		} else {
			System.out.println("계좌 등록 실패`");
		}
		
	}
	
	//2 입출금
	public void money() {
		
		Account account = new Account();
		
		System.out.println("1. 입금 | 2. 출금");
		int cmd = Integer.parseInt(sc.nextLine());
		
		System.out.println("계좌번호>");
		String  accountId = sc.nextLine();
		
		if(cmd == 1) {
			System.out.println("입금 금액>");
			
		}//출금
		else if (cmd ==2 ) {
			System.out.println("출금 금액>");
		}
		
		int money = Integer.parseInt(sc.nextLine());
		account.setAccountId(accountId);
		account.setBalance(money);
		
		int result = AccountManage.getInstance().updateMoney(account, cmd);
		if(result==1 && cmd==1) {
			System.out.println("입금 완료");
		}else if (result ==1 && cmd ==2) {
			System.out.println("출금 완료");
		}
			
	}
	
	//3. 계좌 해지 -> delete
	public void deleteAccount() {
		System.out.println("========계좌 해지========");
		System.out.println("계좌 입력>");
		String accountId = sc.nextLine();
		
		int result = AccountManage.getInstance().delAccount(accountId);
		if(result ==1 ) {
			System.out.println("정상해지");
		} else {
			System.out.println("해지되지 않음");
		}
		
	}
	
	//4.계좌 이체
	public void transfer() {
		//계좌 이체
		//1. 받는 사람 계좌
		//2. 보내느 사람 계좌
		//3. 보내는 사람의 비밀번호(join) 또는 select계좌와 비밀번호가 맞는지 확인
		// 데이터 유효성검사.
		// 4. 출금 금액
		System.out.println("========계좌 이체========");
		
		System.out.println("받는 사람 계좌");
		String toAccountId= sc.nextLine();
				
		System.out.println("보내는 사람 계좌");
		String fromAccountId = sc.nextLine();
		
		System.out.println("출금 금액");
		int balance = Integer.parseInt(sc.nextLine());
		
		AccountManage.getInstance().transferMoney(toAccountId, fromAccountId, balance);
		
		
	}
	
	public void getAccount() {
		List <Account> list = 
				AccountManage.getInstance().getAccountList(MemberService.memberInfo.getMemberId());
		System.out.println(MemberService.memberInfo.getMemberName()+" 님의 계좌 정보");
		for ( Account account : list) {
			System.out.println("계좌 ID > " + account.getAccountId());
			System.out.println("잔고 > " + account.getBalance());
			System.out.println("생성일> " + account.getCredate());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
