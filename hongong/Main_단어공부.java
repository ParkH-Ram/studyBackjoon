package hongong;

import java.util.Scanner;

public class Main_�ܾ���� {
	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);
	
	int [] arr = new int[26];			// �迭 ���� ( ���ĺ� �� )
	int max = 0;						   // �ִ밪 ���� ����
	char nep ='?';                     // �����  char
	String s = hi.next().toUpperCase();   
	//����� �빮�ڷθ� �Ǵϱ� �빮�ڷ� �޾Ƽ� ���� ���~
	
	for(int i=0; i<s.length(); i++) {
		//�Է� ���� ���ڿ� ���� ��ŭ �ݺ��� for�� ����
		
		arr[s.charAt(i)-'A']++;
		//�迭[ ���ڿ��� i ��°�� �ִ� ���� -A�� ���� �� ] ������  ++ ������ �Է� 
		if(max<arr[s.charAt(i)-'A']) {
			// max�� ���ڿ��� i��°�� �ִ� ������ ������ �ƽ� ��ü
			max = arr[s.charAt(i)-'A'];
			//Ȯ�� ���� 11�Ǿ�� �ϴµ� �� 2�� �Ǵ���? �� max�� ����ϸ� arr[11] ���� 
			nep = s.charAt(i);
		}else if(max==arr[s.charAt(i)- 'A'])
			// ����� char = s.charAt�� i��°�� �ִ� �༮ 
			nep ='?';
	
	}
	System.out.println(nep);
	hi.close();
	}
	

}
	
	
//	for(int i=0; i<s.length(); i++) {
//		if('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
//			arr[s.charAt(i) -'A']++;                    //�Է� ���� ���ڿ��� �ɰ� ���� -A�� ���� ���� ī���� �߰�.
//		}else {
//			arr[s.charAt(i) - 'a']++;
//		}
		
