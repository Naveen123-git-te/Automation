package com.assignments.vasant;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Thread.sleep(2000);
		//driver.navigate().refresh();
		
		driver.findElement(By.xpath("//a[@href='/ui/dropdown']")).click();
		
		Thread.sleep(2000);
		
		WebElement countrycode=driver.findElement(By.id("country_code"));
		Select s1=new Select(countrycode);
		s1.selectByVisibleText("+91");
		
		WebElement male=driver.findElement(By.id("male"));
		male.click();
		
		if(male.isSelected()) {
			System.out.println("Male Radio Button is Selected ");
		}else {
			System.out.println("Male Radio Button is not selected..!!");
		}
		
		
		WebElement female=driver.findElement(By.id("female"));
		//female.click();
		
		if(female.isSelected()) {
			System.out.println("female Radio Button is Selected ");
		}else {
			System.out.println("female Radio Button is not selected..!!");
		}
		
		WebElement other=driver.findElement(By.id("other"));
		//other.click();
		
		if(other.isSelected()) {
			System.out.println("other Radio Button is Selected ");
		}else {
			System.out.println("other Radio Button is not selected..!!");
		}
		
		
		WebElement selectcountry =driver.findElement(By.id("select3"));
		Select sc=new Select(selectcountry);
		sc.selectByVisibleText("India");
		
		
		WebElement selectstate=driver.findElement(By.id("select5"));
		
		if(selectstate.isEnabled()) {
			System.out.println("Select drop down is enable");
			Select sstate=new Select(selectstate);
			sstate.selectByIndex(18);
			
		}else {
			System.out.println("Select drop down is not enable");
		}
		
		
WebElement selectcity=driver.findElement(By.xpath("//select[option[text()='Select City']]"));
		
		if(selectcity.isEnabled()) {
			System.out.println("Select drop down is enable");
			Select scity=new Select(selectcity);
			scity.selectByIndex(2);
			
		}else {
			System.out.println("Select drop down is not enable");
		}
		
		
WebElement selectQuantity=driver.findElement(By.id("select7"));
		
		if(selectQuantity.isEnabled()) {
			System.out.println("Select drop down is enable");
			Select squantity=new Select(selectQuantity);
			squantity.selectByIndex(2);
			
		}else {
			System.out.println("Select drop down is not enable");
		}
		
		driver.findElement(By.id("continuebtn")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
