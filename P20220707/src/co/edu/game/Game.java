package co.edu.game;

public class Game {

	public void start() {

		game();

	}

	// 위치 변경하기 게임.
	public void game() {
		int POS_CNT = 10; // pos 갯수. 이 중 하나는 ==> 가 포함되어 있음.
		int LANE_CNT = 6; // lane 갯수.
		int COL_CNT = 10; // column 갯수.
		Pos[] pos = new Pos[POS_CNT];
		for (int i = 0; i < POS_CNT; i++) {
			int startPosition = (int) (Math.random() * (COL_CNT - 5)) + 5;
			pos[i] = new Pos(i % LANE_CNT, startPosition);
		}
		int[][] fields = new int[LANE_CNT][COL_CNT];
		int curx = 0, cury = 0;

		for (int times = 0; times < 100; times++) {
			pos[POS_CNT - 1] = new Pos(curx, cury);
			clear();
			System.out.println("________________________________________");
			for (int i = 0; i < fields.length; i++) {
				for (int j = 0; j < fields[i].length; j++) {
					boolean exist = false;
					for (int k = 0; k < pos.length - 1; k++) {
						if (i == pos[k].x && j == pos[k].y) {
							exist = true;
							// 위치변환.
							if (pos[k].y == 0) {
								int position = (int) (Math.random() * 6);
								pos[k] = new Pos(position, 9);
							} else {
								pos[k] = new Pos(pos[k].x, pos[k].y - 1);
							}

						}
					}
					if (pos[POS_CNT - 1].x == i && pos[POS_CNT - 1].y == j) {
						System.out.print("|==>");
					} else if (exist) {
						System.out.printf("|%s,%s", i, j);
						exist = false;
					} else {
						System.out.print("|___");
					}
				}
				System.out.println();
			}

			// 위치를 변경시키는 조건.
			for (int i = 0; i < pos.length - 1; i++) {
				if (pos[i].x == curx && pos[i].y == cury) {
					if (curx < 4)
						curx++;
					else
						curx--;
				}
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("----------------------------------------");
		System.out.println("menu");
	}

	public void clear() {
		for (int i = 0; i < 10; i++)
			System.out.println();
	}
}