package polymorphism;

class A{
	public String x() {
		return "A.x";
	}
}

class B extends A{
	public String x() {
		return "B.x";
	}
	
	public String y() {
		return "B.y";
	}
}

public class PolymorphismDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B();
		System.out.println(obj.x());
		//obj.y();
	}

}
