package java_question;

import java.util.Random;
import java.util.Scanner;

public class Exam6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.print("��� �� �Է� : ");
		int input_Num = s.nextInt();
		int[] a = new int[input_Num];
		
		for(int i=0; i<a.length; i++) {
			a[i] = r.nextInt(10)+1;
		}
		
		for(int i=1; i<a.length-1; i++) {
			for(int j=0; j<=i+1; j++) {
				if(i==j) {
					continue;
				}
				if(a[i]==a[j])
				{
					System.out.println("a[" + j + "] = " + "��" + a[j]);
					a[i] = r.nextInt(10)+1;
					System.out.println("a[" + j + "] = " + "��" + a[j]);
					j--;
				}
		}
		}
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
	}

}
