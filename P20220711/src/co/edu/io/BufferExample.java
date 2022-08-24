package co.edu.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/* 
 * 3교시 1번째 예제
 * 보조스트림 생성. 바이트 기반 => 문자 기반 (InputStreamReader, OutStreamWriter)
 * 				버퍼스트림 (성능향상)
 */

public class BufferExample {
	public static void main(String[] args) {
		bufferReaderWriter();
	}

	
	// 버퍼스트림 
	public static void bufferReaderWriter() {
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/image.png");  // 기본
			BufferedInputStream bis = new BufferedInputStream(fis); //보조.
			
			FileOutputStream fos = new FileOutputStream("c:/Dev/buffer.png");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			while(true) {
				int bt = bis.read();
				if(bt == -1) {
					break;
				}
				bos.write(bt);
			}
			bos.flush();
			bos.close();
			bis.close();
			fis.close();
			fos.close();
		
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		System.out.println("실행. ");
	}
	public static void streamToReader() {
		InputStream is = System.in; // 키보드 입력.
		InputStreamReader isr = new InputStreamReader(is);
		char[] cbuf = new char [10];
		System.out.println("입력 > ");
		try {
			int b = isr.read(cbuf);
			for(int i=0; i<b; i++) // for 구문 중간에서 시행될때 중괄호 생략 가능
			System.out.print((char) cbuf[i]); 
			
			System.out.println();
			isr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행. ");
	}

	public static void StreamToWriter() {
		// 바이트 스트림 -> 문자 스트림.
		OutputStream os = System.out; // 키보드 입력 > 모니터(콘솔)에 값 출력.
		OutputStreamWriter osw = new OutputStreamWriter(os); // 앞에 File 붙이면 저장 후 출력 가능

		Scanner scn = new Scanner(System.in);
		System.out.println("입력 > ");
		String text = scn.nextLine();

		try {
			osw.write(text + "\n");
			osw.write("실행.");
			osw.flush();
			osw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
