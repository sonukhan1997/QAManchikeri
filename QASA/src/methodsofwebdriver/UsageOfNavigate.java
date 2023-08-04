package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavigate {
public static void main(String[] args) throws InterruptedException {
	//Nav Step 01:empty chrome browser
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//Nav Step 02: facebook
	driver.get("https://facebook.com/");
	Thread.sleep(2000);
	//Nav Step 03: back to empty browser
	driver.navigate().back();
	Thread.sleep(2000);
	//Nav Step 04: Navigate forward to facebook
	driver.navigate().forward();
	Thread.sleep(2000);
	//Refresh the webpage
	driver.navigate().refresh();
}
}
