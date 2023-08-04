package handlingdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class UsageOfSelectClass {
public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
	WebElement monthDropdown = driver.findElement(By.id("month"));
	Select monthSelect = new Select(monthDropdown);
	//select the option by visible text 
	//monthSelect.selectByVisibleText("Mar");
	//select the option by value attribute of the <option>
	//monthSelect.selectByValue("3");
	monthSelect.selectByIndex(1);
	
}
}