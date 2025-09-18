package handling_dropdowns;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintInAplhabeticalOrder {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value");
		String value=scan.next();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://fb.com/");
		driver.navigate().refresh();
		driver.findElement(By.linkText("Create new account")).click();
		WebElement month = driver.findElement(By.id("month"));
		Select s = new Select(month);
		List<WebElement> allOpts = s.getOptions();
		List<String> allOptInList = new ArrayList<String>();
		int count = allOpts.size();
		//s.selectByIndex(count-2);
		for (int i = 0; i < count; i++) {
			WebElement ele = allOpts.get(i);
			String text = ele.getText();
			if(text.equals(value)) {
				System.out.println(text+" is present");
			}
			allOptInList.add(text);
		}
		Collections.sort(allOptInList);
		for (String text : allOptInList) {
			System.out.println(text);
		}
		driver.quit();
	}
}
