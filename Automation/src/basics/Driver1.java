package basics;

public class Driver1 {

	public static void main(String[] args) {
		Laptop l1=new Laptop(101,"HP",50000);
		System.out.println(l1);
		
		Laptop l2=new Laptop(101,"HP",50000);
		System.out.println(l2);
		
		System.out.println(l1==l2);
		System.out.println(l1.equals(l2));
		
		System.out.println(l1.hashCode());
		System.out.println(l2.hashCode());
		
		
		
		

	}

}
