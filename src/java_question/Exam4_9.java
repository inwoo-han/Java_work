package java_question;

import java.util.*;

public class Exam4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, cnt=0;
		boolean re_chk = true;
		Scanner s = new Scanner(System.in);
		while(re_chk) {
			System.out.print("���� ���� �Է� (����:-1) : ");
			int input_Num = s.nextInt();
			num = input_Num;
			if (input_Num < 0) {
				if(input_Num == -1) {
					re_chk = false;
					System.out.println("�ݺ� ����");
				}
				else {
					System.out.println("���� ������ �Է����ּ���.");
				}
			}
			else if(input_Num >= 0) {
				do {
					num = num / 10;
					cnt++;
				}while(num!=0);
				System.out.println("�ڸ��� : " + cnt);
			}
			cnt = 0;
		}
	}

}
