package java_question;

import java.util.Random;
import java.util.Scanner;

public class Exam4_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int randNum = r.nextInt(100);
		int chance = 6;
		System.out.println("���� ���߱� ���� ����!");
		System.out.println("0���� 99������ ���ڸ� ���߼���.");
		while(true) {
			
			if(chance<=0) {
				System.out.println("���� Ƚ���� ��� �����߽��ϴ�.");
				System.out.println("���� : " + randNum);
				break;
			}
			
			System.out.print("���� Ƚ�� " + chance + "ȸ, � �����ϱ��? : ");
			int inputNum = s.nextInt();
			
			if(inputNum > randNum) {
				System.out.println("�� ���� �����Դϴ�.");
				chance--;
				continue;
			}
			else if(inputNum < randNum) {
				System.out.println("�� ū �����Դϴ�.");
				chance--;
				continue;
			}
			else if(inputNum == randNum) {
				System.out.println(7-chance + "ȸ���� ���߾����ϴ�.");
				break;
			}
			
		}
	}

}
