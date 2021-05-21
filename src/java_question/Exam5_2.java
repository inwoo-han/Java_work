package java_question;

import java.util.Scanner;

public class Exam5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int inputNum = s.nextInt();
		System.out.println("8진수 : " + Integer.toOctalString(inputNum));
		System.out.println("16진수 : " + Integer.toHexString(inputNum));
		
		System.out.printf("8진수 : %o \n", inputNum);
		System.out.printf("16진수 : %x \n", inputNum);
	}

}
