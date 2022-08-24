package co.edu;

public class Example02 {
	//나의 키:변수, 친구 키:변수.
	
	//나의 키가 더 큽니다.
	// else 나의 키가 더 작습니다.
	
	public static void main(String[] args) {
		
		boolean a1 = true;
		
		double h1 = 180.5;
		double h2 = 170.8;
		
		double theDifference = 0;
		
		a1 = h1 > h2;
		
		if (a1) {
			
			theDifference = h1 - h2;
			System.out.print("나의 키가 " + theDifference + "만큼 더 큽니다.");
		} else {
			theDifference = h2 - h1;
			System.out.print("나의 키가 " + theDifference + "더 작습니다.");
		}
	}
	
}
