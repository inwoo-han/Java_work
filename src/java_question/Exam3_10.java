package java_question;

import java.util.Scanner;

public class Exam3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input_num = sc.nextInt();
//		switch(input_num % 3) {
//		case 0:
//			System.out.println("�� ���� 3���� ������ ���ϴ�.");
//			break;
//		case 1:
//			System.out.println("�� ���� 3���� ���� �������� 1�Դϴ�.");
//			break;
//		case 2:
//			System.out.println("�� ���� 3���� ���� �������� 2�Դϴ�.");
//			break;
//		default:
//			System.out.println("����� �ƴ� ���� �Է��߽��ϴ�.");
//			break;
		
		if (input_num <= 0) {
			System.out.println("����� �ƴ� ���� �Է��߽��ϴ�.");
		}
		else if (input_num % 3 == 0) {
			System.out.println("�� ���� 3���� ������ ���ϴ�.");
		}
		else if (input_num % 3 == 1) {
			System.out.println("�� ���� 3���� ���� �������� 1�Դϴ�.");
		}
		else if (input_num % 3 == 2) {
			System.out.println("�� ���� 3���� ���� �������� 2�Դϴ�.");
		}
	}

}
