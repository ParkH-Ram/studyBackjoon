package Array_;

import java.util.Arrays;
import java.util.Scanner;

public class ques5_���İ����� {
	
	public static void main(String[]args) {
		
		
			int stu = 0;
			int [] score = {44, 96, 584, 545, 256, 356};
			int [] sc = null;
					
			
			

			
				
				//�������� ���� �� 
				System.out.printf(" ������ �Է��ϼ��� :  ");
				
				Scanner hi = new Scanner(System.in);
				score = new int[stu];
				
				
				for( int  j = 0; j<score.length-1; j++ ) {
					for(int k = j+1; k < score.length; k++) { // k:���ϴ� ����  j��° ������;
						if(score[j]>score[k]) {
							int temp = score[j]; // ���� �� �ٲ� �� temp �� 1 ����
							score[j] = score [k];
							score[k] = temp;
						}
					}
				}
				
				for(int i:score) {    // �迭 ��ȯ
					System.out.printf(i+" " );
			}
				
				
				
				
				//�������� ���� �� 
				System.out.printf(" \n ���� ���� ���� �� :  ");
				for( int  l = 0; l<score.length-1; l++ ) {
					for(int m = l+1; m < score.length; m++) { // k:���ϴ� ����  j��° ������;
						if(score[l] < score[m]) {
							int temp = score[l]; // ���� �� �ٲ� �� temp �� 1 ����
							score[l] = score [m];
							score[m] = temp;
						}
					}
				}
				
				for(int s:score) {    // �迭 ��ȯ
					System.out.printf(s+" ");
			}
			
			
			

	}
}
