package java_question;

import java.util.Scanner;

public class Exam5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int sum = a+b+c;
		double avg = sum/3.0;
		
		System.out.println("ÇÕ°è : " + sum);
		System.out.println("Æò±Õ : " + avg);
	}

}
