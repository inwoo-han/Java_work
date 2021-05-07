package java_question;

import java.util.Scanner;

public class Exam4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("몇 개를 표시할까요? : ");
		int input_Num = s.nextInt();
		
		for (int i = 0; i < input_Num; i++) {
			System.out.print("*+");
		}
		System.out.println();
	}

}
