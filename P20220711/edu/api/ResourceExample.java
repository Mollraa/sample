package co.edu.api;
/*3교시 4번째 예제
 * Resource > 파일 경로 불러들이기(p.483)
 * dev - workspace - bin - co - edu - api에 
 * sample.txt 새로 만들고 코드 치기 (확장자 숨기기 되어 있으면 안 뜰 수 있음. 체크)
 */

public class ResourceExample {

	public static void main(String[] args) {
		
		Class cls = ClassEx.class;
		String path = cls.getResource("sample.txt").getPath();
		
		System.out.println("경로"+ path);
		

	}

}
