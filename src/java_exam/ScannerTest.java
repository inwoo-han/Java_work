package java_exam;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int i = s.nextInt();
		System.out.printf("입력한 정수 : %d \n", i);
		System.out.printf("10을 더한 값 : %d \n", i + 10);
		System.out.printf("10을 뺀 값 : %d \n", i - 10);
		System.out.printf("마지막 자리수를 제외한 값 : %d \n", i / 10);
		System.out.printf("마지막 자리수 값 : %d \n", i % 10);
		
		s.close();
		
	}

}
