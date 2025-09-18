package basics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Exec {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	Demo.demo(driver);
	WebDriver driver1=new EdgeDriver();
	Demo.demo(driver1);
	WebDriver driver2=new FirefoxDriver();
	Demo.demo(driver2);
}
}
