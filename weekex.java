package ch05.sec12;

import java.util.Calendar;

public class weekex {

	public static void main(String[] args) {
		//���� Ÿ�� ���� ����
		week today = null;
		
		//���� �� ����
		today = week.THURSDAY; 
		// ������ ���ŷ� ������ ���� ��� ����
		
		if(today == week.FRIDAY) {
			System.out.println("������ �ұ� �ƴϰ� ũ�������� ���ŷ���");
		}else {
			System.out.println("�ų��� �ݿ��� ����");
		}
		// ��ǻ�� ���� ���� 
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
		
		//���Ű� ��
		if(today == week.SUNDAY ) {
			System.out.println("������ �ұ� �ƴϰ� ũ�������� ���ŷ���");
		}else {
			System.out.println("�ų��� �ݿ��� ����");
		}

	}

}
