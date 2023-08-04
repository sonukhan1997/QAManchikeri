package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class WrongPlaceSubmit {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demo.actitime.com/login.do");
	 //UnsupportedOperationException - Java - Run - unchecked
	 //wrong button <a>
	 driver.findElement(By.id("loginButton")).submit();
}
}