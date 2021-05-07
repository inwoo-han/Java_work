package java_question;

import java.util.Scanner;

public class Exam4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, cnt=0;
		boolean re_chk = true;
		Scanner s = new Scanner(System.in);
		while(re_chk) {
			System.out.print("양의 정수 입력 (종료:-1) : ");
			int input_Num = s.nextInt();
			int result = 1;
			if(input_Num > 0) {
			for(int i = 1; i<=input_Num; i++) {
				 result *= i;
			}
			System.out.println(result);
			}
			else {
				re_chk = false;
			}
		}
	}

}
