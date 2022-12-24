package practice;

import java.util.Scanner;

public class targetNumber {
	
	public static void main(String [] args) {
		
		int targetNumber;	// 사용자가 맞추려고 노력하는 숫자
		int guessNumber;	// 사용자가 추측한 숫자
		int count = 0;			 // 추측횟수
		int sentinel;        //감시숫자
		int again;           //계속여부
		
		targetNumber = (int)(Math.random()*100);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("자 숫자 맞추기 게임입니다!!!! 1~100 숫자를 선택하세요!!!");
		guessNumber = scan.nextInt();
		
		while(guessNumber != targetNumber) {
			count++;
		
		if(guessNumber == targetNumber ) {
			System.out.println("이렇게 금방 맞추기 있나요!!! ");
			break;
			
		}
			System.out.println(count + " 겨우 이제? ㅋㅋ");
		}
	
	

	}

}
