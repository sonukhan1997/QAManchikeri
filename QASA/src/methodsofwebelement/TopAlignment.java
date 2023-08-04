package methodsofwebelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopAlignment {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	List<WebElement> allMenuOptions = driver.findElements(By.className("desktop-navLink"));
	System.out.println(allMenuOptions.size());
	for (WebElement menuOption : allMenuOptions) {
		int startY = menuOption.getRect().getY();
		//System.out.println(startY);
		if (startY==30) {
			System.out.println("Pass: Top Alignment of the Menu Option is found correct and it is verified.");
		}else {
			System.out.println("Fail: Top Alignment of the Menu Option is found incorrect and it is verified.");
		}
	}
	driver.manage().window().minimize();
	driver.quit();
}
}