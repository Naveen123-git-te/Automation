package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnQuit {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://secure.indeed.com/");
	driver.findElement(By.id("login-google-button")).click();
	driver.findElement(By.id("apple-signin-button")).click();
//	driver.close();
	driver.quit();
}
}
