package java_question;

import java.util.Scanner;

public class Exam3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int input_Num = r.nextInt();
		
		if(input_Num <= 0 || input_Num > 12) {
			System.out.println("1~12 사이의 값을 입력해주세요.");
		}
		else if (input_Num <= 5 && input_Num >=3){
			System.out.println("봄");
		}
		else if (input_Num <= 8 && input_Num >=6){
			System.out.println("여름");
		}
		else if (input_Num <= 11 && input_Num >=9){
			System.out.println("가을");
		}
		else{
			System.out.println("겨울");
		}
		
		r.close();
		
	}
}
