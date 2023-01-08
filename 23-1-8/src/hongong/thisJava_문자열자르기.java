package hongong;

import java.util.Scanner;

public class thisJava_문자열자르기 {
	
	public static void main(String[]args) {
		String ssn = "900000-1234567";
		
		String first = ssn.substring(0, 6);   //  ssn의 0번째 인덱스 부터 6번째 인덱스 까지 잘라내기 
		String last = ssn.substring(7);        // ssn의 7번째 인덱스 부터 끝까지 잘라내기  
		
		System.out.println("앞자리는 : " + first + "\n뒷자리는 : " + last);
		
		Scanner hi = new Scanner(System.in);
		
		String hello = hi.nextLine();
		
		String nam = hello.substring(0, 7);
		String man = hello.substring(9);
		System.out.println(nam);
		System.out.println(man);
		
		
		
		
		
	}

}
