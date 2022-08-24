package co.edu;

public class Example03 {
	public static void main(String[] args) {
		// 월 => 30일, 31일, 28일...
		int month = (int) (Math.random() * 12) + 1;
		System.out.println(month);

		int lastDate = -1;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			lastDate = 31;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			lastDate = 30;
		} else {
			lastDate = 28;
		}
		System.out.println(month + "월은 " + lastDate + "가 말일입니다.");

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			lastDate = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			lastDate = 30; break;
		default:
			lastDate = 28;
		}
		System.out.println(month + "월은 " + lastDate + "가 말일입니다.!");
		System.out.printf("%d월은 %d가 말일입니다!", month, lastDate);
	}
}
