package java_question;

import java.util.Scanner;

public class Exam4_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int inputNum = s.nextInt();
		
		for (int i=1; i<=inputNum; i++) {
			System.out.println(i + "�� ������ " + i*i + "�Դϴ�.");
		}
		
		s.close();
	}
	

}
