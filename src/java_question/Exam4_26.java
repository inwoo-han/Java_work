package java_question;

import java.util.Scanner;

public class Exam4_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		boolean retryChk = true;
		while(retryChk) {
		System.out.print("몇 개의 정수를 더할까요? : ");
		int inputNum=s.nextInt();
		int[] inputNumArray = new int[inputNum];
		int sum=0;
		int	avg=0;
		
		for(int i=0; i<inputNumArray.length; i++) {
			System.out.print("정수 입력(종료:0) : ");
			inputNumArray[i] = s.nextInt();
			if(inputNumArray[i] == 0) {
				retryChk = false;
				break;
			}
			sum+=inputNumArray[i];
		}
		avg = sum/inputNum;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		}
	}

}
