package methodsofwebdriver;

import java.util.Set;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point;

public class UsageOfManageMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//pre-condition
		driver.manage().window().maximize();
		//pass the main URL
		driver.get("https://demoqa.com/browser-windows");
		//find the new window button
		WebElement newWindowButton = driver.findElement(By.id("windowButton"));
		newWindowButton.click();
		Set<String> allWindowsId = driver.getWindowHandles();
		for (String wid : allWindowsId) {
			String windowUrl = driver.switchTo().window(wid).getCurrentUrl();
			if(windowUrl.equals("https://demoqa.com/browser-windows"))
			{
				Dimension parentWindowTargetSize = new Dimension(1000,1000);
				driver.manage().window().setSize(parentWindowTargetSize);
			}
			else if (windowUrl.equals("https://demoqa.com/sample")){
				Dimension childWindowTargetSize = new Dimension(500,500);
				driver.manage().window().setSize(childWindowTargetSize);
				//=========================================================
				Point childWindowTargetPosition = new Point(0,220);
				driver.manage().window().setPosition(childWindowTargetPosition);
			}
		}
	}

}