package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usageOfSendKeys {
public static void main(String[] args) throws InterruptedException {
	//set the executable path
	System.setProperty("WebDriver.chrome.driver","./drivers.chromedriver.exe");
	//instantiate the browser specific class
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://demo.vtiger.com/vtigercrm/");
    WebElement usernameTextField = driver.findElement(By.id("username"));
    //usernameTextField.clear();
    //IllegalArgumentException-java-run-Unchecked
    //usernameTextField.sendKeys(null);
    usernameTextField.sendKeys("selenium");
    Thread.sleep(3000);
    usernameTextField.sendKeys(Keys.CONTROL+"a");
    Thread.sleep(3000);
    usernameTextField.sendKeys(Keys.BACK_SPACE);
    Thread.sleep(3000);
    
}
}
