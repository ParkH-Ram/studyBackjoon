package hongong;

public class thisJava_���ڿ�ã�� {

	public static void main(String[]args) {
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location);                  //���α׷��� �� �� ��° �ε��� ���� �����ϴ��� 
		String sub = subject.substring(location);    //substring() �޼��� sub = subject �� ���ڿ� ���� location���� ã�� ��ġ  ����  �߶�
		System.out.println(sub);
		
		location = subject.indexOf("�ڹ�");  // �ڹٴ� �� ��° �ε��� ���� �����ϴ���
		if(location != -1) {        // -1�� �ش� ���ڿ��� ���� �� ��� ��
			System.out.println("�ڹٿ� ���� �ֳ�?");
		} else{
			System.out.println("�ڹٿ� ���� ����?");
		}
		
		boolean result = subject.contains("�ڹ�");   //subject ���ڿ��� �ڹٰ� �ִ�?
		if(result) {									// result = true
			System.out.println("�ڹٿ� ���� �ֳ�?");
		}else {
			System.out.println("�ڹٿ� ���� ����?");
		}
		
		
	}
}
