package startbe;

import java.util.ArrayList;

public class count {

	public static void main(String[] args) {
		
		 int[] score = { 10, 20, 30, 40, 50};    // �迭�� ����鼭 ���� �ʱ�ȭ 
		// int count = score.length;
		
		
		ArrayList<Integer> scoreList = new ArrayList <>() ; //�߰� �߰� ���� �߰� �ϱ� ����
		scoreList.add(10);
		scoreList.add(20);
		scoreList.add(30);
		scoreList.add(40);
		scoreList.add(50);
		scoreList.remove(2);
		
		
		//String[] names = new String[2]; //��Ʈ���� �ʱ�ȭ�� �����ָ� null�� ��
		
		//String[]  names = { "ȫ�浿", "�̼���"};
		
		 System.out.println(scoreList);
		//  System.out.println(names[0]);
		// System.out.println(score[1]); // ���ھ� ���ڴ� 0 ���� ī��Ʈ 
		// System.out.println(score[score.length - 1]) ;

	}

}
