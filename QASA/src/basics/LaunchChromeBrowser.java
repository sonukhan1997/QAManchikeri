package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChromeBrowser {
public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
//	Instantiate the browser specific class
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://www.google.com");


}
}
