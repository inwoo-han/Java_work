package java_question;

import java.util.Scanner;

public class Exam3_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int input_num1 = s.nextInt();
		int input_num2 = s.nextInt();
		
		if(input_num1 == input_num2) {
			System.out.println("�� ���� �����ϴ�.");
		}
		else if(input_num1 > input_num2) {
			System.out.println("ū �� : " + input_num1 + "\n���� �� : " + input_num2);
		}
		else {
			System.out.println("ū �� : " + input_num2 + "\n���� �� : " + input_num1);
		}
		
		
	}

}
