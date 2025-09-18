package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnManage {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.fb.com");
	driver.manage().deleteAllCookies();Thread.sleep(2000);
	driver.manage().window().fullscreen();Thread.sleep(2000);
	driver.manage().window().setSize(new Dimension(200, 100));Thread.sleep(2000);
	driver.manage().window().setPosition(new Point(100, 100));Thread.sleep(2000);
	driver.manage().window().minimize();Thread.sleep(2000);
	driver.quit();
}
}
