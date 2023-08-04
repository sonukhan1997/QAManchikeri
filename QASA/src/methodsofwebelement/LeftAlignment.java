package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeftAlignment {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 WebElement emailTextField = driver.findElement(By.id("email"));
	 WebElement passwordTextField = driver.findElement(By.id("passContainer"));
	 int emailStartX = emailTextField.getRect().getX();
	 System.out.println("emailStartX = " + emailStartX);
	 int passwordStartX = passwordTextField.getRect().getX();
	 System.out.println("passwordStartX = " + passwordStartX);
	 if (emailStartX==passwordStartX) {
		System.out.println("Pass: The Left alignment of both username and password text field is correct and It Is verified");
	}else {
		System.out.println("Fail: The Left alignment of both username and password text field is incorrect and It Is verified");
	}
	 driver.manage().window().minimize();
	 driver.quit();
}
}