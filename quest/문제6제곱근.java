package quest;


public class ����6������ {
	
	static double getDistance ( int x, int y, int x1, int y1 ) {
		
		double z;
		int xx, yy;
		
		xx = x1 - x;
		yy = y1 - y;
		
		z = Math.sqrt(xx+yy);
		
		return  z;
		

	}
	
	static double getDistance ( int x, int y) {
		
		int i,j;
		
		i = x;
		
		
		
	}
	
	public static void main(String[]args) {

	
		System.out.println(Math.round((getDistance(1, 1, 2, 2)*100))/100f);
		//100f ���ڸ� ������ �� �ڿ� f�� ���� 100�� 100���ε� �Ǽ��� 100�̶�� ��
		
		//������ ���� �Ҽ����� ����. 
		// Math.roun(n*100)/100 
		// n ���� ������ ���� ������ ����.
		
		
		

	}

}
