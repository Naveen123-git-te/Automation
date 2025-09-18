package com.assignments.vasant;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareHealthTesting {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		
		WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		
		Select s1=new Select(month);
		s1.selectByVisibleText("Sep");
		
		WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		
		Select s2=new Select(year);
		s2.selectByVisibleText("1999");
		
		driver.findElement(By.xpath("//a[@data-date='15']")).click();
		
		driver.findElement(By.xpath("//input[@id='alternative_number']")).sendKeys("123456789");
		
		driver.findElement(By.xpath("//button[@id='renew_policy_submit']")).click();
		
		
		
		Thread.sleep(2000);
		
		
		driver.quit();
	}

}
