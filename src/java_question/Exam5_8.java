package java_question;

public class Exam5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=0; 
		System.out.println("float                    int");
		System.out.println("----------------------------");
		for(float i=0; i<=1; i+=0.001) {
			System.out.printf("%.7f           ",i);
			System.out.printf("%.7f \n",(float)j/1000);
			j++;
		}
	}

}
