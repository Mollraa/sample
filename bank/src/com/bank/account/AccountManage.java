package com.bank.account;

import java.util.ArrayList;
import java.util.List;

import com.bank.common.DAO;

public class AccountManage extends DAO {
	//싱글톤
	private static AccountManage am = new AccountManage();
	
	private AccountManage() {
		
	}
	
	public static AccountManage getInstance() {
		return am;
	}
	
	//계좌 개설
	public int insertAccount(Account account) {
		int result = 0;
		try {
			conn();
			String sql = "insert into account (account_id, member_id) values(?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account.getAccountId());
			pstmt.setString(2, account.getMemberId());
			result = pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		} 
		return result;
	}
	
	//입출금
	public int updateMoney(Account account,int cmd) {
		int result = 0;
		try {
			conn();
			//입출금 -> update
			//계산한 데이터를 바로 넣어주면 됨.
			//다른 연산 필요없이 가능.
			//현재 잔고를 가져오는 query
			String sql2 = "select balance from account where account_id =? ";
			pstmt = conn.prepareStatement(sql2);
			pstmt.setString(1, account.getAccountId());
			rs = pstmt.executeQuery();
			
			int balance = 0;
			if(rs.next()) {
				//rs.getInt(balance);
				balance = rs.getInt("balance");
			}
			//잔고 계산
			//입금=1, 출금=2
			if(cmd ==1) {
				//balance => 현재잔고
				//account.getBalance() => 입금하고자 하는 금액
				//balance + account.getBalance() = 입금한 금액
				account.setBalance(balance+account.getBalance());
				
				String sql = "update account set balance =? where account_id = ?";
				
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, account.getBalance());
				pstmt.setString(2, account.getAccountId());					
				result = pstmt.executeUpdate();	
				
			} else if (cmd == 2) {
				
				// 잔고 >= 출금액
				if(balance-account.getBalance() >= 0) {
					
					account.setBalance(balance-account.getBalance());
					

					String sql = "update account set balance =? where account_id = ?";
				
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, account.getBalance());
					pstmt.setString(2, account.getAccountId());					
					result = pstmt.executeUpdate();					
					
				}
				//잔고 < 출금액
				else {
					System.out.println("잔고보다 출금액이 많습니다.");
				}
				
			}
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return result;
	}
	
	//3.계좌 해지
	public int delAccount(String accountId) {
		int result = 0;
		try {
			conn();
			String sql = "delete from account where account_id=?";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1,accountId);
			result = pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
			
		}
		return result;
	}
	
	//4.계좌 이체
	public void transferMoney(String toAccount, String fromAccount, int balance) {
		//to~ 받는 사람
		//from ~ 보내늣 ㅏ람
		//balance 금액
		int result = 0;
		try {
			conn();
			//보내는 사람의 계좌에 돈을 출금해주는 query
			String sql2 = "update account set balance = balance-? where account_id=?";
			
			pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, balance);
			pstmt.setString(2, fromAccount);
			result = pstmt.executeUpdate();
			
			if(result ==1 ) {
				System.out.println("정상 출금");
				//받는 사람의 계좌에 돈을 넣어주는sql
				String sql = "update account set balance = balance+? where account_id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, balance);
				pstmt.setString(2, toAccount);
				int result2 = pstmt.executeUpdate();
				if(result2 == 1) {
					System.out.println("계좌 이체 완료");
				} else {
					System.out.println("계좌 이체 실패");
				}
			} else {
				System.out.println("출금 실패");
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	
	//계좌 조회
	public List<Account> getAccountList(String memberId){
		List<Account> list = new ArrayList<>();
		Account account = null;
		try {
			conn();
			String sql = "SELECT * FROM account where member_id = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				account = new Account();
				account.setAccountId(rs.getString("account_id"));
				account.setMemberId(rs.getString("member_id"));
				account.setCredate(rs.getDate("creDate"));
				account.setBalance(rs.getInt("balance"));
				list.add(account);
			}
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}		
		return list;
	}
	
}
