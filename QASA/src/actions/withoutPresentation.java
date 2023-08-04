package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class withoutPresentation {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
	driver.get("https://www.myntra.com/");
	WebElement mensection = driver.findElement(By.xpath("//div[@class='desktop-navContent']/div/a[text()='Men']"));
	Actions actions=new Actions(driver);
	//actions.moveToElement(mensection).pause(Duration.ofSeconds(3)).build().perform();
	actions.moveToElement(mensection).pause(Duration.ofSeconds(5)).moveByOffset(73, 0).build().perform();
}
}
