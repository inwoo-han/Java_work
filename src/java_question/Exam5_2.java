package java_question;

import java.util.Scanner;

public class Exam5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int inputNum = s.nextInt();
		System.out.println("8���� : " + Integer.toOctalString(inputNum));
		System.out.println("16���� : " + Integer.toHexString(inputNum));
		
		System.out.printf("8���� : %o \n", inputNum);
		System.out.printf("16���� : %x \n", inputNum);
	}

}
