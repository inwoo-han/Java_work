package java_question;

import java.util.Scanner;

public class Exam3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input_num = sc.nextInt();
		
		if (input_num > 0) {
			System.out.println("양수 입니다.");
		}
		else if (input_num == 0){
			System.out.println("0 입니다");
		}
		else {
			System.out.println("음수 입니다.");
		}
		
		sc.close();
	}

}
