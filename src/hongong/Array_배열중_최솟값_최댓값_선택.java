package hongong;

public class Array_배열중_최솟값_최댓값_선택 {
	
	public static void main(String[]args) {
		
		int [] number = {10, 30, 50, 65, 75, 9, 8, 12, 32, 42, 4}; // 배열 선언
		
		int min = number[0];   // 초기값 선언  0번째 배열
		int max = number[0];  // 초기값 선언 0번째 배열
		int minpos = 0;       // 최솟값 출력  // 초기값 설정
		int maxpos =0;        // 최댓값 출력 // 초기값 설정
		
		for (int i=1; i <number.length; i++) {   // i가 number 배열을 돌면서 length보다 작을 때 i 증가
			if(min > number[i]) {			  // min이 배열을 돌다가 min보다 작은 수를 만나면 
				min = number[i];               // min은 작은 값이 됨  (반복하다 최솟값을 만나면 멈춤)
				minpos = i+1;               	  // i에 인덱스가 들어가므로 + 1을 해줘야 몇번째가 됨.
			}								  //i는 배열 안에 있는 저장 되어 있는 인덱스 (위치)가 됨
			if(max < number[i]) {
				max = number[i];
				maxpos = i+1;
			}
			
		
		}
		System.out.print("가장 작은 값은 " + min +"이고, 위치는 "+  minpos + "번째 입니다. \n");
		System.out.print("가장 큰 값은 " + max +"이고, 위치는 "+  maxpos + "번째 입니다.");
	}
	

}
