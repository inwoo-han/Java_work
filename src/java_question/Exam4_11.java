package java_question;

import java.util.*;

public class Exam4_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("몇 개의 *을 표시할까요? : ");
		int input = s.nextInt();


		if(input>=0) {
			for (int i=0; i<input; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
