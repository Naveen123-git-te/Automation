package handling_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class HiddenDivPopup {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	driver.findElement(By.xpath("//section[text()='Popups']")).click();
	driver.findElement(By.xpath("//section[text()='Hidden division']")).click();
	driver.findElement(By.xpath("//button[text()='Add Customer']")).click();
	driver.findElement(By.id("customerName")).sendKeys("Blake");
	driver.findElement(By.id("customerEmail")).sendKeys("Blake@MANAGER");
	WebElement prod = driver.findElement(By.id("prod"));
	Select s=new Select(prod);
	s.selectByIndex(1);
	driver.findElement(By.id("message")).sendKeys("Blake wants a mobile");
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}
}
