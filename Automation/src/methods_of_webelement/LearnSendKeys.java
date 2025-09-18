package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSendKeys {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.navigate().refresh();
	driver.findElement(By.id("email")).sendKeys("Virat@18"+Keys.CONTROL+"AC");
	driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"V");
}
}
