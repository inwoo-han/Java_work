package java_question;

import java.util.Scanner;

public class Exam4_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("´Ü¼ö : ");
		int inputNum = s.nextInt();

				for(int i=0; i<inputNum; i++) {
					for(int j=0; j<inputNum; j++) {
						System.out.print("* ");
					}
					System.out.println();
				}

		for (int i = 0; i < inputNum + 2; i++) {
			for (int j = 0; j < inputNum; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		s.close();
	}

}
