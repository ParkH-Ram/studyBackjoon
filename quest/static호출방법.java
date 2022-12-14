package quest;

public class static호출방법 {  //클래스가 메모리에 올라 간것을 인스턴스 
	
	public static void main (String[]args) {
	
		
		Calculator myCalcu = new Calculator();
		//인스턴스 필드를 적용해서 사용하려면 이런식으로 불러 와야 함..
		
		
		// static 으로 만들어서 호출할 필요가 없다 그냥 클래스 바로 호출 가능.
		//double result1 = 10 * 10 * myCalcu.pi;
		// myCalcu -> Calculator.pi 로 적용 가능.
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
