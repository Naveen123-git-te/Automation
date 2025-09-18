package basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.actitime.pom.LoginPage;

public class ExecutionClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://online.actitime.com/tyss/login.do");
		LoginPage l=new LoginPage(driver);//Declare the elements
		PageFactory.initElements(driver, l);
		l.setLogin("admin1","manager1");//@01,@02,@03
		Thread.sleep(5000);
		l.setLogin("admin","manager");//@001,@002,@003
	}
}