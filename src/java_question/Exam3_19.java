package java_question;

import java.util.Scanner;

public class Exam3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] num_Array = new int[4];
		int num;
		
		for(int i = 0; i < num_Array.length; i++) {
			num_Array[i] = s.nextInt();
		}
		
		
		for(int i = 0; i < num_Array.length; i++) {
			
			for(int j = 0; j< num_Array.length -1 ; j++) {
				if(num_Array[j] > num_Array[j + 1]) {
					num = num_Array[j];
					num_Array[j] = num_Array[j + 1];
					num_Array[j + 1] = num;
				}
				
			}
		}
		
		for(int i = 0; i < num_Array.length; i++) {
			System.out.println(num_Array[i]);
		}
	}
}
