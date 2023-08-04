package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyHomePage_01 {
public static void main(String[] args) {
	 //Step 01: Launch the browser
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	//Step 02: Enter the main URL 
	driver.get("https://demo.actitime.com/");
	String expectedLoginPageTitle = "actiTIME - Login";
	System.out.println("expectedLoginPageTitle  = " + expectedLoginPageTitle);
	String actaualLoginPageTitle = driver.getTitle();
	System.out.println("actaualLoginPageTitle = " + actaualLoginPageTitle);
	String expectedLoginPageUrl = "https://demo.actitime.com/login.do";
	System.out.println("expectedLoginPageUrl = " + expectedLoginPageUrl);
	String actualLoginPageUrl = driver.getCurrentUrl();
	System.out.println("actualLoginPageUrl = " + actualLoginPageUrl);
	if (actaualLoginPageTitle.equals(expectedLoginPageTitle)) {
		System.out.println("The Title of the Login Page is found correct and it is verified.");
		if (actualLoginPageUrl.equals(expectedLoginPageUrl)) {
			System.out.println("The URL of the LOgin Page is found correct and verified.");
			System.out.println("Pass: The Login page is displayed");
			//Step 03: Enter the Valid User name 
			WebElement usernameTextField = driver.findElement(By.id("username"));
			if (usernameTextField.getAttribute("value").isEmpty()) {
				usernameTextField.sendKeys("admin");
			}else {
				System.out.println("Username text is having preoccupied value.");
			}
			//Step 04: Enter the Valid Password
			WebElement passwordTextField = driver.findElement(By.name("pwd"));
			if (passwordTextField.getAttribute("value").isEmpty()) {
				passwordTextField.sendKeys("manager");
			}else {
				System.out.println("Password text field  is having preoccupied value.");
			}
			WebElement loginButton = driver.findElement(By.id("loginButton"));
			//Step 05: Click on Login Button
			loginButton.click();
			String expectedHomePageTitle = "actiTIME - Enter Time-Track";
			System.out.println("expectedHomePageTitle = " + expectedHomePageTitle);
			
			
			String expectedHomePageUrl = "https://demo.actitime.com/user/submit_tt.do";
			System.out.println("expectedHomePageUrl = " + expectedHomePageUrl);
			
			WebElement logoutOption = driver.findElement(By.id("logoutLink"));
			if (wait.until(ExpectedConditions.titleIs(expectedHomePageTitle))) {
				System.out.println("Home page title is found correct");
				String actualHomePageTitle = driver.getTitle();
				System.out.println("actualHomePageTitle = " + actualHomePageTitle);
				if (wait.until(ExpectedConditions.urlToBe(expectedHomePageUrl))) {
					System.out.println("Home page URL is found correct");
					String actualHomePageUrl = driver.getCurrentUrl();
					System.out.println("actualHomePageUrl = " + actualHomePageUrl);
					if (wait.until(ExpectedConditions.visibilityOf(logoutOption)).isDisplayed()) {
						System.out.println("Logout Option is displayed in the Home Page");
						System.out.println("Pass: The Home Page is Displayed");
					//Step 6: Click on Logout Option
						logoutOption.click();
						System.out.println("expectedLoginPageTitleAfter = " + expectedLoginPageTitle);
						
						System.out.println("expectedLoginPageUrlAfter = " + expectedLoginPageUrl);
						
						if (wait.until(ExpectedConditions.titleIs(expectedLoginPageTitle))) {
							System.out.println("Login Page title is found corect after logout.");
							String actualLoginPageTitleAfter = driver.getTitle();
							System.out.println("actualLoginPageTitleAfter = " + actualLoginPageTitleAfter);
							if (wait.until(ExpectedConditions.urlToBe(expectedLoginPageUrl))) {
								String actualLoginPageUrlAfter = driver.getCurrentUrl();
								System.out.println("actualLoginPageUrlAfter = " + actualLoginPageUrlAfter);
								System.out.println("Login page URL is found Correct after logout.");
								System.out.println("Pass: LOginPage is displayed after logout");
							}else {
								System.out.println("LoginPage URL is found incorrect after logout.");
								System.out.println("Fail: LOginPage is not displayed after logout");
							}
						}else {
							System.out.println("LoginPage title is found incorrect after logout.");
							System.out.println("Fail : LOginPage is not displayed after logout");
						}
					}else {
						System.out.println("Logout Option is not displayed in the Home Page");
						System.out.println("Fail: The Home Page is not Displayed");
					}
				}else {
					System.out.println("Home page URL is found incorrect");
					System.out.println("Fail: The Home Page is not Displayed");
				}
			}else {
				System.out.println("Home page title is found incorrect");
				System.out.println("Fail: The Home Page is not Displayed");
			}
		}else {
			System.out.println("The URL of the Login Page is incorrect and verified");
			System.out.println("Fail: The Login page is not displayed");
		}
	}else {
		System.out.println("The Title of the Login page Is incorrect and it is verified.");
		System.out.println("Fail: The Login page is not displayed");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}