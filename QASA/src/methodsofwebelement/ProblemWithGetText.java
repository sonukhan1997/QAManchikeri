package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Open Defect
public class ProblemWithGetText {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//WebElement anchorTagText = driver.findElement(By.className("_8esh"));
	//String actaulAnchorTagText = anchorTagText.getText();
	//Since <a> has No subtag so no issues
	//System.out.println("actaulAnchorTagText = " + actaulAnchorTagText);
	WebElement divTagEle = driver.findElement(By.id("reg_pages_msg"));
	String actualDivTagText = divTagEle.getText();
	// for a celebrity, brand or business.
	//script is failed neither script has problem - no 
	//nor - defect in app - no 
	//getText() will capture both main and sub tag text 
	//sel document it has not specified for which purpose we have use this method
	String expectedDivTagText = " for a celebrity, brand or business.";
	System.out.println("expectedDivTagText = "  + expectedDivTagText);
	System.out.println("actualDivTagText = " + actualDivTagText);
	if (actualDivTagText.equals(expectedDivTagText)) {
		System.out.println("Pass: <div> text Is correct and verified.");
	}else {
		System.out.println("Fail: <div> text is incorrect and verified.");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}