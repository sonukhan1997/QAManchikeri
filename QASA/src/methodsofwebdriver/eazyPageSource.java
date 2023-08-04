package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eazyPageSource {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String pageSource = driver.getPageSource();
	String text = "Facebook helps you connect and share with the people in your life.";
	if(pageSource.contains(text)) {
		System.out.println("Boolean true");
		
	}else {System.out.println("Boolean false");
	}driver.manage().window().minimize();
	driver.quit();
}
}
