package ����;

import java.util.Scanner;

class Matdasi{
	int h,m,sum;
	// Ŭ���� ���� ����
	public Matdasi(int h, int m, int sum) {
		// Ŭ���� ������ ( �Ű� ������ �޴´� )

		this.h = h; 
		// �� Ŭ���� ������ �����ڿ� ����

		this.m = m;
		// �� Ŭ���� ������ �����ڿ� ����

		this.sum = sum;
	}
	public void setOven() {
		this.sum = (this.h*60) + this.m + this.sum;
		this.h = (this.sum/60)%24;  //  �� ���ؼ� 60���� ���� �� 24�� ���� ������ ���� ���ϸ� 
		//  0�� 0���� ǥ�� 25�� 1�� ǥ�� �ż� ����.
		this.m = this.sum%60;

		System.out.println(h+" "+m);		

	}
}
public class Main {

	public static void main(String[]args) {
	Scanner hi = new Scanner(System.in);
	int h,m,sum;
	h=hi.nextInt();
	m=hi.nextInt();
	sum=hi.nextInt();

	Matdasi Ove = new Matdasi(h, m, sum);	
	Ove.setOven();
	hi.close();

	}

}

