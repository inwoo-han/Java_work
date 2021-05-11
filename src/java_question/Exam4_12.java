package java_question;

import java.util.*;

public class Exam4_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("카운트할 양수를 입력해주세요 : ");
		int input = s.nextInt();


		if(input>=0) {
			for (int i=input; i>=0; i--) {
				System.out.println(i);
			}
		}
		else {
			System.out.println("양수를 입력해주세요.");
		}
	}

}
