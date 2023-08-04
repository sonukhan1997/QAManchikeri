package methodsofwebdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfToURLUrl {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//pass the main url of the application
	driver.get("https://www.dassault-aviation.com/en/");
	//go to the groups page
	URL mainUrl = new URL("https://www.dassault-aviation.com/en/");
	URL groupPageUrl=new URL(mainUrl,"group/");
	URL defensePageUrl=new URL(mainUrl,"defense/");
	URL passionPageUrl=new URL(mainUrl,"passion/");
	Navigation navigate = driver.navigate();
	Thread.sleep(2000);
	navigate.to(groupPageUrl);
	Thread.sleep(2000);
	navigate.to(defensePageUrl);
	Thread.sleep(2000);
	navigate.to(passionPageUrl);
	Thread.sleep(2000);
	driver.manage().window().minimize();
	Thread.sleep(2000);
	driver.quit();
	
}
}
