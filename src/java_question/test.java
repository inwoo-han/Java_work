package java_question;
import java.util.Scanner;
import java.util.Random;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int in_put ;
		Random re = new Random();
		int a;
		int ra= re.nextInt(100);
		System.out.println(ra);
		do {
			//Random re = new Random();
			System.out.println("���ڸ� �Է����ּ���");
			in_put = sc.nextInt();
			//int ra= re.nextInt(100);
			if(in_put > ra)
				System.out.println("�۾ƿ�");
			else if (in_put<ra)
				System.out.println("Ŀ��");
			else
				System.out.println("�����Դϴ�");
			System.out.println("�絵���� 1");
			a = sc.nextInt();
			}while(a==1);
		{
			if (in_put== ra)
				System.out.println("�����Դϴ�.");
		}
	}

}
