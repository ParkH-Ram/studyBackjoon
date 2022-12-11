package Array_;

import java.util.Arrays;
import java.util.Scanner;

public class ques5_정렬값설정 {
	
	public static void main(String[]args) {
		
		
			int stu = 0;
			int [] score = {44, 96, 584, 545, 256, 356};
			int [] sc = null;
					
			
			

			
				
				//오름차순 정렬 후 
				System.out.printf(" 점수를 입력하세요 :  ");
				
				Scanner hi = new Scanner(System.in);
				score = new int[stu];
				
				
				for( int  j = 0; j<score.length-1; j++ ) {
					for(int k = j+1; k < score.length; k++) { // k:비교하는 숫자  j번째 오른쪽;
						if(score[j]>score[k]) {
							int temp = score[j]; // 변수 값 바꿀 때 temp 에 1 놓기
							score[j] = score [k];
							score[k] = temp;
						}
					}
				}
				
				for(int i:score) {    // 배열 순환
					System.out.printf(i+" " );
			}
				
				
				
				
				//내림차순 정렬 후 
				System.out.printf(" \n 내림 차순 정렬 후 :  ");
				for( int  l = 0; l<score.length-1; l++ ) {
					for(int m = l+1; m < score.length; m++) { // k:비교하는 숫자  j번째 오른쪽;
						if(score[l] < score[m]) {
							int temp = score[l]; // 변수 값 바꿀 때 temp 에 1 놓기
							score[l] = score [m];
							score[m] = temp;
						}
					}
				}
				
				for(int s:score) {    // 배열 순환
					System.out.printf(s+" ");
			}
			
			
			

	}
}
