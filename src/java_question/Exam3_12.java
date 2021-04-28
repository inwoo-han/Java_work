package java_question;

import java.util.Scanner;

public class Exam3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double input_num1 = s.nextDouble();
		double input_num2 = s.nextDouble();
		
		if(input_num1 > input_num2) {
			System.out.println(input_num1);
		}
		else if(input_num1 < input_num2) {
			System.out.println(input_num2);
		}
		
		
	}

}
