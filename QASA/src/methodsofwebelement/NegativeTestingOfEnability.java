package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NegativeTestingOfEnability {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
	WebElement submitButton = driver.findElement(By.name("submit"));
	if (submitButton.isEnabled()) {
		System.out.println("Boolean True");
		System.out.println("-ve testing - button should be disabled");
		System.out.println("Fail: The Submit is  enabled before selecting the Accept terms Of Service checkbox");
	}else {
		System.out.println("Boolean False");
		System.out.println("-ve testing - button should be disabled");
		System.out.println("Pass: The Submit is disabled before selecting the accept terms of service checkbox.");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}