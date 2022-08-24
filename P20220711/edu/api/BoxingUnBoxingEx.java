package co.edu.api;

import java.util.Arrays;
import java.util.HashSet;

/* 6번째 시간 예제
 * 로또 번호 만들기
 */

public class BoxingUnBoxingEx {

	public static void main(String[] args) {
		// 로또 번호 생성. 1~45
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int temp = (int) (Math.random() * 45) + 1;
			lotto[i] = temp;
			
			for(int j=0; j<i ; j++) { // 현재 값과 동일한 값이 있는지 체크.
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			System.out.print(lotto[i] + " ");
				

				
			} 
		
	
	

 		//for문을 이용한 다른 방법 > for(int j =0~~~~) 대신 넣으면 됨
		for (int num : lotto) {
			System.out.println(num);
		} // 이 프로그램은 중복값이 나올 수 있다는 단점이 있음




		HashSet<Integer> set = new HashSet<Integer>();

		int cnt = set.size(); // 1,2,3,3 => 3 (중복제거)
		while (cnt < 6) {
			int temp = (int)(Math.random() * 45) + 1;		
			set.add(temp); // 중복된 값은 허용 안함.
			cnt = set.size();
			System.out.println(temp + "," + set.size());
			
		}
	}
}

