package ����;

import java.util.Scanner;

public class Main_�⼮�����л� {
	
	public static void main(String[]args) {
		
		Scanner hi = new Scanner(System.in);
		
		int [] Student = new int[30];
		int i;               //for �� ���� ����
		int j;				 //for �� ���� ���� 
		
		for(i=0; i<28; i++) {      // 28���� �⼮ 2���� �Ἦ Ȯ��
			Student[hi.nextInt()-1] = 1;      // i=hi.nextInt �� ���� �� ���� ������?  
			// i �� ������ ���� �Է� ���� ��ȣ = �л� ��ȣ 
			// -1�� ���ִ� ������ ���� ���� �ε��� ��ȣ ����
		}
		for(j=0; j<30; j++) {   // 30�� ���� j ����
			if(Student[j] != 1 ) {      //Student[]�� ���� Ȯ��
				// Student[0~29],  28�� �⼮ 2�� �Ἦ ã�� ���� 30�� ������
				System.out.println(j+1);
			}
			
		}hi.close();
		
		
	}

}
