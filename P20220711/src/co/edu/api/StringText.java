package co.edu.api;
/* 5번째 시간 예제
 * 1. 자바 문자열 포함된 문자열 찾아서 개수 세기 >>indexOf()
 * 2. 파일 확장자, 파일명 골라내기 >> 
 * 3. 문자열 잘라서 넣기 (tel. 031-2103-3478 형식) >>substring
 * 4. 주민등록번호 여자, 남자 판별_문자추출 >> charAt
 */

public class StringText {

	public static void main(String[] args) {
		String[] str = { "자바", "자바다", "이것이자바다", "자바스크립트", "자 바" };
		// "자바" 문자열 포함.

		int cnt = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].indexOf("자바") != -1) {
				cnt++;
			}

		}
		System.out.println("자바 문자열이 포함된 배열요소 : " + cnt);

		
				
		String path = "c:/images/hello.png"; // 파일명, 확장자명
		int fileName = path.lastIndexOf("/");
		int extension = path.indexOf(".");
		System.out.println("파일명 : " + path.substring((fileName +1),extension));
		System.out.println("확장자 : " + path.substring(extension +1));
		
	
		
		

		String tel = "";
		String[] tels = { " 031", " 210 3", "34 78 " };
		// tel에 031-2103-3478
		tel = tels[0].trim() + "-"+ tels[1].trim().replace(" ", "")+ "-" +tels[2].trim().replace(" ","");
		System.out.println(tel);
		
		

		String[] ssn = { "970403-1234123", "010503 3456123", //
				"980123/2412345", "0202023217891" };

		for (int i = 0; i < ssn.length; i++) {
			checkGender1(ssn[i]);

		}

	}
public static void checkGender1(String ssn) {
	String[] str = ssn.split(""); // 구분자를 기준으로 문자열을 배열로 만들어주는 메소드.
	String replaceSsn = "";
	for(int i = 0; i < str.length; i++) {
		replaceSsn +=str[i].replace("-", "").replace("/","").replace(" ", "");
	}
	char sex = replaceSsn.charAt(6);
	switch (sex) {
	case '1' :
	case '3' :
		System.out.println("남자입니다.");
		break;
	case '2' :
	case '4' :
		System.out.println("여자입니다.");
	
	
	}
}
	

	

	public static void checkGender(String string) {
		// TODO Auto-generated method stub
		
	}
	}
	


