package java_question;

import java.util.Scanner;

public class Exam4_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("������: ");
		int inputNum = s.nextInt();
		int cnt=0;
		for(int i=1; i<=inputNum;i++) {
			if(inputNum % i == 0) {
				cnt++;
			}
		}
		if(cnt==2) {
			System.out.println("�Ҽ��Դϴ�.");
		}
		else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		}
		s.close();
	}

}
