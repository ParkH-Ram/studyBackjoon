package 복습;

import java.util.Scanner;

public class Main_오븐시계또복습 {
	public static void main(String[]arags) {
	Scanner hi = new Scanner(System.in);	
	int h,m;
	h = hi.nextInt();
	m = hi.nextInt();
	
	if(m<45) {
		if(h==0) h=23;
		else h-=1;
		
		m +=15;
	}else m-=45;
	
	System.out.println(h + " " + m);
	hi.close();
	}
}
