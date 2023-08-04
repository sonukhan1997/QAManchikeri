package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyEmptinessOfTextField {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	WebElement usernameTextField = driver.findElement(By.id("username"));
	WebElement passwordTextField = driver.findElement(By.id("password"));
	WebElement signinButton = driver.findElement(By.cssSelector("button[class='button buttonBlue']"));
	if (usernameTextField.getAttribute("value").isEmpty()) {
		System.out.println("Boolean True");
		System.out.println("Username textfield is empty");
		usernameTextField.sendKeys("Selenium");
	}else {
		System.out.println("Boolean False");
		System.out.println("Username textfield contains pre-occupied text/default text.");
		usernameTextField.clear();
		if (usernameTextField.getAttribute("value").isEmpty()) {
			System.out.println("Boolean True");
			usernameTextField.sendKeys("Selenium");
		}
	}
	
			
}
}