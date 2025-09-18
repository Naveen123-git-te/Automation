package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoLogin {//POM class
	private WebElement unTbx;
	private WebElement pwdTbx;			//Declaration
	private WebElement loginBtn;
	
	public DemoLogin(WebDriver driver) {
		unTbx=driver.findElement(By.id("username"));
		pwdTbx=driver.findElement(By.name("pwd"));	//Initialization
		loginBtn=driver.findElement(By.xpath("//div[text()='Login ']"));
	}//Business Logic Methods
	public void setLogin(String un,String pwd) {
		unTbx.sendKeys(un);
		pwdTbx.sendKeys(pwd);		//Utilization
		loginBtn.click();
	}
}
