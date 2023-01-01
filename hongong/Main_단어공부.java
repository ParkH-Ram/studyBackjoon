package hongong;

import java.util.Scanner;

public class Main_단어공부 {
	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);
	
	int [] arr = new int[26];			// 배열 생성 ( 알파벳 수 )
	int max = 0;						   // 최대값 구할 변수
	char nep ='?';                     // 출력할  char
	String s = hi.next().toUpperCase();   
	//출력이 대문자로만 되니까 대문자로 받아서 세면 편안~
	
	for(int i=0; i<s.length(); i++) {
		//입력 받은 문자열 길이 만큼 반복할 for문 생성
		
		arr[s.charAt(i)-'A']++;
		//배열[ 문자열의 i 번째에 있는 값에 -A를 해준 뒤 ] 번지에  ++ 증감값 입력 
		if(max<arr[s.charAt(i)-'A']) {
			// max가 문자열의 i번째에 있는 값보다 작으면 맥스 교체
			max = arr[s.charAt(i)-'A'];
			//확인 값이 11되어야 하는데 왜 2가 되는지? 아 max를 출력하면 arr[11] 오잉 
			nep = s.charAt(i);
		}else if(max==arr[s.charAt(i)- 'A'])
			// 출력할 char = s.charAt의 i번째에 있는 녀석 
			nep ='?';
	
	}
	System.out.println(nep);
	hi.close();
	}
	

}
	
	
//	for(int i=0; i<s.length(); i++) {
//		if('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
//			arr[s.charAt(i) -'A']++;                    //입력 받은 문자열을 쪼갠 값에 -A를 해준 값에 카운터 추가.
//		}else {
//			arr[s.charAt(i) - 'a']++;
//		}
		
