package co.edu.api;

import java.io.UnsupportedEncodingException;

/* 4번째 시간 책 예제풀기
 * p490  바이트 배열로 변환
 * 바이트 배열 변환 (getBytes())
 */

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕하세요";
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: "+ bytes1.length); 
		String str1 = new String(bytes1); 
		System.out.println("bytes1->String : " + str1); 
		//현재 UTF-8로 설정 되어 있어서  UTF-8 결과 값과 동일
		
		try {
			
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length : " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->String : " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length : " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes2->String : " + str3);
			
			
		} catch (UnsupportedEncodingException e) {
			
		}
	}

}
