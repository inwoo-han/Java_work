package java_question;

import java.util.Scanner;

public class Exam4_28{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		boolean retryChk = true;
		while(retryChk) {
		System.out.print("�� ���� ������ ���ұ��? : ");
		int inputNum=s.nextInt();
		int[] inputNumArray = new int[inputNum];
		int sum=0;
		int	avg=0;
		
		for(int i=0; i<inputNumArray.length; i++) {
			System.out.print("���� �Է�(����:0) : ");
			inputNumArray[i] = s.nextInt();
			if(inputNumArray[i] == 0) {
				retryChk = false;
				break;
			}
			else if(inputNumArray[i]<0) {
				System.out.println("������ ������ �ʽ��ϴ�.");
				i--;
				continue;
			}
			sum+=inputNumArray[i];
		}
		avg = sum/inputNum;
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		}
	}

}
