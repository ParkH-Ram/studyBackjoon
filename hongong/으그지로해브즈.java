package hongong;

import java.util.Scanner;

public class 으그지로해브즈 {
	
	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);	
	String S= hi.nextLine();
	for(int i =0; i<S.length(); i++) { //음 괄호 붙이고 안붙이고 차이 뭐였지..
	int num = (int)S.charAt(i);
	int h = 'L' - 'A';
	System.out.println('L'-'A' + "    " + h);
	System.out.println(num);
	System.out.print(S.charAt(i));	
	//확인 아스키코드 출력
	

	}

	}

}
