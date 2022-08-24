package co.edu.collect.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardApp {
	public static void main(String[] args) {

		// 메뉴 선택 => 선택값 => 구현

		Scanner scn = new Scanner(System.in);
		//BoardDAO app = BoardDAO.getInstance();
	

		while (true) {
			System.out.println("1.목록 2.등록 3.조회(작성자) 4.삭제 5.종료");
			System.out.println("메뉴를 선택하세요 >>>> ");
			int selectNo = Integer.parseInt(scn.nextLine());

			if (selectNo == 1) {
				BoardDAO app = BoardDAO.getInstance();
				List<Board> list = app.boardList();
				for(Board brd : list) {
					System.out.println(brd.toString());
				}

			} else if (selectNo == 2) {
				
				System.out.println("제목을 입력해주세요.");
				String title = scn.nextLine();

				System.out.println("내용을 입력해주세요.");
				String content = scn.nextLine();

				System.out.println("작성자를 입력해주세요.");
				String writer = scn.nextLine();
				
				BoardDAO app = BoardDAO.getInstance();
				Board board = new Board(title,content,writer);
				app.add(board);				

			} else if (selectNo == 3) {
				System.out.println("조회할 작성자 명을 입력하세요.");
				String find = scn.nextLine();
				
				BoardDAO app = BoardDAO.getInstance();
				app.search(find);	
				
				System.out.println(app.boardList());
				
				

			} else if (selectNo == 4) {
				BoardDAO app = BoardDAO.getInstance();
				System.out.println("삭제할 게시글 이름을 입력하세요.");
				String delete = scn.nextLine();
				
				app.remove(delete);
				
				
				
				

			} else {
				System.out.println("프로그램 종료");
				break;

			}

		}

	}

}
