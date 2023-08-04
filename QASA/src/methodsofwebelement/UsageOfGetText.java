package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetText {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement linkText = driver.findElement(By.xpath("//a[contains(@href,'recover/initiate/?pri')]"));
	String expectedAnchorTagText = "Forgotten password?";
	System.out.println("expectedAnchorTagText = " + expectedAnchorTagText);
	String actualAnchorTagText = linkText.getText();
	System.out.println("actualAnchorTagText = " + actualAnchorTagText );
	if (actualAnchorTagText.equals(expectedAnchorTagText)) {
		System.out.println("Pass: The <"+linkText.getTagName()+"> text is verified and it is found correct.");
	}else {
		System.out.println("Fail: The <"+linkText.getTagName()+"> text is verified and it is found incorrect.");
	}
	driver.quit();
}
}