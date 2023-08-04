package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTitle {
	public static void main(String[] args) {
		//Set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		WebDriver driver=new ChromeDriver();
		//pass the main URL of the application
		driver.get("https://www.facebook.com/");
		//get the title of the login page
		String actualLoginPageTitle = driver.getTitle();
		System.out.println("actualLoginPageTitle = " + actualLoginPageTitle);
	}
}
