package Array_;

public class ques2_2��ø�հ���� {
	
	public static void main(String[] args) {
		
		int[][] arr = {
				{96, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum=0;
		int avg= 0;
		int count=0;
		
		for(int i = 0; i<arr.length; i++) { // �߰�ȣ ���� ����
			for(int j = 0; j<arr[i].length; j++) {  // ��ȣ �ȿ� ���� ����
			// arr( �迭) ���� i�� �о arr[i].length ���̸� ������
			// arr[i]�� �迭�ȿ� �迭�� �д� �ڵ尡 �ȴ�.
				count++; //  �ݺ� �ѹ��� ī��Ʈ (�ο� �� �ľ�)
				sum += arr[i][j]; // 2���� �迭�� ���� ������ ���Ѵ�
				avg =  sum/count; // �ο����� ������ ������
		    }
	    }
		System.out.println("�� �ο����� " + count );
		System.out.println("������" + sum); 
		System.out.println("������ ����� " + avg);
		System.out.println("�߰�ȣ�� � ? " + arr.length);
		
	}
	
}
