package takingscreenshots;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebPageScreenshot {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.nasa.gov/");
	//explicit type casting of driver from WebDriver to TakesScreenshot
	TakesScreenshot ts = (TakesScreenshot)driver;
	// method will delete the taken screen shot upon exit
	 File srcFile = ts.getScreenshotAs(OutputType.FILE);
	String fileAddress = srcFile.getAbsolutePath();
	//System.out.println(fileAddress);
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	
	File destFile = new File("./errorshots/nasawebpage"+timeStamp+".png");
	//commons-io lib
	FileUtils.copyFile(srcFile, destFile);
	driver.manage().window().minimize();
	driver.quit();
	
	
}
}