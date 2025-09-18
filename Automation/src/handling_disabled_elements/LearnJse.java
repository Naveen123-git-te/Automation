package handling_disabled_elements;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnJse {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	System.out.println(js.executeScript("return document.title"));
	String url = (String) js.executeScript("return document.URL");
	System.out.println(url);
	driver.switchTo().activeElement().sendKeys("Qspiders BTM");
	String text = driver.switchTo().activeElement().getAttribute("value");
	System.out.println(text);
	driver.quit();
}
}
