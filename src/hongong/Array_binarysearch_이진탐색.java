package hongong;

import java.util.Scanner;

public class Array_binarysearch_����Ž�� {

	public static void main(String[]args) {
		
		int [] number = { 2, 4, 5, 6, 9, 33, 55, 77, 86, 99, 150, 230, 405};
		
		Scanner hi = new Scanner(System.in);
		
		int head = 0;
		int tail = number.length -1;
		int center = (tail+head) / 2;
		
		System.out.println("���� ���� �� �ϳ��� ���ÿ�.  2, 4, 5, 6, 9, 33, 55, 77, 86, 99, 150, 230, 405 ");
		int target = hi.nextInt();
		int temp = number[center];
		boolean find = false;  
		
		while (head <= tail) {
			if (target == temp) {    // ���� ã�� ���
				find = true;         //��� �� ����
				break;
			} else if (target > temp) {
				head = center + 1;
			} else {
				tail = center - 1;
			}
		
		center = (head + tail)/2;
		temp = number[center];
		}
		
		if(find == true) {
			center++;
			System.out.println("ã���� �ϴ� ���ڴ� " + center + "�� °�� �ֽ��ϴ�.");
		}else
			System.out.println("ã�� ���� �����ϴ�.");
	
		hi.close();
		
		
	}
	
}
