package practice;

import java.util.Scanner;

public class LeapYear 
{

	public static void main(String[] args) 
	{
      int year;  // �Է� ���� ����
    
      boolean leap = false;  // ���� ����

      Scanner scan = new Scanner(System.in);

		 // ������ �Է��϶�� ��û�Ѵ�
		 System.out.print("������ �Է��ϼ���: ");

		 // ������ �о� �鿩 year�� �����Ѵ�
		 year = scan.nextInt( );

      // ������ �������� �ƴ����� ���Ѵ�
      if (year % 400 == 0)
        leap = true;
      else if ((year % 4 == 0) && (year % 100 != 0))
                leap = true;

      // ���� ���θ� ����Ѵ�
      if (leap)
         System.out.println(year + "���� �����Դϴ�.");
      else
         System.out.println(year + "���� ������ �ƴմϴ�");
   }
}



