package java_question;

import java.util.Scanner;

public class Exam4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("1���� n���� �� ���ϱ� : ");
		
		int input = s.nextInt();
		int result = 0;
		
		for(int i=1; i<=input; i++) {
			System.out.print(i);
			if(i<input) {
				System.out.print(" + ");
			}
			result += i;
		}
		System.out.println(" = " + result);
	}

}
