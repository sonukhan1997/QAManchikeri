package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTabUsage {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://belurmath.org/");
	driver.switchTo().newWindow(WindowType.TAB).navigate().to("https://belurmath.org/notice-sale-of-immovable-properties/");
	driver.switchTo().newWindow(WindowType.TAB).navigate().to("https://donations.belurmath.org/");
	driver.close();
	//driver has discontinued it's control from the session after closing the latest tab
	//NoSuchWindowException - Selenium - run - Unchecked
	//Switch and operate the tab by that driver has a ref top speak
	driver.close();
	driver.close();
}
}