package handling_popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");//Disabling notification
//	options.addArguments("--start-maximized");//Launching browser in maximized mode
//	options.addArguments("--headless");//Launching browser in headless mode
//	options.addArguments("-incognito");//Launching browser in incognito mode
//	WebDriver driver=new ChromeDriver();//It will launch browser in default settings
WebDriver driver=new ChromeDriver(options);//It will launch the browser in modified settings
	driver.get("https://yatra.com");
	
}
}
