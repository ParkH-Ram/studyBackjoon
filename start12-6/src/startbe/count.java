package startbe;

import java.util.ArrayList;

public class count {

	public static void main(String[] args) {
		
		 int[] score = { 10, 20, 30, 40, 50};    // 배열을 만들면서 값을 초기화 
		// int count = score.length;
		
		
		ArrayList<Integer> scoreList = new ArrayList <>() ; //중간 중간 값을 추가 하기 편함
		scoreList.add(10);
		scoreList.add(20);
		scoreList.add(30);
		scoreList.add(40);
		scoreList.add(50);
		scoreList.remove(2);
		
		
		//String[] names = new String[2]; //스트링은 초기화를 안해주면 null이 됨
		
		//String[]  names = { "홍길동", "이순신"};
		
		 System.out.println(scoreList);
		//  System.out.println(names[0]);
		// System.out.println(score[1]); // 스코어 숫자는 0 부터 카운트 
		// System.out.println(score[score.length - 1]) ;

	}

}
