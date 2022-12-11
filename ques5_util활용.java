package Array_;

import java.util.Scanner;
import java.util.Arrays;

public class ques5_util활용 {



		
		public static void main (String[]args) {
			Integer temp = 0;
			int i, j;                 //i,j ,k 는 전역 변수로 지정 해야함
			int k;
			int stu = 0;
			int [] score = null;       //전역변수로  배열 설정 했을 때 오류 생긴 이유 확인 
			
			Scanner hi = new Scanner(System.in);
			System.out.printf("학생 수를 입력 하세요 > ");
			stu = hi.nextInt();
			score = new int[stu];  // 배열 지역 변수
			for(i = 0; i<stu; i++) {
			
				System.out.printf((i+1) +"번째 학생의 점수를 입력 하세요 > \t" );
				score[i] = hi.nextInt();
				
				Arrays.sort(score);
				for(j = 0; j<score.length; j++) {
					System.out.print("[" + score[j] + "] ");
					
				}
				
			}	
		}

		

				
			
			
		
			

		
			
			
		
	
}

