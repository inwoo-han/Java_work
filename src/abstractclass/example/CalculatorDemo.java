package abstractclass.example;

abstract class Calculator {
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	int _sum() {
		return this.left + this.right;
	}
	
	int _avg() {
		return _sum()/2;
	}
	
	public abstract void sum();
	
	public abstract void avg();
	
	public void run() {
		sum();
		avg();
	}
}

class CalculatorDecoPlus extends Calculator{
	public void sum() {
		System.out.println("+ sum :" + _sum());
	}
	
	public void avg() {
		System.out.println("+ avg :" + _avg());
	}
}

class CalculatorDecoMinus extends Calculator{
	public void sum() {
		System.out.println("- sum :" + _sum());
	}
	
	public void avg() {
		System.out.println("- avg :" + _avg());
	}
}

class CalculatorDecoAst extends Calculator{
	public void sum() {
		System.out.println("* sum :" + _sum());
	}
	
	public void avg() {
		System.out.println("* avg :" + _avg());
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorDecoPlus c1 = new CalculatorDecoPlus();
		c1.setOperands(10, 20);
		c1.run();
		
		CalculatorDecoMinus c2 = new CalculatorDecoMinus();
		c2.setOperands(10, 20);
		c2.run();
		
		CalculatorDecoAst c3 = new CalculatorDecoAst();
		c3.setOperands(10, 20);
		c3.run();
	}

}
