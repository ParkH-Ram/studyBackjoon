package hongong;

public class thisJava_�޼ҵ弱���ȣ�� {
	
	public static void main(String[]args) {
		int [] arr1;
		int [] arr2;
		int [] arr3;
		String s = "hello";           // �̰� Ȯ�� - ������ ���ͷ��� �Է��ϸ� ������ String ��ü�� ������ ����
		String v = "hello";           //�̰� Ȯ�� s�� v�� ������ �ٸ��� �ƴѰ�?  �迭�� ������ �Ȱ����� ��?..
			
		arr1 = new int[] {1, 2, 3};   // �迭 { 1, 2, 3}�� ���� �ϰ�  arr1  �� ����
		arr2 = new int[] {1, 2, 3};   // �迭 { 1, 2, 3}�� ���� �ϰ�  arr2  �� ���� 
		arr3 = arr2;  // �迭 ���� arr2�� ���� arr3�� ���� 
		
		System.out.println(arr1 == arr2);           //���� ������ �����ϴ��� Ȯ�� �ϴ°Ŷ� ���� ���Ƶ� false
		System.out.println(arr2 == arr3);			// ���� ������ ���� �ϹǷ� true
		System.out.println(arr1.equals(arr2));
		System.out.println(s==v);
		System.out.println(s.equals(v));
		
	}

}
