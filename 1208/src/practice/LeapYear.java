package practice;

import java.util.Scanner;

public class LeapYear 
{

	public static void main(String[] args) 
	{
      int year;  // 입력 받은 연도
    
      boolean leap = false;  // 윤년 여부

      Scanner scan = new Scanner(System.in);

		 // 연도를 입력하라고 요청한다
		 System.out.print("연도를 입력하세요: ");

		 // 연도를 읽어 들여 year에 저장한다
		 year = scan.nextInt( );

      // 연도가 윤년인지 아닌지를 정한다
      if (year % 400 == 0)
        leap = true;
      else if ((year % 4 == 0) && (year % 100 != 0))
                leap = true;

      // 윤년 여부를 출력한다
      if (leap)
         System.out.println(year + "년은 윤년입니다.");
      else
         System.out.println(year + "년은 윤년이 아닙니다");
   }
}



