package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingOfObscurredElement {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	Thread.sleep(3000);
	WebElement obscuredElement = driver.findElement(By.xpath("//span[contains(@class,'a-button-base glow-toaster-button')]//input[@type='submit']"));
	obscuredElement.click();
	//Handle the Obscured Element 
	//Sholuld not change the dynamics of the WebPage
	//ElementClickInterceptedException - run - selenium - Unchecked - click()
	WebElement customerService = driver.findElement(By.xpath("//a[text()='Customer Service' and not(@class='hmenu-item')]"));
	customerService.click();
}
}