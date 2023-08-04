package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeDeepStudy {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/");
	//<a> their Is no type attribute
	//if we call the getAttriute+() on the element which no attribute as we expected it  will empty String.
	//if we have attribute but contains empty String it will return the empty String itself.
	String typeAttribute = driver.findElement(By.id("loginButton")).getAttribute("type");
	System.out.println("typeAttribute = " + typeAttribute );
	driver.manage().window().minimize();
	driver.quit();
}
}