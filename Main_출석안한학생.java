package 복습;

import java.util.Scanner;

public class Main_출석안한학생 {
	
	public static void main(String[]args) {
		
		Scanner hi = new Scanner(System.in);
		
		int [] Student = new int[30];
		int i;               //for 문 돌릴 변수
		int j;				 //for 문 돌릴 변수 
		
		for(i=0; i<28; i++) {      // 28명은 출석 2명은 결석 확인
			Student[hi.nextInt()-1] = 1;      // i=hi.nextInt 를 넣을 때 오류 이유는?  
			// i 번 돌리는 동안 입력 받은 번호 = 학생 번호 
			// -1을 해주는 이유는 실제 값과 인덱스 번호 구분
		}
		for(j=0; j<30; j++) {   // 30번 돌릴 j 생성
			if(Student[j] != 1 ) {      //Student[]안 값들 확인
				// Student[0~29],  28명 출석 2명 결석 찾기 위해 30번 돌려줌
				System.out.println(j+1);
			}
			
		}hi.close();
		
		
	}

}
