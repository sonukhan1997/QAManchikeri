package methodsofwebelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exp {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	List<WebElement> allformTags = driver.findElements(By.tagName("form"));
	System.out.println(allformTags.size());
	for (WebElement formTag : allformTags) {
		try {
			formTag.findElement(By.id("loginButton"));
		} catch (NoSuchElementException e) {
			System.out.println("Login Button is not found in the <form>");
		}
	}
	driver.manage().window().minimize();
	driver.quit();
}
}