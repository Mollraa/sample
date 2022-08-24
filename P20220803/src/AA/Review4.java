package AA;

public class Review4 {
	public static void main(String[] args) {
		
		Culture movie = new Movie("추격자",7,5);
		
		movie.setTotalScore(4);
		movie.setTotalScore(5);
		movie.setTotalScore(1);
		movie.setTotalScore(3);
		movie.setTotalScore(5);
		
		movie.getInformation();
		System.out.println("============================================");
		
		Culture perfor = new Performance("지킬앤하이드",9,10);
		
		perfor.setTotalScore(5);
		perfor.setTotalScore(5);
		perfor.setTotalScore(2);
		perfor.setTotalScore(5);
		perfor.setTotalScore(3);
		perfor.setTotalScore(5);
		perfor.setTotalScore(4);
		
		perfor.getInformation();
	}
}
