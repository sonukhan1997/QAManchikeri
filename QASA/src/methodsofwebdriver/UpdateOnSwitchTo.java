package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateOnSwitchTo {
public static void main(String[] args) {
	//Lauch the Empty chrome browser
	WebDriver driver = new ChromeDriver();
	//maximize the browser window which has opened
	driver.manage().window().maximize();
	//create a new tab in the same window object reference - driver
	// WebDriver - switchTo() - TargetLocator
	//in the TargetLocator (I) - new Abstarct method added
	//newWindow(WindowType typeHint) - WebDriver
	//WindowType is a Selenium enum 
	//it has TAB and WINDOW are the two constants present In the enum
	//TAB will open the new tab within the same window
	driver.switchTo().newWindow(WindowType.TAB);

}
}