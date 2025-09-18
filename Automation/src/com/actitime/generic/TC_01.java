package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 {
public static void main(String[] args) throws IOException {
	FileLib f=new FileLib();
	String data = f.readExcelData("CreateCustomer",0,3);
	System.out.println(data);
	String data1 = f.readExcelData("Sheet2",1,1);
	System.out.println(data1);
	String data2 = f.readExcelData("MultipleData", 5, 2);
	System.out.println(data2);
	f.writeExcelData("CreateCustomer",0,3,"Expected Status");
	f.writeExcelData("Sheet2",1,1,"RCB");
	f.writeExcelData("MultipleData",5,2,"Narendra Modi");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	String url = f.readPropertyData("url");
	driver.get(url);
	String un = f.readPropertyData("un");
	driver.findElement(By.id("username")).sendKeys(un);
	String pwd = f.readPropertyData("pwd");
	driver.findElement(By.name("pwd")).sendKeys(pwd);
}
}
