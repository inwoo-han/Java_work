package java_question;

import java.util.Scanner;

public class Exam4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("신장별 표준 체중 대응표(최소/최대/증가값) : ");
		int inputMin = s.nextInt();
		int inputMax = s.nextInt();
		double inputInDecrease = s.nextDouble();
		
		System.out.println(" 신장  |  표준체중");
		System.out.println("----------------");
		for(double i=inputMin; i<=inputMax; i=i+inputInDecrease) {
			System.out.printf("%4.1f |  %.1f\n" ,i, (i-100)*0.9);
		}
	}
	

}
