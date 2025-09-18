package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class VerifyWebPage {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver(); 
	driver.get("https://www.google.com");
	String actualTitle = driver.getTitle();
	String actualUrl=driver.getCurrentUrl();
	String expectedTitle="GOOGLE";
	String expectedUrl="google.com";
if(actualTitle.equalsIgnoreCase(expectedTitle) &&
		actualUrl.contains(expectedUrl)) {
		System.out.println("Pass: both title and URL are same");
	}else {
		System.out.println("Fail: both title and URL are not same");
	}
	driver.close();
	}
}
