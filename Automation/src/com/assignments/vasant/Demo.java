package com.assignments.vasant;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	String getCurrentUrl=driver.getCurrentUrl();
	String getTitle=driver.getTitle();
	driver.findElement(By.name("q")).sendKeys("Mac");
	driver.findElement(By.cssSelector("button[type='submit']")).click(); 
	
	
	/*
	 * calling navigation without get
	 * 
	driver.navigate().to("https://www.Amazon.com");
	driver.navigate().back();
	driver.navigate().forward();
*/	
	
	System.out.println(getCurrentUrl);
	System.out.println(getTitle);
	
	
	//driver.quit();
	
	
	}

}
