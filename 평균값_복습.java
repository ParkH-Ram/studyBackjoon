package ����;

import java.util.Scanner;

public class ��հ�_���� {
	
	public static void main(String[]args) {
		
		// ��հ� ���� ... �迭 ���� �ϴ� �ѹ� �غ���..
		// ����- �Է� ���� ��(n) ��ŭ ���� �ο�
		// �ο� �� ���� �� �ִ��� ���� �� ���� ���� �ִ����� ������ * 100 ���� 
		// �� �������� �� ���ϰ� �Է� ���� n���� ������  ��¥ �Է��ϰ� ���� ��Ʈ ����...
	Scanner hi = new Scanner(System.in);
		
		
	int i;    	 // for  �� ������ 
	
	
	float avg=0;   // ��հ� 
	float max=0;   // �ִ�
	
	
	float []score = new float[hi.nextInt()];  // �÷� 
	
	for (i=0; i<score.length;i++) {
		score[i] = hi.nextInt();    // ������ �� ����?
		if(max < score[i]) {
			max = score[i];
		}
	}
	for (i=0; i<score.length; i++) {
		avg += (score[i]/max) * 100;    //i �� ���� �ϳ��� �� ������~~
	}
	
	System.out.println(avg/score.length);
	
	
		
	}

}
