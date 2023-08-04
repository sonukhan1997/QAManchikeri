package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightAlignment {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement emailTextField = driver.findElement(By.id("email"));
	WebElement passwordTextField = driver.findElement(By.id("passContainer"));
	int emailEndX=emailTextField.getRect().getX() + emailTextField.getRect().getWidth();
	System.out.println("emailEndX =  " + emailEndX);
	int passwordEndX = passwordTextField.getRect().getX() + passwordTextField.getRect().getWidth();
	System.out.println("passwordEndX = " + passwordEndX);
	if (emailEndX==passwordEndX) {
		System.out.println("Pass: The Right Alignment of both username and password textfield is found correct and it Is verified.");
	}else {
		System.out.println("Fail: The Right ALignment of both username and password textfield is found incorrect and it is verified.");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}