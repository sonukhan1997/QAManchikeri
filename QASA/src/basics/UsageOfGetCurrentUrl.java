package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCurrentUrl {
	public static void main(String[] args) {
		//Set The driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate The browser specific class
		WebDriver driver=new ChromeDriver();
		//pass the main Url of the app
		driver.get("https://demo.actitime.com/");
		//get The current url of the webpage
		String actualLoginPageUrl = driver.getCurrentUrl();
		//print the actual URL
		//System.out.println("actualLoginPageUrl = " + actualLoginPageUrl);
		WebElement id = driver.findElement(By.id("username"));
		id.sendKeys("admin");
		WebElement pwd=driver.findElement(By.name("pwd"));
		pwd.sendKeys("12346789");
		
		
	}

}
