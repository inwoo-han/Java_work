package java_question;

import java.util.Scanner;

public class Exam4_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("정수값: ");
		int inputNum = s.nextInt();
		int cnt=0;
		for(int i=1; i<=inputNum;i++) {
			if(inputNum % i == 0) {
				cnt++;
			}
		}
		if(cnt==2) {
			System.out.println("소수입니다.");
		}
		else {
			System.out.println("소수가 아닙니다.");
		}
		s.close();
	}

}
