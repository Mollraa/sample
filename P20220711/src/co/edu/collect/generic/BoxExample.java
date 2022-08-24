package co.edu.collect.generic;
/*2번째 시간 2번째 예제
 * 제네릭
 */

public class BoxExample {

	public static void main(String[] args) {
		Box strBox = new Box();
		strBox.set(new String("문자열")); //매개값 : object
		String result = (String) strBox.get(); 
		System.out.println(result);
		
		Integer result2 = (Integer)strBox.get();
		System.out.println(result2);
		
		Box intBox = new Box();
		intBox.set(new Integer(100));
		Integer result1 = (Integer) intBox.get();
		System.out.println(result1);
		
		

	}

}
