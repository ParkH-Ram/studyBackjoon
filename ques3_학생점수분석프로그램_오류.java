package Array_;

import java.util.Scanner;

public class ques3_�л������м����α׷�_���� {
	
	@SuppressWarnings("unused")
	public static void main (String[] args) {
		
		boolean run = true;     // ���� ���� ������ ���� boolean ����
		Scanner scan = new Scanner(System.in);
		int student=0;
		int sum = 0;
		int [] score = null;        //�迭 ���� 

	
		
		
		
		while (run) {
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
		System.out.println("-----------------------------------------------------------");
		System.out.printf("���� > ");
		int choice = scan.nextInt();
		
			switch(choice) {
				
				case 1 :
					
			         System.out.printf("�л��� > ");
			         student = scan.nextInt();	
			         score = new int[student];        // �迭�ȿ� �Է��� �л� ���� �־���. 
			         break;
				case 2 :
					
					for(int i = 0; i<score.length; i++) {   // �Էµ� score �� ���̸� �Է�
						
						
						System.out.printf("scores[" + i+"] > ");   //  scores[ + i +] > �������� �ؽ�Ʈ �Է�
						score[i] = scan.nextInt();    // i �� ������ �Է� ����
						
					}
					
					
					break;
					
				case 3 :
					
					for(int i = 0; i<score.length; i++) {
						System.out.println("scores[" + i+"] > "+ score[i]);   // 2������ �Է��� ������ ���
					}
					break;
					
				case 4 :
					int max = score[0];
					int min = score[0];
					
				
					for(int i = 0; i<score.length; i++) {
					
						
						sum += score[i];
					
						for(int num:score){
							max = Math.max(num, max);
							min = Math.min(num, min);
							
						}
						
						
						System.out.printf("�� ���� > "  + sum + "\n");
						System.out.printf("���� ���� > " + min+ "\n");
						System.out.printf("�ְ� ���� > " + max+ "\n");
						System.out.printf("��� ���� > " + (double)sum/student +"\n");
						break;
					}
					
					
					
					
					
					
					
				default : 
					
					run = false;          // 1~4�̿� ���� ���ý� ����
					

					System.out.printf("���� �մϴ�" );     //
				
				}
				
				
			
			
			}
		
		
	
		
		scan.close();
	    }

	
	
}	
