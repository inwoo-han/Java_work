package java_question;

import java.util.*;

public class Exam4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num1, num2;
		System.out.print("정수 값 2개 입력 : ");
		num1 = s.nextInt();
		num2 = s.nextInt();

		if(num1 > num2) {
			for (int i = num2+1; i<num1; i++) {
				System.out.println(i);
				//				int a = 0;
				//				a = num1;
				//				num1 = num2;
				//				num2 = a;
			}
		}
		else if(num2 > num1) {
			for (int i = num1+1; i<num2; i++) {
				System.out.println(i);
			}
		}
	}
}
