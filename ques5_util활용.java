package Array_;

import java.util.Scanner;
import java.util.Arrays;

public class ques5_utilȰ�� {



		
		public static void main (String[]args) {
			Integer temp = 0;
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
				
				Arrays.sort(score);
				for(j = 0; j<score.length; j++) {
					System.out.print("[" + score[j] + "] ");
					
				}
				
			}	
		}

		

				
			
			
		
			

		
			
			
		
	
}

