package hongong;

public class Array_�迭��_�ּڰ�_�ִ�_���� {
	
	public static void main(String[]args) {
		
		int [] number = {10, 30, 50, 65, 75, 9, 8, 12, 32, 42, 4}; // �迭 ����
		
		int min = number[0];   // �ʱⰪ ����  0��° �迭
		int max = number[0];  // �ʱⰪ ���� 0��° �迭
		int minpos = 0;       // �ּڰ� ���  // �ʱⰪ ����
		int maxpos =0;        // �ִ� ��� // �ʱⰪ ����
		
		for (int i=1; i <number.length; i++) {   // i�� number �迭�� ���鼭 length���� ���� �� i ����
			if(min > number[i]) {			  // min�� �迭�� ���ٰ� min���� ���� ���� ������ 
				min = number[i];               // min�� ���� ���� ��  (�ݺ��ϴ� �ּڰ��� ������ ����)
				minpos = i+1;               	  // i�� �ε����� ���Ƿ� + 1�� ����� ���°�� ��.
			}								  //i�� �迭 �ȿ� �ִ� ���� �Ǿ� �ִ� �ε��� (��ġ)�� ��
			if(max < number[i]) {
				max = number[i];
				maxpos = i+1;
			}
			
		
		}
		System.out.print("���� ���� ���� " + min +"�̰�, ��ġ�� "+  minpos + "��° �Դϴ�. \n");
		System.out.print("���� ū ���� " + max +"�̰�, ��ġ�� "+  maxpos + "��° �Դϴ�.");
	}
	

}
