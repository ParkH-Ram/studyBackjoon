package hongong;

public class thisJava_문자열 {

	public static void main(String[]args) {
		String name1 = "람스";
		String name2 = "람스";
		
		if(name1 == name2 && name1.equals(name2)) 
			System.out.println("번지도 같고 내용도 같아유");	
		
		String name3 = new String("람스");
		String name4 = new String("람스");

		if(name3 == name4 && name3.equals(name4))
			System.out.println("번지도 같고 내용도 같아유");
		else if(name3 == name4)
			System.out.println("번지는 같아유");
		else if(name3.equals(name4))
			System.out.println("번지는 다르지만 리터럴은 같아유 ");
		
		System.out.println("번지가 같은가유? " + (name1==name2));  // 왜 괄호 안 붙이니 문자열 출력이 안 되나유?
		System.out.println("번지가 같은가유? " + (name1==name3));
		System.out.println("번지가 같은가유? " + (name1==name4));
		System.out.println("번지는 다르지만 리터럴은 같은가유? "+name1.equals(name2));
		System.out.println("번지는 다르지만 리터럴은 같은가유? "+name1.equals(name3));
		System.out.println("번지는 다르지만 리터럴은 같은가유? "+name1.equals(name4));
		

		
	}

}
