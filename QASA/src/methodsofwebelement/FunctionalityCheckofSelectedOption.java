package methodsofwebelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FunctionalityCheckofSelectedOption {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
	////label[text()='Male']/../input[@type='radio']
	//identify the month dropdown
	WebElement monthDropdown = driver.findElement(By.id("month"));
	//create the select class Object
	Select monthSelect = new Select(monthDropdown);
	//capture all the options in the month dropdown 
	List<WebElement> allMonthOptions = monthSelect.getOptions();
	//iterate it and take one WebElement at a time
	for (WebElement monthOption : allMonthOptions) {
		String visibleText = monthOption.getText();
		monthSelect.selectByVisibleText(visibleText);
		if (monthOption.isSelected()) {
			System.out.println("Pass: "+visibleText+" is Selected");
		}else {
			System.out.println("Fail: "+visibleText+" is not Selected");
		}
	}
}
}