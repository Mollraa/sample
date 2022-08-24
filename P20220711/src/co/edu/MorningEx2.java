package co.edu;
/*1교시 2번째 예제
 * 정수(int) 배열 (6개)
 * 임의의 값 6개를 출력하고
 * 합계, 최대값, 최소값, 평균 구하기
 */

public class MorningEx2 {

	public static void main(String[] args) {
		// 정수(int) 배열(6개) > intAry
		// 1~100까지 임의의 값 중에서 6개를 출력
		
		int intAry[] = new int[6];
		int max = intAry[0];
		int min = intAry[0];
		int sum = 0;
		double avg = 0;
		
				
		for(int i =0; i<intAry.length; i++) {
		intAry[i]= (int)(Math.random()*100)+1;
		
		if(max>intAry[i]) {max = intAry[i];
		}else if(max<intAry[i]) {min = intAry[i];
		}
		
		sum += intAry[i];
		}
		
		avg = (double) sum /intAry.length;
			
	// 임의의 수 6개 출력 
	//확장 for for( (2)타입변수 : (1) 배열){
	// (3) 실행문; }
	for(int num:intAry)
	{
		System.out.println(num);
	}
	System.out.println("합계는" + sum);
	System.out.printf("최대값은 %d, 최소값은 %d입니다\n",max,min);
	System.out.printf("평균은 %.1f입니다.",avg);
}
}