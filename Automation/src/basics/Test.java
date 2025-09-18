package basics;

public class Test {

	public static void main(String[] args) {
	String s=new String("Hi");
	String s1=new String("Hello");
	System.out.println(s);
	System.out.println(s1);
	System.out.println(s==s1);
	System.out.println(s.equals(s1));
	System.out.println(s.hashCode());
	System.out.println(s1.hashCode());
	}
}
