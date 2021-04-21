package scope;

class Calculator2 {
	static double PI = 3.14;
	static int base = 0;
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + base);
	}
	
	public void avg() {
		System.out.println((this.left + this.right + base)/2);
	}
}

public class ScopeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calculator c1 = new Calculator();
//		c1.setOperands(10, 20);
//		c1.sum();
//		c1.avg();
//		System.out.println(c1.PI);
//		
//		Calculator c2 = new Calculator();
//		c2.setOperands(20, 40);
//		c2.sum();
//		c2.avg();
//		System.out.println(c2.PI);
//		
//		System.out.println(Calculator.PI);
		Calculator2 c1 = new Calculator2();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator2.base = 10;
		c1.sum();
		c1.avg();
		
		
	}

}
