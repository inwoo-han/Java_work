package java_question;

import java.util.Scanner;

public class Exam3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input_num = sc.nextInt();
		
		if (input_num > 0) {
			System.out.println("��� �Դϴ�.");
		}
		else if (input_num == 0){
			System.out.println("0 �Դϴ�");
		}
		else {
			System.out.println("���� �Դϴ�.");
		}
		
		sc.close();
	}

}
