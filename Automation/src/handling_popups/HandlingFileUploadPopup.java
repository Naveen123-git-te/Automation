package handling_popups;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadPopup {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/qspid/Desktop/naukri.html");
	File f=new File("./data/resume.docx");
	String absPath = f.getAbsolutePath();
	driver.findElement(By.id("upload")).sendKeys(absPath);
}
}
