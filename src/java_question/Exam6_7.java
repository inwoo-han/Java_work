package java_question;

import java.util.Scanner;

public class Exam6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int inputCount = s.nextInt();
		int arrayScore[] = new int[inputCount];
		int sum = 0;
		double avg = 0;
		int max=0, min=0;
		for(int i=0; i<arrayScore.length; i++) {
			System.out.print((i+1) + "�� ���� : ");
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
		System.out.println("�հ� : " + sum + "��");
		System.out.println("��� : " + avg + "��");
		System.out.println("�ְ��� : " + max + "��");
		System.out.println("������ : " + min + "��");
		s.close();
	}

}
