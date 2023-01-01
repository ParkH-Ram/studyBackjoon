package hongong;

import java.util.Scanner;

public class Main_문자열반복 {
	
	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);
	
	String S;        // 입력 받을 문자열
	int i,j, k;           //  문자열 돌릴
	int t = hi.nextInt();    // 몇 줄 출력 할지 정하는 1~100
	int r;					// 문자열을 몇번씩 반복할지 정하는

	
//	int number = hi.nextInt();    /
//	char alpa = (char)number;
//	System.out.println(alpa);           //숫자를 아스키코드로 변환하는 방법
	
	
	for (i=0; i<t; i++) {
		
		r = hi.nextInt();	
		// 문자열 반복할 횟수 입력 받고 
		// 스트링 입장 받고 
		S = hi.next();       //Line 을 쓰면 공백을 입으로 받아 버리기 때문에 주의 요함.
		
		for(j=0; j<S.length(); j++) {         
			//스트링 길이 만큼 반복
			// 스트링 마다 반복 횟수를 출력하기 위해 이중 포문 포에 포포문 
			for (k=0; k<r; k++) {    // 입력 받은 r 만큼 반복
				System.out.print(S.charAt(j));	
			//형변환 안하면 문자형 그대로 출력함.
			}
		}
		System.out.println();

	}
	hi.close();
	}

}