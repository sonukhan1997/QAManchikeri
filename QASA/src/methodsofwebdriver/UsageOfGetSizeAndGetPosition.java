package methodsofwebdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSizeAndGetPosition {
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
			if(windowUrl.equals("https://demoqa.com/browser-windows")) {

			} else if(windowUrl.equals("https://demoqa.com/sample")) {
				System.out.println(driver.manage().window().getSize());
				int childWindowHeight = driver.manage().window().getSize().getHeight();
				System.out.println("childWindowHeight="+childWindowHeight);
				int childWindowWidth = driver.manage().window().getSize().getWidth();
				System.out.println("childWindowWidth="+childWindowWidth);
				System.out.println(driver.manage().window().getPosition());
				int childWindowStartX = driver.manage().window().getPosition().getX();
				System.out.println("childWindowStartX="+childWindowStartX);
				int childWindowStartY = driver.manage().window().getPosition().getY();
				System.out.println("childWindowStartY="+childWindowStartY);
				
				
			}
			
		}
	}

}
