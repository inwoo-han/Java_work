package java_question;

import java.util.Scanner;

public class Exam4_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int inputNum;
		int retryNum = 1;
		do {
			System.out.print("��(��) �Է� : ");
			inputNum = s.nextInt();
			
			if(inputNum >= 13 || inputNum <= 0){
				System.out.println("1~12������ ���� �Է����ּ���.");
				continue;
			}
			else if(3 <= inputNum && inputNum <= 5) {
				System.out.println("��");
			}
			else if(6 <= inputNum && inputNum <= 8) {
				System.out.println("����");
			}
			else if(9 <= inputNum && inputNum <= 11) {
				System.out.println("����");
			}
			else {
				System.out.println("�ܿ�");
			}
			
			System.out.print("�ٽ� �Ͻðڽ��ϱ�? (yes:1, no:0) ");
			retryNum = s.nextInt();
			
		}while(retryNum==1);
		s.close();
	}

}
