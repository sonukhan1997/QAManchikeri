package methodsofwebdriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class DealWithWindowTabs {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://belurmath.org/");
	driver.switchTo().newWindow(WindowType.TAB).navigate().to("https://belurmath.org/notice-sale-of-immovable-properties/");
	driver.switchTo().newWindow(WindowType.TAB).navigate().to("https://donations.belurmath.org/");
	Set<String> allTabsId = driver.getWindowHandles();
	for (String tid : allTabsId) {
		driver.switchTo().window(tid).close();
	}
}
}