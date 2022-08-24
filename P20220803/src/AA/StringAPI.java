package AA;

public class StringAPI {
	public static void main(String[] args) {
		String a = "aaa"; //100번지 주소값
		
		a = a+ "bbb" // 101번지 주소값 "aaabbbb"
		
		String b = "aaa"; //a와 b는 주소값이 같음

		String c = new String ("aaa"); // a와 c 는 주소값이 다름
		
		if (a==c) //false // ==는 주소값을 비교
			
		if (a.equals(c)) //true //.equals는 문자값을 비교
			
		StringBuilder sb = new StringBuilder();
		
		//100번지
		sb.append("aaa");
		//100번지
		sb.append("bb");
	}
}
