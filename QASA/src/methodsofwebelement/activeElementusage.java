package methodsofwebelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class activeElementusage {
public static void main(String[] args) {
	//set the executable path
		System.setProperty("WebDriver.chrome.driver","./drivers.chromedriver.exe");
		//instantiate the browser specific class
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	driver.switchTo().activeElement().sendKeys("Selenium");
}
}
