package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveEnabilityOfButton {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
	WebElement acceptTermsOfServiceButton = driver.findElement(By.xpath("//button[text()='Accept Terms of Service']"));
	acceptTermsOfServiceButton.click();
	WebElement acceptTermsOfServiceCHeckbox = driver.findElement(By.id("confbtn"));
	Thread.sleep(5000);
	acceptTermsOfServiceCHeckbox.click();
	WebElement closeButton = driver.findElement(By.xpath("//button[text()='Close']"));
	closeButton.click();
	//here afterwards the enability of the submit Is on - enabled
	WebElement submitButton = driver.findElement(By.name("submit"));
	if (submitButton.isEnabled()) {
		System.out.println("Boolean True");
		System.out.println("+ve Testing - button should be enabled");
		System.out.println("Pass: The Submit is enabled after selecting the Accept terms of Servivce checkbox.");
	}else {
		System.out.println("Boolean False");
		System.out.println("+ve Testing - button should be enabled");
		System.out.println("Fail: The Submit button is disabled evenafter selecting the accept terms of service checkbox.");
	}
	driver.manage().window().minimize();
	driver.quit();
	
}
}