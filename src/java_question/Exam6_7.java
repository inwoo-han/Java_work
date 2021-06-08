package java_question;

import java.util.Scanner;

public class Exam6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("사람 수 : ");
		int inputCount = s.nextInt();
		int arrayScore[] = new int[inputCount];
		int sum = 0;
		double avg = 0;
		int max=0, min=0;
		for(int i=0; i<arrayScore.length; i++) {
			System.out.print((i+1) + "번 점수 : ");
			arrayScore[i] = s.nextInt();
			sum += arrayScore[i];

			if(i==0 || max < arrayScore[i]) {
				max = arrayScore[i];
			}
			if(i==0 || min > arrayScore[i]) {
				min = arrayScore[i];
			}
		}
		avg = (double)sum / arrayScore.length;
		System.out.println("합계 : " + sum + "점");
		System.out.println("평균 : " + avg + "점");
		System.out.println("최고점 : " + max + "점");
		System.out.println("최저점 : " + min + "점");
		s.close();
	}

}
