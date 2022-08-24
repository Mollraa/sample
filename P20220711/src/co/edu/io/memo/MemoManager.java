package co.edu.io.memo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// 등록, 조회, 삭제, 목록
public class MemoManager {

	// 필드
	List<Memo> memoStorage = new ArrayList<>(); // 컬렉션: 프로그램 시작 시점에서 저장
	Scanner scn = new Scanner(System.in);
	File file = new File("c:/Dev/memo.dat");

	// 생성자 > 싱글톤.
	private static MemoManager instance = new MemoManager();

	private MemoManager() { // 외부에서 못 부르게 차단
	 // 파일 정보 => ArrayList
		readFromFile();

	}
	public static MemoManager getInstance() {
		return instance; // getInstance 형태로만 외부에서 부를 수 있음
	}

	// 등록.
	public void inputDate() { // memostorage에 등록(저장) 기능
		System.out.println("메모번호> ");
		int no = Integer.parseInt(scn.nextLine());
		System.out.println("작성날짜> ");
		String date = scn.nextLine();
		System.out.println("내용> ");
		String content = scn.nextLine(); // 오류 방지 목적으로 nextLine 쓰는 중~ nextInt 쓰면 두줄 출력 될 때가 있음

		memoStorage.add(new Memo(no, date, content)); // memoStorage.add(~~~) : ~~~ 내용 저장함

	}

	// 날짜 입력하고 모든 메모 출력.
	public void seearch() {
		System.out.println("날짜입력 > ");
		String memoDate = scn.nextLine();
		boolean isExist = false; // if 구문이 실행 되었는지 확인하기 위해 선언, 메모가 있는지 없는지!

		for (int i = 0; i < memoStorage.size(); i++) { // .size 사용시 안에 있는 사이즈(?) 만큼 다 돌게됨
			if (memoDate.equals(memoStorage.get(i).getDate())) { // memoStorage 안에 있는 getDate 가지고 온다는 뜻 = get
				System.out.println(memoStorage.get(i).toString());
				isExist = true;
			}
		}
		if (isExist == false) // if(!isExist) 로 써도 됨. 윗줄의 true가 아니면 (! = not) false와 뜻 같으므로
			System.out.println("해당 날짜의 메모가 없습니다.");
	}

	// 번호 -> 삭제
	public void deleteDate() {
		System.out.println("삭제번호 입력 > ");
		int delNo = Integer.parseInt(scn.nextLine()); // delNO와 동일한 값을 지울 것임 > 반복자 이용
		Iterator<Memo> iter = memoStorage.iterator(); // 반복자 획득하는 방식 ( 반복문 대체 )
		while (iter.hasNext()) {
			Memo memo = iter.next(); // 메모 = 반복자 iter 값
			if (memo.getNo() == delNo) { // 반복자 iter 값에서 찾은 번호와 입력 번호가 같으면
				iter.remove(); // .remove 이용하여 반복자 iter 값 삭제
				System.out.println("삭제완료.");
				return;
			}
		}

		System.out.println("일치하는 번호가 없습니다."); // return 다 해보고 없으면 이 문구가 출력됨
	}

	// 종료.
	public void storeToFile() {					//입력한 값을 ArrayList 파일에 저장하는 기능 메소드 
		try {
			FileOutputStream fos = new FileOutputStream(file); // 이 문장 입력해서 예외처리(try catch)함
			// 객체 처리해주는 보조스트림 objectOutputStream : ArrayList 이용 => 바이트 배열 변경.
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(memoStorage); // 객체타입 -> 바이트타입 변경 (직렬화)
			oos.close();				// 객체->바이트 변경(직렬화) 하기 위해 Memo에서 implements Serializable 추가함

		} catch (IOException e) {

			e.printStackTrace();		
		}
	}

// ArrayList에서 파일 정보를 읽어와서 컬렉션타입으로 변경(파일 -> 컬렉션), 바이트타입 -> 객체타입 (역직렬화)
	public void readFromFile() {
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			memoStorage = (List<Memo>) ois.readObject(); //memoStorate = ArrayList
			ois.close();
			
		} catch (IOException | ClassNotFoundException e) {

			e.printStackTrace(); 
		}
	}
}