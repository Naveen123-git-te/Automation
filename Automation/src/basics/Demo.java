package basics;

import org.openqa.selenium.WebDriver;

public class Demo {
public static void demo(WebDriver driver) {
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	String title = driver.getTitle();
	System.out.println(title);
	//getPageSource() is used to get the source code current webpage
	String pgSrc = driver.getPageSource();
	driver.quit();
}
}
