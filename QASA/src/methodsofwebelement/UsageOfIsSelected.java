package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsSelected {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
	WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/../input[@type='radio']"));
	//isSelected() largely used to check the state of selection of the elements
	//made with <input> and <select>
	if (maleRadioButton.isSelected()) {
		System.out.println("Boolean True");
		System.out.println("Male Radio button is already Selected");
	}else {
		System.out.println("Boolean False");
		maleRadioButton.click();
	}
}
}