package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClear {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.opensourcebilling.org/en/portal/clients/sign_in");
	driver.findElement(By.xpath("//label[text()='Keep me signed in']")).click();
//clear() is used to clear the text present in a textbox
	driver.findElement(By.id("email")).clear();
	WebElement password = driver.findElement(By.id("password"));
	password.clear();
}
}
