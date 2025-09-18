package assignment_Archana;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnManage {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	Options opt = driver.manage();
	Window win=opt.window();
	win.maximize();
	driver.get("https://wwww.facebook.com");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	Thread.sleep(2000);
	driver.manage().window().fullscreen();
	driver.manage().window().setSize(new Dimension(200,100));
	driver.manage().window().setPosition(new Point(100,100));
	driver.manage().window().minimize();
	driver.quit();
	

	}

}
