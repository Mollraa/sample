package co.edu;

/*
 * 인스턴스 여러개 생성하지않고 하나만 존재.
 */
public class Singleton {
	
	private static Singleton instance = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return instance;
	}
}
