package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSERE {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/qspid/Desktop/Demo.html");
	//@01 will be stored in the reference variable
	WebElement ele = driver.findElement(By.tagName("a"));
	//It will navigate to another page and the address of element will become @02 in the html
	ele.click();
	driver.navigate().back();
	//It will try to click on element using old address @01 but the current address is @02 due to which we get SERE
	ele.click();
}
}
