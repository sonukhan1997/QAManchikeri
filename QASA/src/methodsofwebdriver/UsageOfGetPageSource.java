package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetPageSource {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://belurmath.org/");
	//System.out.println(driver.getPageSource());
	String pageSource = driver.getPageSource();
	String thought = "170th birthday of Holy Mother Sri Sarada Devi will be celebrated at Belur Math on Thursday";
	if(pageSource.contains(thought)) {
		System.out.println("Boolean true");
	}else {
		System.out.println("Boolean false");
	}driver.manage().window().minimize();
	driver.quit();
	
}
}
