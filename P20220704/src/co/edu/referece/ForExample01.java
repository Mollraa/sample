package co.edu.referece;

public class ForExample01 {
	public static void main(String[] args) {
		int[] tempAry = new int[5];
	//	tempAry = new int[] {3,4,5,6,7};
		for (int i = 0; i < tempAry.length; i++) {
			tempAry[i] = (int) (Math.random() * 50);
		}
		
		//제일 큰 값을 max;
		for (int num : tempAry) {
			System.out.println(num);
		} 
		//code Here
		int max = 0;
		for(int i=0; i< tempAry.length; i++) {
			if( i==0 || (tempAry[i] > max) )	// 배열의 첫번째 숫자거나 max보다 큰 경우
				max = tempAry[i];
		}
			
		System.out.println("제일 큰값: "+ max );
	}
}