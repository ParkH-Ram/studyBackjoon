package Array_;

import java.util.Scanner;

public class ques5_�����Է���_���� {
	
	public static void main (String[]args) {
		int temp = 0;
		int i, j;                 //i,j ,k �� ���� ������ ���� �ؾ���
		int k;
		int stu = 0;
		int [] score = null;       //����������  �迭 ���� ���� �� ���� ���� ���� Ȯ�� 
		
		Scanner hi = new Scanner(System.in);
		System.out.printf("�л� ���� �Է� �ϼ��� > ");
		stu = hi.nextInt();
		score = new int[stu];  // �迭 ���� ����
		for(i = 0; i<stu; i++) {
		
			System.out.printf((i+1) +"��° �л��� ������ �Է� �ϼ��� > \t" );
			score[i] = hi.nextInt();
			
		}
		
		for(j=0; j<score.length-1;j++) {
			for (k=0;  k < score.length-j-1;k++){
				if (score[j] > score[k]){
					temp = score[j];
					score[j] = score[k];
					score[k] = temp;
				}
				
				System.out.println(score[j]);
			

		}
	

			
		
		
	}
		

	
		
		
	
}
}
