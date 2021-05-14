package java_question;

import java.util.Scanner;

public class Exam4_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("´Ü¼ö : ");
		int inputNum = s.nextInt();
		
		
		for(int i=0; i<inputNum; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=inputNum; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		s.close();
	}

}
