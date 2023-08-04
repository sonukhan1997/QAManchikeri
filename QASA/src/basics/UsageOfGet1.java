package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGet1 {
	public static void main(String[] args) {
		//Launch the Chrome Browser
		WebDriver driver = new ChromeDriver();
		//pass the main URL of the application
		//main URL = protocol + doaminName
		//it will wait until the webpage has got loaded
		//it will not release the control to the next line
		driver.get("https://www.flipkart.com/");
		//get The title Of the home page
		String actualHomepageTitle = driver.getTitle();
		System.out.println("actualHomepageTitle = " + actualHomepageTitle);
		//capture the current URL in the browser window
		String actualHomePageUrl = driver.getCurrentUrl();
		System.out.println("actualHomePageUrl = " + actualHomePageUrl);
		driver.quit();
		
	}


}
