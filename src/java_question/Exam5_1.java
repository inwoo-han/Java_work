package java_question;

public class Exam5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eight = 12;
		int ten = 12;
		int sixteen = 12;
		
		System.out.println("8���� 12 -> 10���� " + ((eight/10)*8 + (eight%10)));
		System.out.println("10���� 12 -> 10���� " + ((ten/10)*10 + (ten%10)));
		System.out.println("16���� 12 -> 10���� " + ((sixteen/10)*16 + (sixteen%10)));
		
		System.out.println(0x12+"  16���� 12");
		System.out.println(012+ "  8���� 12");
		System.out.println(12 +"  10���� 12");
	}

}
