package co.edu;

public class Variable {
	public static void main(String[] args) {
		byte b1 = 127; // -128 < byte < 127
		short s1 = 32767; // -32,768 < s < 32,767
		int n1 = 0; // -2147483648 < int < 2147483647
		long l1 = 214845434L; //-9223372036854775808

		int result = b1 + 20; //(int) b1 + 20;
		long result1 = l1 + (long) 20; // 데이터타입 변환 : 자동형변환
		result = (int) l1 +20; // 데이터타입 변환 : 강제형변환
		
		System.out.println(result);
		
		char c1 = 'A';
// c1++; // int 연산.
//		for(int i = 0; i < 27; i++) {
		System.out.println((int) c1++);
		System.out.println(c1++);
//		}
	
//		이력변경추가 2022.07.01 12:55 da
		System.out.println("이력변경추가.");
		
//zz

	}
}
	
