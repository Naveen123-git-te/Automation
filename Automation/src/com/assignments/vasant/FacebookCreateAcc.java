package com.assignments.vasant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCreateAcc {
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https:/www.facebook.com"); //calling url
		
		WebElement element= driver.findElement(By.xpath("//a[text()='Create a Page']"));
		String tagName=element.getTagName();
		System.out.println(tagName);
		
		String text=element.getText();
		System.out.println(text);
		
		String attri=element.getAttribute("href");
		System.out.println(attri);
		
		String fontweight=element.getCssValue("font-weight");
		System.out.println(fontweight);
		
		
		
		WebElement element2=driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/recover')]"));
		
		String textcolor=element2.getCssValue("color");
		System.out.println(textcolor);
		
		boolean enable=element2.isEnabled();
		if(enable) {
			System.out.println("Forgetten password? is enable");
		}else {
			System.out.println("Forgetten password? is not enable");
		}
		
		
		boolean display=element2.isDisplayed();
		if(display) {
			System.out.println("Forgetten password? is Displayed");
		}else {
			System.out.println("Forgetten password? is not Displayed");
		}
		
		
		
		driver.quit();
		
	
	}

}
