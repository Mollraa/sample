package co.edu.api;

import java.io.UnsupportedEncodingException;

/*2교시 3번째 예제, 3교시 5번째 예제(p485)
 * 자바 API_String / String 생성자
 */

public class StringEx {

	public static void main(String[] args) {

		String name = "홍길동";
		name = new String("홍길동") ; //일반적인 문자열 호출, 표현 
		
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97}; //byte 타입을 받아 문자열 표현
		
		try {											// UTF-8 지정 위해서 Try~Catch 사용
			name = new String(bytes, 0, 5, "UTF-8");   // (bytes, 0, 5) 에서 0은 현재 자리 포함, 5는 현재자리 앞까지 뜻.
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		} 
		System.out.println(name);
		
		
		char fName = name.charAt(0);	//charAt : Returns the char value at the specified index.
		System.out.println(fName);

	}

}
