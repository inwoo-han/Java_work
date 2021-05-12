package java_question;

import java.util.Scanner;

public class Exam4_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int inputNum = s.nextInt();
		int cnt = 0;
		int inputNumMinus = 0;
		int iMinus = 0;

		System.out.print(inputNum + "의 약수 : ");

		if(inputNum < 0) {
			inputNumMinus = inputNum;
			inputNum *= -1;
		}

		for(int i=1; i<=inputNum; i++) {
			if(inputNum % i == 0) {
				if(inputNumMinus<0) {
					iMinus = i * -1;
					System.out.print(iMinus);
				}
				else {
					System.out.print(i);
				}
				cnt++;
				if(i<inputNum) {
					System.out.print(", ");
				}
			}
		}
		System.out.println("\n약수 개수 : " + cnt);
		s.close();
	}

}
