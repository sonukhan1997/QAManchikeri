package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetWindowHandle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		String parentWindowId = driver.getWindowHandle();
		System.out.println("parentWindowId:"+parentWindowId);
		driver.quit();
		
;	}

}
