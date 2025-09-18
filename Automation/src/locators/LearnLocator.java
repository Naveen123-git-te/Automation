package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocator {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/qspid/Desktop/Demo.html");
	WebElement ele = driver.findElement(By.tagName("a"));
	ele.click();
	driver.navigate().back();
	WebElement ele1 = driver.findElement(By.id("d2"));
	ele1.click();
	driver.navigate().back();
	WebElement ele2 = driver.findElement(By.name("n1"));
	ele2.click();
	driver.navigate().back();
	driver.findElement(By.className("c2")).click();
	driver.navigate().back();	
	driver.findElement(By.linkText("Qspiders")).click();
	driver.navigate().back();
	driver.findElement(By.partialLinkText("Jsp")).click();
	driver.navigate().back();
	WebElement Google = driver.findElement(By.linkText("Google"));
	driver.quit();
	}
}
