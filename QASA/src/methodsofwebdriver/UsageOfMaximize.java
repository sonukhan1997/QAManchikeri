package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfMaximize {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	//pre-condition
	//
	driver.manage().window().maximize();
	driver.get("https://www.dassault-aviation.com/en");
	Thread.sleep(5000);
	driver.manage().window().minimize();
	Thread.sleep(5000);
	driver.quit();
}
}
