package java_question;

import java.util.Scanner;

public class Exam4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int input_Num;
		do{
			
			System.out.print("���� ���� �Է��ϼ��� : ");
			input_Num = s.nextInt();
			
			if (input_Num > 0) {
				System.out.println("�� ���� ��� �Դϴ�.");
			}
			else if (input_Num < 0) {
				System.out.println("�� ���� ���� �Դϴ�.");
			}
			else {
				System.out.println("0 �Դϴ�.");
			}
			
			System.out.println("�ٽ� �ѹ� �Է��Ͻðڽ��ϱ�? Yes : 1, No : 0");
			input_Num = s.nextInt();
		} while(input_Num == 1);
		
		s.close();
	}

}
