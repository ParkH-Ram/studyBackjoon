package quest;

public class Calculator {   //클래스 설계도  사용할 수 있는 애들을 인스턴스 멤버
	
	double pi = 3.14159;
	
	static int plus(int x, int y) {   //메서드 동작을 하는 애들 
		return x + y;
	}	
		
	static int minus(int x, int y) {
		return x-y;
	}
}
