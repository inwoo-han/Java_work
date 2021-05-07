package java_question;

import java.util.Scanner;

public class Exam4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num1;
		System.out.print("정수 값 입력 : ");
		num1 = s.nextInt();
		if(num1 > 0) {
		for (int i = 0; i<num1; i++) {
			System.out.print("*");
			}
		System.out.println("");
		}
		else {
		}
		s.close();
	}
}
