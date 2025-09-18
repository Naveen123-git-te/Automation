package handling_disabled_elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
public class DisabledElement {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/qspid/Desktop/F1.html");
	driver.findElement(By.id("un")).sendKeys("admin");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("document.getElementById('pwd').value='manager'");
	js.executeScript("document.getElementById('pwd').value=' '");
	}
}
//UN:<input type="text" id="un"><br>
//PWD:<input type="text" id="pwd" disabled><br>
