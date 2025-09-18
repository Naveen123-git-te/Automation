package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClick {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
//	driver.findElement(By.linkText("Forgotten password?")).click();
	//click() is used to click on link, button, radio button, checkbox etc.
	//In static webpages it will scroll until the element and click on the element
	driver.findElement(By.linkText("Sign Up")).click();
}
}
