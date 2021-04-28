package java_question;

import java.util.Scanner;

public class Exam3_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int input_num1 = s.nextInt();
		int input_num2 = s.nextInt();
		
		if(input_num1 == input_num2) {
			System.out.println("두 값이 같습니다.");
		}
		else if(input_num1 > input_num2) {
			System.out.println("큰 값 : " + input_num1 + "\n작은 값 : " + input_num2);
		}
		else {
			System.out.println("큰 값 : " + input_num2 + "\n작은 값 : " + input_num1);
		}
		
		
	}

}
