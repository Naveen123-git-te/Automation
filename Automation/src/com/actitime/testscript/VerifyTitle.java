package com.actitime.testscript;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class VerifyTitle {
	@Test
public void verifyTitle() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com");
	String actualTitle = driver.getTitle();
	String expectedTitle="Googly";
	Assert.assertEquals(actualTitle, expectedTitle);
	SoftAssert s=new SoftAssert();
	s.assertEquals(actualTitle, expectedTitle);
	System.out.println("Executed");
	driver.quit();
	s.assertAll();
}
}
