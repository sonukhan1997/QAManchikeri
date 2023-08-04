package frameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TransferingTheControlToDefaultFrame {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
    driver.switchTo().frame("packageListFrame");
    driver.findElement(By.xpath("//li/a[text()='org.openqa.selenium']")).click();
    Thread.sleep(2000);
    driver.switchTo().defaultContent();
    driver.switchTo().frame("packageFrame");
    driver.findElement(By.xpath("//span[text()='Alert']")).click();
    driver.switchTo().defaultContent();
    Thread.sleep(2000);
    driver.switchTo().frame("classFrame");
    driver.findElement(By.xpath("//div[@class='topNav']//a[text()='Index']")).click();
    Thread.sleep(2000);
    driver.manage().window().minimize();
    driver.quit();
}
}