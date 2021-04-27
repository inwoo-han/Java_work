package java_question;

import java.util.Scanner;

public class Exam3_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int input_num = sc.nextInt();
		if (input_num < 0){
			System.out.println("절대값 : " + input_num * -1);
		}
		else {
			System.out.println("절대값 : " + input_num);
		}
	}

}
