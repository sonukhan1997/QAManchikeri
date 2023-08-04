package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClick {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
	//find the male radio button
	WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/../input[@type='radio']"));
	maleRadioButton.click();
	Thread.sleep(2000);
	WebElement monthDropDown = driver.findElement(By.id("month"));
	monthDropDown.click();
	
}
}