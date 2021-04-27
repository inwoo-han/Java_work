package java_question;

import java.util.Scanner;

public class Exam3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input_num = sc.nextInt();
//		switch(input_num % 3) {
//		case 0:
//			System.out.println("이 값은 3으로 나누어 집니다.");
//			break;
//		case 1:
//			System.out.println("이 값을 3으로 나눈 나머지는 1입니다.");
//			break;
//		case 2:
//			System.out.println("이 값을 3으로 나눈 나머지는 2입니다.");
//			break;
//		default:
//			System.out.println("양수가 아닌 값을 입력했습니다.");
//			break;
		
		if (input_num <= 0) {
			System.out.println("양수가 아닌 값을 입력했습니다.");
		}
		else if (input_num % 3 == 0) {
			System.out.println("이 값은 3으로 나누어 집니다.");
		}
		else if (input_num % 3 == 1) {
			System.out.println("이 값을 3으로 나눈 나머지는 1입니다.");
		}
		else if (input_num % 3 == 2) {
			System.out.println("이 값을 3으로 나눈 나머지는 2입니다.");
		}
	}

}
