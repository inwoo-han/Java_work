package java_question;

import java.util.Scanner;

public class Exam4_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int inputNum;
		int retryNum = 1;
		do {
			System.out.print("달(월) 입력 : ");
			inputNum = s.nextInt();
			
			if(inputNum >= 13 || inputNum <= 0){
				System.out.println("1~12사이의 값을 입력해주세요.");
				continue;
			}
			else if(3 <= inputNum && inputNum <= 5) {
				System.out.println("봄");
			}
			else if(6 <= inputNum && inputNum <= 8) {
				System.out.println("여름");
			}
			else if(9 <= inputNum && inputNum <= 11) {
				System.out.println("가을");
			}
			else {
				System.out.println("겨울");
			}
			
			System.out.print("다시 하시겠습니까? (yes:1, no:0) ");
			retryNum = s.nextInt();
			
		}while(retryNum==1);
		s.close();
	}

}
