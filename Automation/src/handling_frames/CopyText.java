package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CopyText {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	driver.findElement(By.xpath("//section[text()='Frames']")).click();
	driver.findElement(By.xpath("//section[text()='iframes']")).click();
	driver.findElement(By.linkText("Nested iframe")).click();Thread.sleep(2000);
	driver.switchTo().frame(0);
String email = driver.findElement(By.xpath("//p[text()='Default Email']/following-sibling::p[1]")).getText();
String pwd = driver.findElement(By.xpath("//p[text()='Default Password']/following-sibling::p[1]")).getText();
String conPwd = driver.findElement(By.xpath("//p[contains(text(),'Confirm')]/following-sibling::p[1]")).getText();
	driver.switchTo().frame(0);
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id("password")).sendKeys(pwd);
	driver.findElement(By.id("confirm-password")).sendKeys(conPwd);
	driver.findElement(By.id("submitButton")).click();
}
}
