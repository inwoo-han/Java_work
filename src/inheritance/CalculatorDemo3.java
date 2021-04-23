package inheritance;

class DivisionableCalculator extends MultiplicationableCalculator {
	public void division() {
		System.out.println(this.left / this.right);
	}
}

public class CalculatorDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisionableCalculator c1 = new DivisionableCalculator();
		c1.setOperands(10, 20);
		c1.division();
	}

}
