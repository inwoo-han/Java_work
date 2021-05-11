package exception;

class Calculator{
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
		
	}
	
	public void divide() {
		try {
			System.out.println("계산결과는 ");
			System.out.println(this.left / this.right);
			System.out.println(" 입니다.");
		}
		catch(Exception e) {
			System.out.println("\n\n e.getMessage()\n" + e.getMessage());
			System.out.println("\n\n e.toString()\n" + e.toString());
			System.out.println("\n\n e.printStackTrace()");
			e.printStackTrace();
		}
	}
}

public class CalculatorDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		c1.setOperands(10, 0);
		c1.divide();
	}

}
