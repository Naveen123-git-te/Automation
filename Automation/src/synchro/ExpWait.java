package synchro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExpWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//		  Wait<WebDriver> wait=new FluentWait(driver)
//				  .withTimeout(Duration.ofSeconds(30)) 
//				  .pollingEvery(Duration.ofSeconds(2))
//				  .ignoring(NoSuchElementException.class);
		driver.get("https://online.actitime.com/ssandeep/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		wait.until(ExpectedConditions.titleIs("actiTIME -  Licenses"));//for getTitle
wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logoutLink")));//For findEle
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));//For findEle
		driver.findElement(By.id("logoutLink")).click();
		System.out.println(driver.getTitle());
		driver.quit();	
	}
}






 
 