package java_question;

import java.util.Scanner;

public class Exam4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int input_Num;
		do{
			System.out.print("3�ڸ� ���� ���� ���� �Է��ϼ��� : ");
			input_Num = s.nextInt();
			if(input_Num < 100 || input_Num > 999) {
				System.out.println("3�ڸ� ���� ���������� �Է��ϼ���.");
			}
			else System.out.println("�Է��� �� : " + input_Num);
		} while(input_Num < 100 || input_Num > 999);
		
		s.close();
	}

}
