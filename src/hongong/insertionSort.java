package hongong;

public class insertionSort {
	
//	���������� ù��°���� ���� ���������̳�, �������İ��� ���� �ٸ� ������ ���Ѵ�.
//	�ι�° �ε������� �����ؼ� �ڽ��� �տ��ִ� ����� ���Ͽ� ������ ��ġ�� ã�� �־��ִ� �������� ����ȴ�.
//	��, ������ ���� ���ϴ� ���� ��ü�� �ξ� ����,
//	���굵 �ּ� O(n)��ŭ�� �߻��� �� �ִ�.
	
	 public static void insertionSort(int[] arr) {
         // ������ ������ 0������ �ƴ� 1��°���ʹ�
	        for (int i = 1; i < arr.length; i++) {
	            int key = arr[i];
				int position = i;
                // �ڽ��� �ٷ� �տ� ��庸�� ���� ũ�� ������ �ڷ� ��ĭ�� �־��� 
	            while (position > 0 && key < arr[position - 1]) {
	                arr[position] = arr[position - 1];
	                position--;
	            }
				
	            arr[position] = key;
                
	            // ���� ���
	            System.out.print(i+"��° ����  : ");
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
