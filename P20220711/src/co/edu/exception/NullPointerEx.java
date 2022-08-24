package co.edu.exception;
/*1교시 3번째 예제 (실행예외 /예외처리 Try~catch~final)
 * 인스턴스 참조변수 = null
 */

public class NullPointerEx {


		public static void main(String[] args) {

			String name = "홍길동";
			name = null; // name -> null이 되어 이대로 쓰면 오류가 남
			try {
				System.out.println(name.toString());
				System.out.println("name 을 출력.");
			} catch (NullPointerException e) {
//				System.out.println(e.getMessage());
				e.printStackTrace(); // 예외 발생시 어느 위치에 오류가 났는지 출력해줌
			}
			System.out.println("프로그램 종료");
		}
	}
