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
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("0부터 99사이의 숫자를 맞추세요.");
		while(true) {
			
			if(chance<=0) {
				System.out.println("남은 횟수를 모두 소진했습니다.");
				System.out.println("정답 : " + randNum);
				break;
			}
			
			System.out.print("남은 횟수 " + chance + "회, 어떤 숫자일까요? : ");
			int inputNum = s.nextInt();
			
			if(inputNum > randNum) {
				System.out.println("더 작은 숫자입니다.");
				chance--;
				continue;
			}
			else if(inputNum < randNum) {
				System.out.println("더 큰 숫자입니다.");
				chance--;
				continue;
			}
			else if(inputNum == randNum) {
				System.out.println(7-chance + "회만에 맞추었습니다.");
				break;
			}
			
		}
	}

}
