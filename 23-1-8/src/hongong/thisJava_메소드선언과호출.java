package hongong;

public class thisJava_메소드선언과호출 {
	
	public static void main(String[]args) {
		int [] arr1;
		int [] arr2;
		int [] arr3;
		String s = "hello";           // 이건 확인 - 동일한 리터럴을 입력하면 동일한 String 객체의 번지가 저장
		String v = "hello";           //이거 확인 s랑 v는 번지가 다른게 아닌가?  배열은 내용이 똑같은데 왜?..
			
		arr1 = new int[] {1, 2, 3};   // 배열 { 1, 2, 3}을 생성 하고  arr1  에 대입
		arr2 = new int[] {1, 2, 3};   // 배열 { 1, 2, 3}을 생성 하고  arr2  에 대입 
		arr3 = arr2;  // 배열 변수 arr2의 값을 arr3에 대입 
		
		System.out.println(arr1 == arr2);           //같은 번지를 참조하는지 확인 하는거라 값을 같아도 false
		System.out.println(arr2 == arr3);			// 같은 번지를 참조 하므로 true
		System.out.println(arr1.equals(arr2));
		System.out.println(s==v);
		System.out.println(s.equals(v));
		
	}

}
