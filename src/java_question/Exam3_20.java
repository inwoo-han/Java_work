package java_question;

import java.util.Random;

public class Exam3_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int rand_Num = r.nextInt(3);
		
		switch(rand_Num) {
		case 0:
			System.out.println("����");
			break;
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("��");
			break;
		default:
			break;
		}
	}

}
