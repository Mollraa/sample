package co.edu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 1교시 1번째 예제
 * 입력 스트림, 출력 스트림( c:/Dev/data1.dat 만들기 > 읽어오기 )
 * 파일이 존재하지 않을 수 있으므로 예외처리해야함
 */
public class ByteExample {
	public static void main(String[] args) {
		long start = System.nanoTime();
		
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/image.png");
			FileOutputStream fos = new FileOutputStream("c:/Dev/image2.png");
			byte[] arr = new byte[100];
			
			while(true){
				int buf = fis.read(arr);
				if(buf == -1) {
					break;
				}
				
				fos.write(arr);
			}
			fos.flush();
			fos.close();
			fis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		long end = System.nanoTime();
		System.out.println("처리시간: " + (end - start));
		
		
		
	}
		
		
		
		
		
		
		
		public static void read2() {
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/data2.dat");
			byte[] arr = new byte[2];   			// byte[2] = 2바이트 뜻, 2개씩 읽어들인다
			while(true) { 							// 읽어들일 코드가 없을 때까지 읽겠다
				int buf = fis.read(arr);			// 배열 10, 20, 30 중 2byte씩(2개) 읽어들이고 나머지 값 출력. 배열 크기 리턴
				if(buf == -1) {						// -1 의미 : 읽을 것이 없다는 뜻
					break;
				}
				for(int i =0; i<buf;i++) {
					System.out.println(arr[i]);
				}
				System.out.println();
			}
			fis.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		System.out.println("실행");
	}	
		
	public static void write2() {
		byte[] arr = new byte[] { 10, 20, 30 };
		
		try {
			FileOutputStream fos = new FileOutputStream("c:/Dev/data2.dat");
			fos.write(arr);			// 배열을 이용하여 값을 한꺼번에 입력함
			fos.flush(); 			// 메모리에 남아 있는 정보 다 내보냄
			fos.close();			// 사용한 정보 다시 반환
		} catch (IOException e) {	//	IOException이 상위에 있어서 이렇게 해두면 FileNotFoundException 포함함	
			e.printStackTrace();
		}
			System.out.println("실행");
	}
	// Byte 기반으로 입력 스트림.
	public static void read1() {

		try {
			FileInputStream fis = new FileInputStream("c:/Dev/data1.dat"); // 파일 읽어들임

			while (true) {
				int buf = fis.read(); // 여기서 catch의 IOException e1 로 예외처리함
				if (buf == -1) {
					break;
				}
				System.out.println(buf);
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		System.out.println("실행.");
	}

	// Byte 기반으로 출력 스트림.
	public static void write1() {
		try {
			FileOutputStream fos = new FileOutputStream("c:/Dev/data1.dat");
			byte a = 10, b = 20, c = 30;

			fos.write(a);
			fos.write(b);
			fos.write(c);   // 여기서 catch의 IOException e로 예외처리로 처리함

			fos.flush();   // 메모리에 남아 있는 정보 다 내보냄
			fos.close();  // 사용한 정보 다시 반환

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("실행.");

	}
}
