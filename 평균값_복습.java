package 복습;

import java.util.Scanner;

public class 평균값_복습 {
	
	public static void main(String[]args) {
		
		// 평균값 복습 ... 배열 없이 일단 한번 해보자..
		// 문제- 입력 받은 수(n) 만큼 점수 부여
		// 부여 된 점수 중 최댓값을 구해 각 점수 별로 최댓값으로 나누고 * 100 해줌 
		// 그 점수들을 다 더하고 입력 받은 n으로 나눠줌  진짜 입력하고 보면 종트 간단...
	Scanner hi = new Scanner(System.in);
		
		
	int i;    	 // for  문 돌려줌 
	
	
	float avg=0;   // 평균값 
	float max=0;   // 최댓값
	
	
	float []score = new float[hi.nextInt()];  // 플롯 
	
	for (i=0; i<score.length;i++) {
		score[i] = hi.nextInt();    // 번지에 값 저장?
		if(max < score[i]) {
			max = score[i];
		}
	}
	for (i=0; i<score.length; i++) {
		avg += (score[i]/max) * 100;    //i 값 마다 하나씩 싹 더해줌~~
	}
	
	System.out.println(avg/score.length);
	
	
		
	}

}
