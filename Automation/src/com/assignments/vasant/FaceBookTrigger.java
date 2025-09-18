package com.assignments.vasant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTrigger {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https:/www.facebook.com");
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
		
		WebElement inline=driver.findElement(By.cssSelector("div._9ay7"));
		
		String color=inline.getCssValue("color");
		String text=inline.getText();
		System.out.println(color);
		System.out.println(text);
		
	
		WebElement signup=driver.findElement(By.xpath("//a[contains(text(), \"Sign Up\")]"));
		String textsignup=signup.getText();
		System.out.println(textsignup);
	
		driver.quit();
	}

}
