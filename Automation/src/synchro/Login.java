package synchro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://online.actitime.com/ssandeep/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
for(int i=0;i<1000;i++) {//2. In order to perform the action until the line will not throw exception
	try {//1. In order to handle the exception and continue the execution
		driver.findElement(By.id("logoutLink")).click();
		break;//3. To stop the execution after the action has been performed
	}catch (NoSuchElementException e) {
		System.out.println(i);
	}
	}
}
}
