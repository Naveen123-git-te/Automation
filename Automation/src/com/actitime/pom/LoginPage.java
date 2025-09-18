package com.actitime.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBys({
	@FindBy(id="username"),
	@FindBy(name="username")})
private WebElement unTbx;
	@FindAll(
	{@FindBy(tagName ="a"),
	@FindBy(xpath ="//a")})
	private List<WebElement> allLinks;
	@FindBy(name="pwd")		//Declaration
private WebElement pwdTbx;
	@FindBy(xpath = "//div[text()='Login ']")
private WebElement loginBtn;
	
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);//Initialization
}

public void setLogin(String un,String pwd) {
	unTbx.sendKeys(un);
	pwdTbx.sendKeys(pwd);//Utilization
	loginBtn.click();
	}
}
