package co.edu.api.example;

public class BytesToStringExample { //p.485 예제 참고 (바이트 -> 문자열)

	public static void main(String[] args) {
		byte[] bytes = { 73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
		String str = new String(bytes);
		System.out.println(str);

	}

}
