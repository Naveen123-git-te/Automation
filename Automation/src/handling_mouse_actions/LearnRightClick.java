package handling_mouse_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnRightClick {
public static void main(String[] args) throws AWTException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.fb.com");
	WebElement link = driver.findElement(By.linkText("Create a Page"));
	Actions a=new Actions(driver);
//	a.contextClick();//contextClick() will right click on the starting pixel of the webpage
	a.contextClick(link).perform();//contextClick(WebEle ele) will right click on particular ele
	Robot r=new Robot();
	//r.keyPress(KeyEvent.VK_T);//It will open the link in new tab
	r.keyPress(KeyEvent.VK_W);//It will open the link in new window
}
}
