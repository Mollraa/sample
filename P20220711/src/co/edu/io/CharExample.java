package co.edu.io;
/* 2교시 1번째 예제
 * 보조스트림 생성
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CharExample {
	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("c:/Dev/test.txt");
			char[] cbuf = new char[10];
			int buf = 0 ;
			while((buf = fr.read(cbuf)) != -1) {  //매개값 있는 경우 읽어들인 매개값 크기(10byte)만큼 리턴
				for(int i = 0; i < buf; i++) {
					System.out.print(cbuf[i]); // 읽어들인 버퍼의 크기만큼 반복
				}
				System.out.println(); // 줄바꾸면서 출력
				
			}
			fr.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		System.out.println("실행.");
		
	}
		
		
		
		
		
		
		public static void reader1() { // 직접 입력한 파일 불러들이기 
		try {
			FileReader fr = new FileReader("c:/Dev/test.txt");
			
			while(true) {
			int buf = fr.read();			// .read : 2byte씩 읽어들임. 매개 없는 경우 바이트 만큼 반환
			if(buf == -1) {
				break;
			}
			System.out.print((char)buf);
			
			}
			fr.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		System.out.println("실행.");
		
	}
		public static void witer1() {  // 파일 직업 입력하고 저장하기
		
			Scanner scn = new Scanner(System.in);	// 사용자가 직접 파일 내용 입력
			System.out.println("입력>");
			String txt = "";
			
			try {
				FileWriter fw = new FileWriter("c:/Dev/test.txt"); // Writer : 출력스트림 
				while(true) {
					try{
						txt = scn.nextLine();
							
					} catch (NoSuchElementException e){ 			// ctrl + z 로 시행종료
					break;
				}

					fw.write(txt +"\n");
				}
				
				fw.flush();
				fw.close();

			} catch(IOException e) {
				e.printStackTrace();
	}
			System.out.println("실행.");
	}

}
