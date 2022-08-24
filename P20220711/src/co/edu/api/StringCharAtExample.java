package co.edu.api;
/*3교시 5번째 예제
 * p.487 예제
 */

public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn = "010624-1230123";
		ssn = "0106241230123";
		checkGender(ssn);

	} // end of main()

	public static void checkGender(String ssn) {
		char sex = ssn.charAt(7);
		if(ssn.length()==13) {     // '-'을 빼고 숫자로만 입력했을 경우
			sex = ssn.charAt(6);
		}							
				
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;

		case '2':
		case '4':
			System.out.println("여자입니다.");
		}

	}

}
