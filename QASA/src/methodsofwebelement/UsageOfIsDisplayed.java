package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsageOfIsDisplayed {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://services.ecourts.gov.in/");
	WebElement caseStatusMenu = driver.findElement(By.id("leftPaneMenuCS"));
	caseStatusMenu.click();
	Thread.sleep(5000);
	WebElement popupCloseButton = driver.findElement(By.xpath("//div[text()='Select state, district and court complex to proceed further']/../../..//button[@aria-label='Close']"));
	popupCloseButton.click();
	Select stateSelect = new Select(driver.findElement(By.id("sess_state_code")));
	stateSelect.selectByVisibleText("Karnataka");
	Select districtSelect = new Select(driver.findElement(By.id("sess_dist_code")));
	districtSelect.selectByVisibleText("TUMAKURU");
	Select courtComplexSelect = new Select(driver.findElement(By.id("court_complex_code")));
	//courtComplexSelect.selectByIndex(10);
	WebElement courtEstdDropdown = driver.findElement(By.id("court_est_code"));
	if (courtEstdDropdown.isDisplayed()) {
		System.out.println("Boolean True");
	}else {
		System.out.println("Boolean False");
	}
	Select courtEstdSelect = new Select(courtEstdDropdown);
	
}
}