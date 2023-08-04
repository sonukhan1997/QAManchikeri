package methodsofwebdriver;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TransferControlToChildWindowAndClose {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
	    WebElement newWindowButton=driver.findElement(By.id("windowButton"));
		newWindowButton.click();
		Set<String> allWindowsId = driver.getWindowHandles();
        for(String wid:allWindowsId) {
        	String windowUrl=driver.switchTo().window(wid).getCurrentUrl();
        	System.out.println(windowUrl);
        	if(windowUrl.equals("https://demoqa.com/browser-windows")) {
        		//close the parent window
        		//driver.close();
        		driver.manage().window().minimize();
        		}
        	else if (windowUrl.equals("https://demoqa.com/sample")) {
        		//maximize the child window
        		driver.manage().window().maximize();
        		Thread.sleep(2000);
        		driver.manage().window().fullscreen();
        		
        	}
		}
		
	}
	

}