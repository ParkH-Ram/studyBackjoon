package hongong;

import java.util.Scanner;

public class thisJava_���ڿ��ڸ��� {
	
	public static void main(String[]args) {
		String ssn = "900000-1234567";
		
		String first = ssn.substring(0, 6);   //  ssn�� 0��° �ε��� ���� 6��° �ε��� ���� �߶󳻱� 
		String last = ssn.substring(7);        // ssn�� 7��° �ε��� ���� ������ �߶󳻱�  
		
		System.out.println("���ڸ��� : " + first + "\n���ڸ��� : " + last);
		
		Scanner hi = new Scanner(System.in);
		
		String hello = hi.nextLine();
		
		String nam = hello.substring(0, 7);
		String man = hello.substring(9);
		System.out.println(nam);
		System.out.println(man);
		
		
		
		
		
	}

}
