package java_question;

import java.util.*;

public class Exam4_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("ī��Ʈ�� ����� �Է����ּ��� : ");
		int input = s.nextInt();


		if(input>=0) {
			for (int i=input; i>=0; i--) {
				System.out.println(i);
			}
		}
		else {
			System.out.println("����� �Է����ּ���.");
		}
	}

}
