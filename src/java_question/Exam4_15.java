package java_question;

import java.util.Scanner;

public class Exam4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("���庰 ǥ�� ü�� ����ǥ(�ּ�/�ִ�/������) : ");
		int inputMin = s.nextInt();
		int inputMax = s.nextInt();
		double inputInDecrease = s.nextDouble();
		
		System.out.println(" ����  |  ǥ��ü��");
		System.out.println("----------------");
		for(double i=inputMin; i<=inputMax; i=i+inputInDecrease) {
			System.out.printf("%4.1f |  %.1f\n" ,i, (i-100)*0.9);
		}
	}
	

}
