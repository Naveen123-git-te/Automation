package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDrop {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Static.html");
		WebElement drag1 = driver.findElement(By.id("node"));
		WebElement drag2 = driver.findElement(By.id("mongo"));
		WebElement droparea = driver.findElement(By.id("droparea"));
		Actions a=new Actions(driver);
		a.dragAndDrop(drag1, droparea).perform();
		//We use build() when we perform multiple actions(compound actions) in a line
		//build() will return Action interface
		a.clickAndHold(drag2).moveToElement(droparea).release().build().perform();
	}
}