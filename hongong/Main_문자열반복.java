package hongong;

import java.util.Scanner;

public class Main_���ڿ��ݺ� {
	
	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);
	
	String S;        // �Է� ���� ���ڿ�
	int i,j, k;           //  ���ڿ� ����
	int t = hi.nextInt();    // �� �� ��� ���� ���ϴ� 1~100
	int r;					// ���ڿ��� ����� �ݺ����� ���ϴ�

	
//	int number = hi.nextInt();    /
//	char alpa = (char)number;
//	System.out.println(alpa);           //���ڸ� �ƽ�Ű�ڵ�� ��ȯ�ϴ� ���
	
	
	for (i=0; i<t; i++) {
		
		r = hi.nextInt();	
		// ���ڿ� �ݺ��� Ƚ�� �Է� �ް� 
		// ��Ʈ�� ���� �ް� 
		S = hi.next();       //Line �� ���� ������ ������ �޾� ������ ������ ���� ����.
		
		for(j=0; j<S.length(); j++) {         
			//��Ʈ�� ���� ��ŭ �ݺ�
			// ��Ʈ�� ���� �ݺ� Ƚ���� ����ϱ� ���� ���� ���� ���� ������ 
			for (k=0; k<r; k++) {    // �Է� ���� r ��ŭ �ݺ�
				System.out.print(S.charAt(j));	
			//����ȯ ���ϸ� ������ �״�� �����.
			}
		}
		System.out.println();

	}
	hi.close();
	}

}