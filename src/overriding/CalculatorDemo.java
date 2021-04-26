package overriding;

class Calculator {
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public int avg() {
		return (this.left + this.right)/2;
	}
}

class SubstractionableCalculator extends Calculator{
	public void sum() {
		System.out.println("���� ����� " + (this.left + this.right)+ "�Դϴ�.");
	}
	public int avg() {
		return super.avg();
	}
	
	public void subtract() {
		System.out.println(this.left - this.right);
	}
}
public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		c1.setOperands(10, 20);
		System.out.println("���� ����� " + c1.avg());
		c1.sum();
	}

}
