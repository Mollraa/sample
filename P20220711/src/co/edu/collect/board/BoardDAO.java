package co.edu.collect.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 목록 등록 조회(작성자) 삭제
 * 
 */

public class BoardDAO {
	//싱글톤.
	private static BoardDAO instance = new BoardDAO();
	List<Board> list; //필드
	public int getwriter;
	
	private BoardDAO() {
		list = new ArrayList<>();
	}

	
	public static BoardDAO getInstance() {
		return instance;
	}
	
	
	
	//1.목록
	public List<Board> boardList(){
		return list;
		
	}
	
	//2.등록
	public void add(Board board) {
		list.add(board);
		
		
	}
		
		
	
	
	
	//3.조회(작성자)
	public List<Board> search(String writer){
		List<Board> list = new ArrayList<>() ; //찾고자 하는 이름 => 리스트
		
		for(Board board : this.list) {
			if(board.getWriter().equals(writer)) {
		}
		}
		return list; //변수 > 메소드 끝나면 사라짐
	}
	
	//4.삭제(제목)
	public void remove(String title) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				break;
				
			}
		}
	}


	public void add(String title, String content, String writer) {
		// TODO Auto-generated method stub
		
	}
}
