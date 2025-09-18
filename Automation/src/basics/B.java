package basics;

public class B {
	public static void main(String[] args) {
		A a1=new A(10);
		System.out.println(a1.getI());//10
		A a2=new A(20);
		a1.setI(30);
		System.out.println(a2.getI());
	}
}