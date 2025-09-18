package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnIsDisplayed {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
//	driver.get("https://www.makemytrip.com");
	driver.get("https://www.flipkart.com/");
//isDisplayed() is used to check whether element is displayed or not
//It will return true if element is displayed, it will return false if element is
//present in html but not visible in the UI
//boolean res = driver.findElement(By.xpath("//img[@alt='Make My Trip']")).isDisplayed();
boolean res = driver.findElement(By.xpath("//span[text()='New customer?']")).isDisplayed();
	if(res) {
		System.out.println("Element is displayed");
	}else {
		System.out.println("Element is not displayed");
	}
	driver.quit();
}
}
