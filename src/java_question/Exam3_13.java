package java_question;

import java.util.Scanner;

public class Exam3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int input_num1 = s.nextInt();
		int input_num2 = s.nextInt();
		int result_sub = input_num1 - input_num2;
		
		if(result_sub < 0 ) {
			result_sub *= -1;
		}
		
		String result = (result_sub <= 10) ? "두 값의 차는 10 이하" : "두 값의 차는 11이상";
		
		System.out.println(result);
		
		System.out.println((result_sub <= 10) ? "두 값의 차는 10 이하" : "두 값의 차는 11이상");
		
		
	}
}
