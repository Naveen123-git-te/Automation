package data_driven_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParameters {
//	@Parameters({"url","un","pwd"})
	@Test(dataProvider = "getData",dataProviderClass = LearnDataProvider.class)
public void login(String un, String pwd) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	driver.findElement(By.partialLinkText("Login")).click();
	Thread.sleep(2000);
	driver.quit();
}
}
