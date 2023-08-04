package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyActitimeLoginPage_01 {
	public static void main(String[] args) {
		//Step: 01 Open the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Step: 02 Enter the main URL of the application
		driver.get("https://demo.actitime.com/");
		String expectedLoginPageTitle= "actiTIME - Login";
		System.out.println("expectedLoginPageTitle = " + expectedLoginPageTitle);
		String actualLoginPageTitle = driver.getTitle();
		System.out.println("actualLoginPageTitle = " + actualLoginPageTitle);
		String expectedLoginPageUrl= "https://demo.actitime.com/login.do";
		System.out.println("expectedLoginPageUrl = " + expectedLoginPageUrl );
		String actualLoginPageUrl = driver.getCurrentUrl();
		System.out.println("actualLoginPageUrl = " + actualLoginPageUrl);
		if (actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("Pass: The Title of the Login page is Correct.");
			if (actualLoginPageUrl.equals(expectedLoginPageUrl)) {
				System.out.println("Pass: The Login page is displayed and it is verified upon the tile and Url");
			}else {
				System.out.println("Fail: The Login page is not displayed and it is verified upon the title and Url");
			}
		}else {
			System.out.println("Fail: The Title of the Login page is incorrect.");
		}
		
	}

}
