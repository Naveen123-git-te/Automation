package handling_dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	driver.navigate().refresh();
	driver.findElement(By.linkText("Create new account")).click();
	WebElement month = driver.findElement(By.id("month"));
	Select s=new Select(month);
//selectByIndex(int index) will select the option based on the mentioned index, indexing starts from 0
	s.selectByIndex(2);
//selectByValue(String value) will select the option based on the mentioned attribute value of
//value attribute in <option> tag
	s.selectByValue("12");
//selectByVisibleText(String visibleText) will select the option based on the mentioned tagText of <option> tag
	s.selectByVisibleText("Sep");
}
}
