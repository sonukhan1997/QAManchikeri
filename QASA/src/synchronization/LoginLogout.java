package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginLogout {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://trello.com/");
	WebElement loginOption = driver.findElement(By.xpath("//a[text()='Get Trello for free']/ancestor::header[@data-testid='bignav']//a[text()='Log in']"));
	loginOption.click();
	driver.switchTo().activeElement().sendKeys("peoplefortiptur@gmail.com");
	WebElement continueButton = driver.findElement(By.id("login"));
	continueButton.click();
	//wait.until(ExpectedConditions.elementToBeSelected(By.id("password")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
	driver.switchTo().activeElement().sendKeys("9886947924");
	WebElement loginSubmitButton = driver.findElement(By.id("login-submit"));
	loginSubmitButton.submit();
	driver.quit();
}
}