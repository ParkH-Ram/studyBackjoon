package hongong;

public class insertionSort {
	
//	삽입정렬은 첫번째부터 도는 버블정렬이나, 선택정렬과는 조금 다른 성격을 지닌다.
//	두번째 인덱스부터 시작해서 자신의 앞에있는 값들과 비교하여 적절한 위치를 찾아 넣어주는 형식으로 진행된다.
//	즉, 정렬을 위해 비교하는 범위 자체가 훨씬 적고,
//	연산도 최소 O(n)만큼만 발생할 수 있다.
	
	 public static void insertionSort(int[] arr) {
         // 정렬한 순서는 0번쨰가 아닌 1번째부터다
	        for (int i = 1; i < arr.length; i++) {
	            int key = arr[i];
				int position = i;
                // 자신의 바로 앞에 노드보다 값이 크기 전까지 뒤로 한칸씩 넣어줌 
	            while (position > 0 && key < arr[position - 1]) {
	                arr[position] = arr[position - 1];
	                position--;
	            }
				
	            arr[position] = key;
                
	            // 과정 출력
	            System.out.print(i+"번째 과정  : ");
	            for(int x : arr)
	            	System.out.print(x+" ");
	            System.out.println();
	        }
	    }
	 
	 public static void main(String[]args) {
		 
		 int[]arr= {59,99,32,14,78,59,34, 44, 33, 4};
		 insertionSort(arr);
		 for(int h : arr)
			 System.out.print(h+" ");
	
				 
		 }
		 
	 

}
