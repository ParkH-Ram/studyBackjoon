package Array_;

public class ques2_2중첩합과평균 {
	
	public static void main(String[] args) {
		
		int[][] arr = {
				{96, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum=0;
		int avg= 0;
		int count=0;
		
		for(int i = 0; i<arr.length; i++) { // 중괄호 개수 읽음
			for(int j = 0; j<arr[i].length; j++) {  // 괄호 안에 수를 읽음
			// arr( 배열) 수를 i가 읽어서 arr[i].length 길이를 읽으면
			// arr[i]가 배열안에 배열을 읽는 코드가 된다.
				count++; //  반복 한번당 카운트 (인원 수 파악)
				sum += arr[i][j]; // 2차원 배열의 값을 꺼내서 합한다
				avg =  sum/count; // 인원수로 총합을 나눈다
		    }
	    }
		System.out.println("총 인원수는 " + count );
		System.out.println("총합은" + sum); 
		System.out.println("총합의 평균은 " + avg);
		System.out.println("중괄호는 몇개 ? " + arr.length);
		
	}
	
}
