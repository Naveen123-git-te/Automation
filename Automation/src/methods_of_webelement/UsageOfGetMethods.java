package methods_of_webelement;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetMethods {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://fb.com");
	driver.navigate().refresh();
	WebElement ele = driver.findElement(By.name("login"));
	//getTagName() is used to get the tagName of an element
	String tagName = ele.getTagName();
	//getText() is used to get the tagText/ visible text of an element
	//If the element not having tag text it will return empty space
	String text = ele.getText();
//getAttribute(String attName) is used to fetch the attribute value of mentioned attName
//If the attName is not present it will return null 
	String attValue = ele.getAttribute("href");
//getCssValue(String propName) is used to fetch the css property of a ele like 
//color,font size,font type, background etc 
//If the propName is not present it will return null 
	String fontSize = ele.getCssValue("font-size");
	System.out.println("Tagname of ele: "+tagName);
	System.out.println("Tag text of ele: "+text);
	System.out.println("Attribute value of data-testid: "+attValue);
	System.out.println("Font size of the element:"+fontSize);
	driver.quit();
}
}
