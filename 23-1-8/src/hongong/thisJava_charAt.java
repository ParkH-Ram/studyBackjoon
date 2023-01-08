package hongong;

import java.util.Scanner;

public class thisJava_charAt {
	
	public static void main(String[]args) {
		Scanner hi = new Scanner(System.in);
		String ssn = hi.nextLine() ;
		
	
	
		char gender = ssn.charAt(6);  //ssn을 쪼개고 7번째 인덱스를 반환
		switch (gender) {
		
		case '1':
		case '3':
			System.out.println("남자 겄쥬~");
			break;
		case '2':
		case '4':
			System.out.println("여자 에유");
			break;
		
		
		}
		if (ssn.length() != 13) 
		System.out.println("숫자 몰라유?");

	}

}
