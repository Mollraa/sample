package co.edu.collect.generic;
/*2번째 시간 2번째 예제
 * 제네릭
 */

public class BoxExample2 {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("문자열");
		String result = box.get();
//		Integer result1 = box.get(); // String -> Integer 
		
		Box<Integer> intBox = new Box<Integer>();
		intBox.set(100); // int => Integer(boxing)
		int result1 = intBox.get(); // Integer => int(unboxing)
	}

}
