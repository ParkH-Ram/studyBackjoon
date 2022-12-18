package hongong;

import java.util.Scanner;

public class Array_binarysearch_이진탐색 {

	public static void main(String[]args) {
		
		int [] number = { 2, 4, 5, 6, 9, 33, 55, 77, 86, 99, 150, 230, 405};
		
		Scanner hi = new Scanner(System.in);
		
		int head = 0;
		int tail = number.length -1;
		int center = (tail+head) / 2;
		
		System.out.println("다음 정수 중 하나를 고르시오.  2, 4, 5, 6, 9, 33, 55, 77, 86, 99, 150, 230, 405 ");
		int target = hi.nextInt();
		int temp = number[center];
		boolean find = false;  
		
		while (head <= tail) {
			if (target == temp) {    // 수를 찾은 경우
				find = true;         //블룸 값 변경
				break;
			} else if (target > temp) {
				head = center + 1;
			} else {
				tail = center - 1;
			}
		
		center = (head + tail)/2;
		temp = number[center];
		}
		
		if(find == true) {
			center++;
			System.out.println("찾고자 하는 숫자는 " + center + "번 째에 있습니다.");
		}else
			System.out.println("찾는 수가 없습니다.");
	
		hi.close();
		
		
	}
	
}
