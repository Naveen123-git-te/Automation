package handling_disabled_elements;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleScrollBar {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.redbus.in/");Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
//scrollTo(x,y) will scroll to 500 pixels from 0 pixels
	js.executeScript("window.scrollTo(0,500)");Thread.sleep(2000);
//scrollBy(x,y) will scroll by 200 pixels from 500 pixels i.e., 700 pixels
	js.executeScript("window.scrollBy(0,200)");
	}
}
