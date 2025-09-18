package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class UsageOfGetLocAndSize {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.navigate().refresh();
	WebElement email = driver.findElement(By.id("email"));
	WebElement password = driver.findElement(By.id("passContainer"));
//getSize() is used to get the size of an element
	Dimension d1 = email.getSize();
	int h1 = d1.getHeight();
	int w1 = d1.getWidth();
//getRect() is a combination of getSize and getLocation
	int h2 =  password.getRect().getHeight();
	int w2 =  password.getSize().getWidth();
	if(h1==h2&&w1==w2) {
		System.out.println("Pass: Both email and pwd tbx are same size");
	}else {
		System.out.println("Fail: Both email and pwd tbx are different size");
	}
//getLocation() is used to get the location of an element
	Point p1 = email.getLocation();
	int xAxis1 = p1.getX();
	int yAxis1 = p1.getY();
	int xAxis2 = password.getRect().getX();
	int yAxis2 = password.getLocation().getY();
	if(xAxis1==xAxis2) {
		System.out.println("Pass: both are aligned properly");
	}else {
		System.out.println("Fail: both are not aligned properly");
	}
	driver.quit();
}
}
