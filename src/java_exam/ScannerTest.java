package java_exam;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int i = s.nextInt();
		System.out.printf("�Է��� ���� : %d \n", i);
		System.out.printf("10�� ���� �� : %d \n", i + 10);
		System.out.printf("10�� �� �� : %d \n", i - 10);
		System.out.printf("������ �ڸ����� ������ �� : %d \n", i / 10);
		System.out.printf("������ �ڸ��� �� : %d \n", i % 10);
		
		s.close();
		
	}

}
