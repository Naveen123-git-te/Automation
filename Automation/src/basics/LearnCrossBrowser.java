package basics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnCrossBrowser {
public static void main(String[] args) {
	WebDriver driver;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the browser");
	String browser = s.nextLine();
	if(browser.equals("Chrome")) {
		driver=new ChromeDriver();
	}else if(browser.equals("Edge")) {
		driver=new EdgeDriver();
	}else{
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get("http://localhost/login.do");
	System.out.println(driver.getTitle());
	driver.quit();
}
}
