package ����;

import java.util.Scanner;

public class Main_��հ� {
	
	public static void main(String[]args) {
		
	Scanner hi = new Scanner(System.in);
	
	double max=0 ;     //�Է� ���� �� �� �ִ�  // �ʱⰪ�� 0�� ������ ������ ���� ���� ��찡 �־��µ� �� ���� 0�� �־�� ����.. ��? ...
	int i;           // for �� ���� ����  
	int n;         // ������ ����
 	double avg=0;         // ��� ����
	
	double [] score  = new double[hi.nextInt()];  
	// double ���ھ� = �� ���� [ �Է�]  ù ��° �Է� ���� �迭 ��� ���ϴ� �Ŵ�
 	
 	for(i=0; i<score.length; i++) {     //������ �Է¹��� ���� ��ŭ ������..
 		score[i]=hi.nextInt();      // ���ھ� [i] <-- 0~ ���� ����ŭ �ε��� �� ���� �� �� ����.... �ù� .. ���� ����...
 		if(max<score[i]) {   // max ���� score[i]�� ũ�� �� ��ȯ
 			max = score[i];
 		}
 	}
 	
 	for(i=0; i<score.length; i++) {
 		avg += (score[i]/max)*100;
 	}
 
 		
 		System.out.println(avg/score.length);
 		hi.close();
 	}


}
