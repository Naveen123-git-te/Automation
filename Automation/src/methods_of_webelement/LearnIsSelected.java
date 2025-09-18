package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnIsSelected {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://online.actitime.com/ssandeep/login.do");
	WebElement ele = driver.findElement(By.id("keepLoggedInCheckBox"));
	ele.click();
//isSelected() is used to check whether the checkbox or radio button is selected or not
	boolean res = ele.isSelected();
	if(!res) {
		System.out.println("The checkbox is not selected");	
	}else {
		System.out.println("The checkbox is selected");
	}
	driver.quit();
}
}
