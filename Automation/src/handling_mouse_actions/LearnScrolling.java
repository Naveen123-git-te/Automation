package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrolling {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.fb.com");
	WebElement target = driver.findElement(By.xpath("//span[text()]"));
	Actions a=new Actions(driver);Thread.sleep(2000);
//It will scroll down for the mentioned pixel values
	a.scrollByAmount(0, 200).perform();Thread.sleep(2000);
//It will scroll back for the mentioned pixel values
	a.scrollByAmount(0, -100).perform();Thread.sleep(2000);
//It will scroll until the element is visible
	a.scrollToElement(target).perform();
}
}
