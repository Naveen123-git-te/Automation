package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnIsEnabled {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
//	driver.get("https://www.facebook.com/");
	driver.get("https://www.instagram.com/");
	driver.navigate().refresh();
	Thread.sleep(2000);
//isEnabled() is used to check whether element is enabled or disabled,
//We need to check them since we will not be able to perform action on disabled element
//	boolean res = driver.findElement(By.linkText("Log in")).isEnabled();
	boolean res = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
	if(res==true) {
		System.out.println("Login button is enabled");
	}else {
		System.out.println("Login button is disabled");
	}
	driver.quit();
}
}
