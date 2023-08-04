package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedefineTheSearchCriteria {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement parentElement = driver.findElement(By.tagName("form"));
	WebElement email = parentElement.findElement(By.id("email"));
	WebElement password = parentElement.findElement(By.id("pass"));
	WebElement loginButton = parentElement.findElement(By.name("login"));
	WebElement forgottenPassword = parentElement.findElement(By.linkText("Forgotten password?"));
	WebElement createNewAccount = parentElement.findElement(By.linkText("Create New Account"));
	System.out.println("loginButton TagName = <"+loginButton.getTagName()+">");
	System.out.println("link in the link text = "+forgottenPassword.getAttribute("href"));
	System.out.println("createNewAccount is made with <"+ createNewAccount.getTagName()+">");
	email.sendKeys("Create New Account");
	password.sendKeys("Create New Account");
	loginButton.click();
driver.manage().window().minimize();
	driver.quit();
}
}