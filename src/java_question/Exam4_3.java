package java_question;

import java.util.Scanner;
import java.util.Random;

public class Exam4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int inputNum, randNum;
		randNum = r.nextInt(90) + 10;
		System.out.println("���ڸ��߱� (10 ~ 99)");
		do {
			System.out.print("�Է� : ");
			inputNum = s.nextInt();
		if(inputNum >= 10 && inputNum <= 99) {
			if (inputNum > randNum) {
				System.out.println("down");
			}
			else if (inputNum < randNum) {
				System.out.println("up");
			}
		}
		else {
			System.out.println("10 ~ 99 ������ ���ڸ� �Է����ּ���.");
		}
		} while (inputNum != randNum);
		
		System.out.println("�����Դϴ�.");
	}

}
