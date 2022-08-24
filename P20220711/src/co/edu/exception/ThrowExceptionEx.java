package co.edu.exception;
/*2교시 1번째 예제
 * 예외 떠넘기기(throws, p 460)
 */

import java.sql.DriverManager;
import java.sql.SQLException;



public class ThrowExceptionEx {
	public static void main(String[] args) {
		
		try{
		method1();
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void method1() throws ClassNotFoundException, SQLException  {
		
		Class.forName("java.lang.String"); // java lang에 있는 String을 컴파일 시점에 실행하겠다
		
		DriverManager.getConnection("","","");
	}

}
