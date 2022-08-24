package co.edu.exception;
/*2교시 2번째 예제 
 * 예외 떠넘기기(throws)
 */

public class ThrowExceptionEx2 {

	public static void main(String[] args) {
		
		String[] str = {"100", "200", "300", "400"}; //배열 값 null로 바꾸며 테스트 해보기
		
		try {
			subMethod(str);			
		}catch(NumberFormatException e) {
			System.out.println("예외종류 : NumberFormat 예외");
		}catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("예외종류 : 배열 범위초과 예외");
		}catch(Exception e2) {
			System.out.println("알 수 없는 예외가 발생");
		}finally { //finally 넣으면 정상 실행이든, 예외 생이든 상관없이 무조건 한번은 실행됨
			// 정상적인 실행 또는 예외가 발생 => 반드시 실행할 코드
			System.out.println("프로그램 정상 종료");
		}
		
		System.out.println("프로그램 종료");
		
	}
	
	public static void subMethod(String[] stryAry) 
			throws NumberFormatException, ArrayIndexOutOfBoundsException { //실행하는 시점의 예외, 직접 처리 해줘야함
		for (int i =0; i <4; i++) {
			int num = Integer.parseInt(stryAry[i]);
			System.out.println(num);
		}
	}

}
