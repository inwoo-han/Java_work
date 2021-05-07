package java_question;

import java.util.*;

public class Exam4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, cnt=0;
		boolean re_chk = true;
		Scanner s = new Scanner(System.in);
		while(re_chk) {
			System.out.print("양의 정수 입력 (종료:-1) : ");
			int input_Num = s.nextInt();
			num = input_Num;
			if (input_Num < 0) {
				if(input_Num == -1) {
					re_chk = false;
					System.out.println("반복 종료");
				}
				else {
					System.out.println("양의 정수를 입력해주세요.");
				}
			}
			else if(input_Num >= 0) {
				do {
					num = num / 10;
					cnt++;
				}while(num!=0);
				System.out.println("자리수 : " + cnt);
			}
			cnt = 0;
		}
	}

}
