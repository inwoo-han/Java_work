package java_question;

import java.util.Scanner;

public class Exam3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int input_Num = r.nextInt();
		
		if(input_Num <= 0 || input_Num > 12) {
			System.out.println("1~12 ������ ���� �Է����ּ���.");
		}
		else if (input_Num <= 5 && input_Num >=3){
			System.out.println("��");
		}
		else if (input_Num <= 8 && input_Num >=6){
			System.out.println("����");
		}
		else if (input_Num <= 11 && input_Num >=9){
			System.out.println("����");
		}
		else{
			System.out.println("�ܿ�");
		}
		
		r.close();
		
	}
}
