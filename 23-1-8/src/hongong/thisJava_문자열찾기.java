package hongong;

public class thisJava_문자열찾기 {

	public static void main(String[]args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);                  //프로그래밍 이 몇 번째 인덱스 부터 시작하는지 
		String sub = subject.substring(location);    //substring() 메서드 sub = subject 의 문자열 에서 location으로 찾은 위치  부터  잘라냄
		System.out.println(sub);
		
		location = subject.indexOf("자바");  // 자바는 몇 번째 인덱스 부터 시작하는지
		if(location != -1) {        // -1은 해당 문자열이 없을 때 출력 됨
			System.out.println("자바와 관련 있나?");
		} else{
			System.out.println("자바와 관련 없나?");
		}
		
		boolean result = subject.contains("자바");   //subject 문자열에 자바가 있니?
		if(result) {									// result = true
			System.out.println("자바와 관련 있나?");
		}else {
			System.out.println("자바와 관련 없나?");
		}
		
		
	}
}
