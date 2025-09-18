package handling_popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrintAllHeadings {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://online.actitime.com/tyss/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager"+Keys.ENTER);
	driver.findElement(By.className("popup_menu_button_support")).click();
	driver.findElement(By.linkText("About your actiTIME")).click();
wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Read Service Agreement"))).click();
String pwid = driver.getWindowHandle();
Set<String> allWid = driver.getWindowHandles();
for (String wid : allWid) {
	if(!pwid.equals(wid)) {
		driver.switchTo().window(wid);
		break;
	}
//	driver.switchTo().window(wid);
}
}
}
