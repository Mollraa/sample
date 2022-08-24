package co.edu.collect;
/*5번째 시간 예제
 * Stack
 */

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>(); // 생성자에는 제네릭 타입 안 써줘도 왼쪽에 있는 타입 따라감  new Stack<>();으로 써줘도 OK
		stack.push("홍길동");
		stack.push("김인수");
		stack.push("박찬호");
		
		String elem = stack.pop();   //pop 요소를 빼냄. 
		System.out.println(elem);
		
		elem = stack.peek(); 		// peek 보여주지만 빼내진 않음.
		System.out.println(elem);
		
		elem = stack.pop();
		System.out.println(elem); // peek에서 빠지지 않았으므로 이전 값 다시 나옴
		
		if (stack.isEmpty() ) {
			System.out.println("스택에 더 요소가 없음.");
		}
	}

}
