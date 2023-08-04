package takingscreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webElementScreenshot {

public static void main(String[] args) throws Throwable {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.nasa.gov/");
	File srcFile = driver.findElement(By.xpath("//nav[@id='navbar-nasa']//a/img")).getScreenshotAs(OutputType.FILE);
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	File destFile = new File("./errorshots/nasalogo"+timeStamp+".png");
	FileUtils.copyFile(srcFile, destFile);
	driver.manage().window().minimize();
	driver.quit();
}
}