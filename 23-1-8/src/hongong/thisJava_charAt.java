package hongong;

import java.util.Scanner;

public class thisJava_charAt {
	
	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);
		String ssn = hi.nextLine() ;
		
	
	
		char gender = ssn.charAt(6);  //ssn�� �ɰ��� 7��° �ε����� ��ȯ
		switch (gender) {
		
		case '1':
		case '3':
			System.out.println("���� ����~");
			break;
		case '2':
		case '4':
			System.out.println("���� ����");
			break;
		
		
		}
		if (ssn.length() != 13) 
		System.out.println("���� ������?");

	}

}
