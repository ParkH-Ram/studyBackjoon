package Array_;

public class ques1_�ִ��ּڰ� {	
	
	public static void main (String [] args) {
		
		int[] array   = { 1, 5, 99, 77, 33, 22, 1050, 3, 8 ,2};
		
		int max = array[0];
		int min = array[0];
		
		for(int num:array) { 
			max  = Math.max(num, max);		
			//Math.max or Math.min = �Ű� ���� ��� ���	
			//�Է��� ���� ���� ū ���� or ���� ���� ���� ����
			min = Math.min(num, min);
		
			}
		System.out.println(max + " or " + min);
		
	}
		
		
}
