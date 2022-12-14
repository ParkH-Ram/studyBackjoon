package quest;


public class 문제6제곱근 {
	
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
		//100f 숫자만 적었을 때 뒤에 f가 붙음 100은 100인인데 실수인 100이라는 뜻
		
		//도출한 값에 소숫점을 나눔. 
		// Math.roun(n*100)/100 
		// n 값에 지정한 값을 나오게 설정.
		
		
		

	}

}
