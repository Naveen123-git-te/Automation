package basics;

public class Laptop {
int id;
String brand;
double price;

public Laptop(int id, String brand, double price) {
	super();
	this.id = id;
	this.brand = brand;
	this.price = price;
}


public boolean equals(Object o)
{
	Laptop l=(Laptop) o;
	return this.id==l.id && this.brand==l.brand && this.price==l.price;
	}
public int hashCode()
{
	return  id+(int)price+brand.hashCode();
	}
}
