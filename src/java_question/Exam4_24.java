package java_question;

import java.util.Scanner;

public class Exam4_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("´Ü¼ö : ");
		int inputNum = s.nextInt();

		for(int i=1; i<=inputNum; i++) {
			for(int j=inputNum; j>i; j--) {
				System.out.print(" ");}

			for(int k=1; k<=(i-1)*2 + 1; k++) {
				System.out.print(i%10);
			}
			System.out.println();
		}
		s.close();
	}

}
