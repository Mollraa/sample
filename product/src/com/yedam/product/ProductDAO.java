package com.yedam.product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class ProductDAO extends DAO {

	private static ProductDAO productDao = null;

	private ProductDAO() {

	}

	public static ProductDAO getInstance() {
		return productDao == null ? productDao = new ProductDAO() : productDao;
	}

	/*
	 * 2-1)상품조회 - 상품 이름, 가격 2-2) 상품 상세 조회 - 상품 모든 내용 조회 2-3) 점포별 상품 조회 2-4)상품 등록
	 * 2-5)상품 삭제 2-6) 상품별 판매 갯수 출력 + 판매 금액
	 */

	// 2-1)
	public List<Product> getProduct() {
		List<Product> list = new ArrayList<>();
		Product product = null;
		try {
			conn();
			String sql = "select product_name, product_price from product";
			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				product = new Product();
				product.setProductName(rs.getString("product_name"));
				product.setProductPrice(rs.getInt("product_price"));
				list.add(product);

			}
		} catch (SQLException e) {
			System.out.println(" ※ ※ ※ Error 에러 코드표 확인 하세요 ※ ※ ※");
			System.out.println("해당 Error 코드 : " + e.getErrorCode());
			System.out.println("해당 원인 : " + e.getMessage());
			e.getMessage();
			e.getErrorCode();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	// 2-2) 상세 조회
	public List<Product> getDetailProduct() {
		List<Product> list = new ArrayList<>();
		Product product = null;
		try {
			conn();
			String sql = "select * from product";
			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				product = new Product();
				product.setProductName(rs.getString("product_name"));
				product.setProductPrice(rs.getInt("product_price"));
				product.setProductExplain(rs.getString("product_explain"));
				product.setProductId(rs.getString("product_id"));
				product.setProductSales(rs.getInt("product_sales"));
				product.setStores(rs.getString("stores"));
				list.add(product);

			}
		} catch (SQLException e) {
			System.out.println(" ※ ※ ※ Error 에러 코드표 확인 하세요 ※ ※ ※");
			System.out.println("해당 Error 코드 : " + e.getErrorCode());
			System.out.println("해당 원인 : " + e.getMessage());
			e.getMessage();
			e.getErrorCode();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	// 2-3) 점포별 상품 조회
	public List<Product> getStoreProduct(String stores) {
		List<Product> list = new ArrayList<>();
		Product product = null;
		try {
			conn();
			String sql = "select * from product where stores = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, stores);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				product = new Product();
				product.setProductName(rs.getString("product_name"));
				product.setProductPrice(rs.getInt("product_price"));
				product.setProductExplain(rs.getString("product_explain"));
				product.setProductId(rs.getString("product_id"));
				product.setProductSales(rs.getInt("product_sales"));
				product.setStores(rs.getString("stores"));
				list.add(product);

			}
		} catch (SQLException e) {
			System.out.println(" ※ ※ ※ Error 에러 코드표 확인 하세요 ※ ※ ※");
			System.out.println("해당 Error 코드 : " + e.getErrorCode());
			System.out.println("해당 원인 : " + e.getMessage());
			e.getMessage();
			e.getErrorCode();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	// 2-4
	public int insertProduct(Product product) {
		int result = 0;
		try {
			conn();
			String sql = "insert into product values(?,?,?,?,?,?)";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, product.getProductId());
			pstmt.setString(2, product.getProductName());
			pstmt.setInt(3, product.getProductPrice());
			pstmt.setString(4, product.getProductExplain());
			pstmt.setInt(5, product.getProductSales());
			pstmt.setString(6, product.getStores());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;

	}
	
	
	//2-5)삭제
	public int deleteProduct(String productId) {
		int result = 0;
		try {
			conn();
			String sql = "delete from product where product_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, productId);

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

}
