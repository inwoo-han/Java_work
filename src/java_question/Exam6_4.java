package java_question;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exam6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.print("¿ä¼Ò¼ö : ");
		int inputNum = s.nextInt();
		System.out.println();
		int[] arrays = new int[inputNum];
		for(int i=0; i<arrays.length; i++) {
			arrays[i] = r.nextInt(10) + 1;
		}
		
		for(int i=Arrays.stream(arrays).max().getAsInt(); i>0; i--) {
			for(int j=0; j<arrays.length; j++) {
				if (i <= arrays[j]) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=0; i<arrays.length; i++) {
			
			System.out.print("--");
		}
		System.out.println();
		for(int i=0; i<arrays.length; i++) {
			if(i>=10) {
			System.out.print(i);
			}
			else {
			System.out.print(i + " ");
			}
		}
		s.close();
	}

}
