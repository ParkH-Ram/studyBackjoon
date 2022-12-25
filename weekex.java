package ch05.sec12;

import java.util.Calendar;

public class weekex {

	public static void main(String[] args) {
		//열거 타입 변수 생성
		week today = null;
		
		//열거 값 대입
		today = week.THURSDAY; 
		// 무조건 열거로 생성한 값만 사용 가능
		
		if(today == week.FRIDAY) {
			System.out.println("오늘은 불금 아니고 크리스마스 란거래용");
		}else {
			System.out.println("신나는 금요일 유후");
		}
		// 컴퓨터 요일 정보 
		Calendar now = Calendar.getInstance();
		int day = now.get(Calendar.DAY_OF_WEEK);
		
		switch(day) {
			case 1: today = week.SUNDAY; break;
			case 2: today = week.MONDAY; break;
			case 3: today = week.TUESDAY; break;
			case 4: today = week.WEDNESDAY; break;
			case 5: today = week.THURSDAY; break;
			case 6: today = week.FRIDAY; break;
			case 7: today = week.SATURDAY; break;
			}
		
		//열거값 비교
		if(today == week.SUNDAY ) {
			System.out.println("오늘은 불금 아니고 크리스마스 란거래용");
		}else {
			System.out.println("신나는 금요일 유후");
		}

	}

}
