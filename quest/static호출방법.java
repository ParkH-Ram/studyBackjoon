package quest;

public class staticȣ���� {  //Ŭ������ �޸𸮿� �ö� ������ �ν��Ͻ� 
	
	public static void main (String[]args) {
	
		
		Calculator myCalcu = new Calculator();
		//�ν��Ͻ� �ʵ带 �����ؼ� ����Ϸ��� �̷������� �ҷ� �;� ��..
		
		
		// static ���� ���� ȣ���� �ʿ䰡 ���� �׳� Ŭ���� �ٷ� ȣ�� ����.
		//double result1 = 10 * 10 * myCalcu.pi;
		// myCalcu -> Calculator.pi �� ���� ����.
		//int result2 = myCalcu.plus(10,5);
		//int result3 = myCalcu.minus(10,5);
		
				
		
		//double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10,5);
		int result3 = Calculator.minus(10,5);
		
		
		System.out.println("t1 : " + result1);
		System.out.println("t2 : " + result3);
		System.out.println("t3 : " + result3);
		
			
	}
	
	

}
