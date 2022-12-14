package quest;

public class 문제5 {

	public static void main(String[]args) {	
		
		Student hong = new Student();
		
		
		
		hong.name = "홍길동";
		hong.ban = 13;
		hong.no = 498;
		hong.kor = 99;
		hong.eng = 2;
		hong.math = 99;
		

		
		
		
		System.out.println(hong.info());  //클래스는 프로젝트가 다르면 적용 x
		
	}
	
}
