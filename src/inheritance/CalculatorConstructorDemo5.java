package inheritance;

class SubstractionableCalculator extends Calculator{
	public SubstractionableCalculator(int left, int right) {
		super(left, right);
	}
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorConstructorDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
