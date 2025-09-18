package handling_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("iphone 14 pro max");
		Thread.sleep(2000);
		List<WebElement> allSuggs = 
				driver.findElements(By.xpath("//span[contains(text(),'iphone 14 pro')]/.."));
		System.out.println(allSuggs.size());
		for (WebElement ele : allSuggs) {
			String text = ele.getText();
			System.out.println(text);
		}
		searchBox.sendKeys(Keys.ENTER);
		List<WebElement> mobNames = 
				driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone')]"));
		List<WebElement> mobPrices = 
		driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone')]/following::div[7]"));
		for(int i=0;i<mobNames.size()&&i<mobPrices.size();i++) {
			WebElement mn = mobNames.get(i);
			WebElement mp = mobPrices.get(i);
			String name = mn.getText();
			String price = mp.getText();
			System.out.println("The price of "+name+" is "+price);
		}
	}
}
