package hongong;

public class SelectionSort {
	
//	선택정렬은 해당자리에 들어갈 최소값 or 최대값 (역순정렬시) 찾기라고 할 수 있다.
//	for문을 한번 돌때마다 한 자리가 완성되기 때문에,
//	기대값만큼만 정렬을 해줄수도 있다.
	
	 public static void selectionSort(int[] arr) {
		 final int length = arr.length;
		 for (int i = 0; i < length; i++) {
          int min = i;

          for (int j = i + 1; j < length; j++) {
        	  	if (arr[j] < arr[min]) {
                min = j;
                }
            }
            // 나보다 작은게 있으면 치환
          if (min != i) {
            arr[min] = arr[min] + arr[i];
            arr[i] = arr[min] - arr[i];
            arr[min] = arr[min] - arr[i];
        }	            
        // 과정 출력
        System.out.print((i+1)+"번쨰 과정  : ");
        for(int x : arr)
        	System.out.print(x+" ");
            System.out.println();
        }
    }
 
 
	 public static void main(String[] args) {
		 int[] arr = {8,54,99,3,2,1,0, 88, 44, 22, 5,3 ,2, 94, 43};
	;
	selectionSort(arr);
	for(int i : arr)
		System.out.print(i+" ");
}
	
}
