package methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UsageOfWindowHandles {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/browser-windows");
	WebElement newWindowButton = driver.findElement(By.id("windowButton"));
	newWindowButton.click();
	Set<String> allWindowsId = driver.getWindowHandles();
	System.out.println(allWindowsId.size());
	//System.out.println(allWindowsId);
	for (String wid : allWindowsId) {
		System.out.println(wid);
	}
	driver.quit();
	
}
}