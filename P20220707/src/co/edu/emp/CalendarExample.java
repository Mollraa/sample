package co.edu.emp;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println(cal.get(Calendar.MONTH) + 1 + "월"); // 1월 : 0 ~ 12월 : 11 (+ 1 : 원래 우리달력)
		System.out.println(cal.get(Calendar.DATE) + "일");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "요일"); // 1(일) ~ 7(토)
		System.out.println(cal.getActualMaximum(Calendar.DATE) + "일"); // 말일날짜.

		cal.set(2022, 5, 1);
		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println(cal.get(Calendar.MONTH) + 1 + "월"); // 1월 : 0 ~ 12월 : 11 (+ 1 : 원래 우리달력)
		System.out.println(cal.get(Calendar.DATE) + "일");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "요일"); // 1(일) ~ 7(토)
		System.out.println(cal.getActualMaximum(Calendar.DATE) + "일"); // 말일날짜.

		int year = 2022;
		int month = 9;
		System.out.printf("%d년 %d월의 마지막날짜는 %d\n", year, month, getLastDate(year, month));
		System.out.printf("%d년 %d월 1일의 요일정보는 %d", year, month, getDayInfo(year, month));
	}

	// 년, 월 정보 => 해당 년, 월의 요일정보(메소드) 2022 9 => 30일.
	public static int getDayInfo(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);

		return cal.get(Calendar.DAY_OF_WEEK);

	}

	// 년, 월 정보 => 대항 년, 월의 말일정보(메소드) 2022 9 => 5요일
	public static int getLastDate(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1); // 7 -> 6

		return cal.getActualMaximum(Calendar.DATE); // 말일정보 가져오기
	}
}
