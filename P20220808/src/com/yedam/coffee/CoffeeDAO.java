package com.yedam.coffee;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class CoffeeDAO extends DAO{
	
	private static CoffeeDAO coffeeDao = null;
	
	private CoffeeDAO() {
		
	}
	
	public static CoffeeDAO getInstance() {
		return coffeeDao == null ? coffeeDao = new CoffeeDAO() : coffeeDao;
	}
	
	/*
	 1.메뉴조회
	 2.메뉴 상세 조회
	 3.메뉴 등록
	 4.판매
	 5.메뉴 삭제
	 6.매출
	 7.종료
	 */

	
	//1)메뉴 조회
	public List<Coffee> getCoffee(){
		List<Coffee> list = new ArrayList<>();
		Coffee coffee = null;
		try {
			conn();
			String sql = "select coffee_menu, coffee_price from coffee";
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				coffee = new Coffee();
				coffee.setCoffeeMenu(rs.getString("coffee_menu"));
				coffee.setCoffeePrice(rs.getInt("coffee_price"));
				list.add(coffee);
			}
		}
			catch (SQLException e) {
				System.out.println(" ※ ※ ※ Error 에러 코드표 확인 하세요 ※ ※ ※");
				System.out.println("해당 Error 코드 : " + e.getErrorCode());
				System.out.println("해당 원인 : " + e.getMessage());
				e.getMessage();
				e.getErrorCode();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}
	
	
	//2)메뉴 상세 조회
	public List<Coffee> getDetailCoffee(){
		List<Coffee> list = new ArrayList<>();
		Coffee coffee = null;
		try {
			conn();
			String sql = "select * from coffee";
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				coffee = new Coffee();
				coffee.setCoffeeMenu(rs.getString("coffee_menu"));
				coffee.setCoffeePrice(rs.getInt("coffee_price"));
				coffee.setCoffeeExplain(rs.getString("coffee_explain"));
				coffee.setCoffeeSales(rs.getInt("coffee_sales"));
				list.add(coffee);
				}
			}catch (SQLException e) {
				System.out.println(" ※ ※ ※ Error 에러 코드표 확인 하세요 ※ ※ ※");
				System.out.println("해당 Error 코드 : " + e.getErrorCode());
				System.out.println("해당 원인 : " + e.getMessage());
				e.getMessage();
				e.getErrorCode();
						
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}
	
	//3)메뉴 등록
	public int insertCoffee(Coffee coffee) {
		int result = 0;
		try {
			conn();
			String sql = "insert into coffee values(?,?,?)";
			
			pstmt= conn.prepareStatement(sql);
			
			pstmt.setString(1, coffee.getCoffeeMenu());
			pstmt.setInt(2, coffee.getCoffeePrice());
			pstmt.setString(3, coffee.getCoffeeExplain());
			
			result = pstmt.executeUpdate();
					
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
		
	}
	
	/*4.판매
	 5.메뉴 삭제
	 6.매출
	 7.종료
	*/
	
	//4)판매
	public int salesCoffee(Coffee coffee) {
		int result = 0;
		try {
			conn();
			
			String sql = "update coffee set coffee_sales = ? where coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
		
			pstmt.setInt(1, coffee.getCoffeeSales());
			pstmt.setString(2, coffee.getCoffeeMenu());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			
		} finally {
			disconnect();
		}
		return result;
	}
	
	//5)삭제
	public int deleteCoffee(String coffeeMenu) {
		int result = 0;
		try {
			conn();
			String sql = "delete from coffee where product_menu=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffeeMenu);

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}
	
	
}
