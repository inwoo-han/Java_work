package java_question;

import java.util.Scanner;

public class Exam3_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if (a >= b) {
			if (b >= c) {
				System.out.println("�߾Ӱ� : " + b); // 3 2 1
			}
			else if (a <= c) {
				System.out.println("�߾Ӱ� : " + a); // 2 1 3
			}
			else {
				System.out.println("�߾Ӱ� : " + c); // 2 3 1
			}
		}
		else if (a > c) {
			System.out.println("�߾Ӱ� : " + a); // 3 1 2
		}
		else if (b > c) {
			System.out.println("�߾Ӱ� : " + c); // 1 3 2
		}
		else 
			System.out.println("�߾Ӱ� : " + b); // 1 2 3
		
	}
}
