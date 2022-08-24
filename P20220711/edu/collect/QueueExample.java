package co.edu.collect;
/*5번째 시간 예제
 * Queue
 */

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		Queue<String> que = new LinkedList<>();

		que.offer("홍길동");
		que.offer("김민수");
		que.offer("황순호");

		while (!que.isEmpty()) {
			String result = que.poll();
			System.out.println(result);

		}
	}
}