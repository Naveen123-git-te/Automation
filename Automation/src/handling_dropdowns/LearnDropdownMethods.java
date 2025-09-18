package handling_dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdownMethods {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.linkText("Multi Select")).click();
		WebElement multiSelect = driver.findElement(By.id("select-multiple-native"));
		Select s=new Select(multiSelect);
		s.selectByIndex(0);
		s.selectByValue("Mens Casual Premium Slim Fit T-Shirts ");
		s.selectByVisibleText("Mens Cotton Jacket...");
		s.selectByContainsVisibleText("Slim Fit");
		//	s.deselectByIndex(3);
		//	s.deselectByValue("Mens Cotton Jacket");
		//	s.deselectByVisibleText("Mens Casual Premium ...");
		//	s.deSelectByContainsVisibleText("Foldsac");
		//	s.deselectAll();
		WebElement firstOpt = s.getFirstSelectedOption();
		//System.out.println(firstOpt.getText());
		List<WebElement> allSelOpt = s.getAllSelectedOptions();
		for(int i=0;i<allSelOpt.size();i++) {
			WebElement ele = allSelOpt.get(i);
			//System.out.println(ele.getText());
		}
		//WAS to print all options in dropdown
		List<WebElement> allOpts = s.getOptions();
		for(WebElement ele:allOpts) {
			//	System.out.println(ele.getText());
		}
		boolean res = s.isMultiple();
		if(res==true) {
			System.out.println("It is a multi select dropdown");
		}else {
			System.out.println("It is a single select dropdown");
		}
		WebElement ele = s.getWrappedElement();
		System.out.println(ele.getText());
		driver.quit();
	}
}
