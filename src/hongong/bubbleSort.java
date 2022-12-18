package hongong;

public class bubbleSort {
	
//	배열의 크기만큼 반복 하되,
//	[ 0-1 ] , [ 1-2 ] , [ 2-3 ] . . . . . . [ (n-1)-n] 
//	이런식으로  바로 그 다음 노드와 비교해가면서 큰값을 뒤로보내주며 Sort하는 형식이다.
//	큰값하나가 뒤로가고 나머지 값들이 위로 한칸씩 올라가는 정렬이여서
//	여러 버블들이 보글보글 반복적으로 올라가는 것처럼 생각해서 버블소트이다.

 public static void bubbleSort(int[] arr) {
    final int length = arr.length;
    for (int i = 0; i < length; i++) {	// 배열의 길이만큼 도는데
        for (int j = 0; j < length - i; j++) {	// 0 ~ size -1까지
            if (j + 1 < length && arr[j] > arr[j + 1]) {	// 인접한 애들끼리 계속 비교하면서 자리교체
                arr[j] = arr[j] + arr[j + 1];	
                arr[j + 1] = arr[j] - arr[j + 1];
                arr[j] = arr[j] - arr[j + 1];
            }
        }
        // 과정 출력
        System.out.print(i+"번쨰 과정 ");
        for(int x : arr)
        	System.out.print(x+" ");
            System.out.println();
        }	        
 }
 
 public static void main(String[] args) {
	int[] arr = {8,54,99,3,2,1,0};
	bubbleSort(arr);
	for(int i : arr)
		System.out.print(i+" ");
	}
}
	
	

