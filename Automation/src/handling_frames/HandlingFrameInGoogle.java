package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrameInGoogle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		driver.switchTo().frame("app");
		Actions a=new Actions(driver);
		WebElement youtube = driver.findElement(By.xpath("//span[text()='YouTube']"));
		WebElement music = driver.findElement(By.xpath("//span[text()='YouTube Music']"));
	a.moveToElement(youtube).pause(2000).scrollToElement(music).pause(2000).click(music).build().perform();
	}
}