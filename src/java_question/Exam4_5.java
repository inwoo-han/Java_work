package java_question;

import java.util.Scanner;

public class Exam4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num1;
		int i;
		System.out.println("카운트 다운 시작");
		System.out.print("양수값 입력 : ");
		try {
		num1 = s.nextInt();
		if(num1 > 0) {
			for (i = num1; i>=0; i--) {
				System.out.println(i);
				Thread.sleep(1000);
			}
			System.out.println("종료 후 변수값 : " + i);
		}
		else {
				System.out.println("양수를 입력해주세요.");
		}
		}
		
		catch(Exception e){System.out.println("오류발생 : " + e);}
	}

}
