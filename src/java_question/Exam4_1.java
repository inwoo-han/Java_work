package java_question;

import java.util.Scanner;

public class Exam4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int input_Num;
		do{
			
			System.out.print("정수 값을 입력하세요 : ");
			input_Num = s.nextInt();
			
			if (input_Num > 0) {
				System.out.println("이 값은 양수 입니다.");
			}
			else if (input_Num < 0) {
				System.out.println("이 값은 음수 입니다.");
			}
			else {
				System.out.println("0 입니다.");
			}
			
			System.out.println("다시 한번 입력하시겠습니까? Yes : 1, No : 0");
			input_Num = s.nextInt();
		} while(input_Num == 1);
		
		s.close();
	}

}
