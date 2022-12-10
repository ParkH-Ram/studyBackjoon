package Array_;

public class ques1_최댓값최솟값 {	
	
	public static void main (String [] args) {
		
		int[] array   = { 1, 5, 99, 77, 33, 22, 1050, 3, 8 ,2};
		
		int max = array[0];
		int min = array[0];
		
		for(int num:array) { 
			max  = Math.max(num, max);		
			//Math.max or Math.min = 매개 변수 묶어서 사용	
			//입력한 값중 가장 큰 숫자 or 가장 작은 숫자 선택
			min = Math.min(num, min);
		
			}
		System.out.println(max + " or " + min);
		
	}
		
		
}
