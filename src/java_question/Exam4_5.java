package java_question;

import java.util.Scanner;

public class Exam4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num1;
		int i;
		System.out.println("ī��Ʈ �ٿ� ����");
		System.out.print("����� �Է� : ");
		try {
		num1 = s.nextInt();
		if(num1 > 0) {
			for (i = num1; i>=0; i--) {
				System.out.println(i);
				Thread.sleep(1000);
			}
			System.out.println("���� �� ������ : " + i);
		}
		else {
				System.out.println("����� �Է����ּ���.");
		}
		}
		
		catch(Exception e){System.out.println("�����߻� : " + e);}
	}

}
