package practice;

import java.util.Scanner;

public class targetNumber {
	
	public static void main(String [] args) {
		
		int targetNumber;	// ����ڰ� ���߷��� ����ϴ� ����
		int guessNumber;	// ����ڰ� ������ ����
		int count = 0;			 // ����Ƚ��
		int sentinel;        //���ü���
		int again;           //��ӿ���
		
		targetNumber = (int)(Math.random()*100);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�� ���� ���߱� �����Դϴ�!!!! 1~100 ���ڸ� �����ϼ���!!!");
		guessNumber = scan.nextInt();
		
		while(guessNumber != targetNumber) {
			count++;
		
		if(guessNumber == targetNumber ) {
			System.out.println("�̷��� �ݹ� ���߱� �ֳ���!!! ");
			break;
			
		}
			System.out.println(count + " �ܿ� ����? ����");
		}
	
	

	}

}
