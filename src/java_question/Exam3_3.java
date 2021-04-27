package java_question;
import java.util.Scanner;
public class Exam3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input_num = sc.nextInt();
		int input_num2 = sc.nextInt();
		
		if (input_num % input_num2 == 0) {
			System.out.println(input_num2 + "는 "+ input_num + "의 약수 입니다.");
		}
		else {
			System.out.println(input_num2 + "는 "+ input_num + "의 약수가 아닙니다.");
		}
		
		sc.close();
	}

}
