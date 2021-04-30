package java_question;

import java.util.Scanner;

public class Exam4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int input_Num;
		do{
			System.out.print("3자리 양의 정수 값을 입력하세요 : ");
			input_Num = s.nextInt();
			if(input_Num < 100 || input_Num > 999) {
				System.out.println("3자리 양의 정수값으로 입력하세요.");
			}
			else System.out.println("입력한 값 : " + input_Num);
		} while(input_Num < 100 || input_Num > 999);
		
		s.close();
	}

}
