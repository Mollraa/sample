package co.edu.api;
/*3교시 3번째 예제
 * 클래스 정보, 메소드 정보 읽기(p482)
 */

import java.lang.reflect.Method;

public class ClassEx {
public static void main(String[] args) {
	//클래스의 정보 얻어오기.
	
	try {
		Class cls = Class.forName("java.lang.String");
		cls = String.class; //class 정보를 읽기 위해 타입 받아옴
		
		System.out.println(cls.getName());
		
		Method[] methods = cls.getMethods();
		for(Method method : methods) {
			System.out.println(method.getName());  //string의 메소드를 읽어오는 방법
		}
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}
}
