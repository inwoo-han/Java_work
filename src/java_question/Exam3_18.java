package java_question;

import java.util.Scanner;

public class Exam3_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int input_num1 = s.nextInt();
		int input_num2 = s.nextInt();
		int[] num_Array = new int[2];
		
		if(input_num1 > input_num2) {
		}
		else if(input_num1 < input_num2) {
			int num;
			num = input_num1;
			input_num1 = input_num2;
			input_num2 = num;
		}
		
		System.out.println(input_num1 + "/" + input_num2);
	}

}
