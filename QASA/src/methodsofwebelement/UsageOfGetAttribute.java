package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetAttribute {
 public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	WebElement loginOption = driver.findElement(By.linkText("Login"));
	loginOption.click();
	Thread.sleep(2000);
	WebElement usernameTextField = driver.findElement(By.xpath("//label[text()='Email ID / Username']/following-sibling::input"));
	Thread.sleep(2000);
	String actualUsernamePlaceHolderText = usernameTextField.getAttribute("placeholder");
	System.out.println("actualUsernamePlaceHolderText = " + actualUsernamePlaceHolderText);
	WebElement passwordTextField = driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input"));
	String actualPasswsordPlaceholderText = passwordTextField.getAttribute("placeholder");
	System.out.println("actualPasswsordPlaceholderText = " + actualPasswsordPlaceholderText);
	driver.manage().window().minimize();
	driver.quit();
	
}
}