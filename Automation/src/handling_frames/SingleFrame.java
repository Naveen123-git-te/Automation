package handling_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleFrame {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/qspid/Desktop/F1.html");
	WebElement un = driver.findElement(By.id("un"));Thread.sleep(1000);
	un.sendKeys("admin");
//frame(String id/name) will transfer the control to the iframe which is having the mentioned id/name
	driver.switchTo().frame("single_frame");
	WebElement pwd = driver.findElement(By.id("pwd"));Thread.sleep(1000);
	pwd.sendKeys("manager");
//frame(int index) will transfer the control to the frame by the mentioned index, Indexing starts from 0
//The indexing will start from 0 for the frames present in current html
	driver.switchTo().frame(0);
	WebElement email = driver.findElement(By.id("email"));Thread.sleep(1000);
	email.sendKeys("admin");
//parentFrame() will transfer the control to the previous frame
	driver.switchTo().parentFrame();Thread.sleep(1000);
	pwd.sendKeys("@456");
//frame(WebEle ele) will transfer the control to the frame using the webEle address, 
//We should pass the ele address of <iframe> tag 
	WebElement nested_frame = driver.findElement(By.name("nested_frame"));
	driver.switchTo().frame(nested_frame);Thread.sleep(1000);
	email.sendKeys("@gmail.com");
//defaultContent() will transfer the control to the main webPage
	driver.switchTo().defaultContent();Thread.sleep(1000);
	un.sendKeys("123");
}}
