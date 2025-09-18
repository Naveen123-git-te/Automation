package com.assignments.vasant;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertPopups {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		
		 List<WebElement> click = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for (WebElement webElement : click) {
			webElement.click();
		}
		
		driver.findElement(By.id("deleteButton")).click();
		 Alert a=driver.switchTo().alert();
		 String text=a.getText();
		 a.accept();
		 System.out.println(text);
		
		driver.quit();
		
	}
}
