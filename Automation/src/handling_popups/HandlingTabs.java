package handling_popups;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	driver.findElement(By.xpath("//section[text()='Popups']")).click();
	driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
	driver.findElement(By.linkText("New Tab")).click();
	driver.findElement(By.xpath
	("//h2[text()='Watches']/following-sibling::button[text()='view more']")).click();
	Set<String> allWid = driver.getWindowHandles();
	Iterator<String> itr = allWid.iterator();
	String pwid = itr.next();
	String cwid = itr.next();
	driver.switchTo().window(cwid);
	System.out.println(driver.getTitle());
	driver.switchTo().window(pwid);
	driver.close();
	driver.switchTo().window(cwid).close();
}
}
