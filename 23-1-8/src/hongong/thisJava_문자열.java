package hongong;

public class thisJava_���ڿ� {

	public static void main(String[]args) {
		String name1 = "����";
		String name2 = "����";
		
		if(name1 == name2 && name1.equals(name2)) 
			System.out.println("������ ���� ���뵵 ������");	
		
		String name3 = new String("����");
		String name4 = new String("����");

		if(name3 == name4 && name3.equals(name4))
			System.out.println("������ ���� ���뵵 ������");
		else if(name3 == name4)
			System.out.println("������ ������");
		else if(name3.equals(name4))
			System.out.println("������ �ٸ����� ���ͷ��� ������ ");
		
		System.out.println("������ ��������? " + (name1==name2));  // �� ��ȣ �� ���̴� ���ڿ� ����� �� �ǳ���?
		System.out.println("������ ��������? " + (name1==name3));
		System.out.println("������ ��������? " + (name1==name4));
		System.out.println("������ �ٸ����� ���ͷ��� ��������? "+name1.equals(name2));
		System.out.println("������ �ٸ����� ���ͷ��� ��������? "+name1.equals(name3));
		System.out.println("������ �ٸ����� ���ͷ��� ��������? "+name1.equals(name4));
		

		
	}

}
