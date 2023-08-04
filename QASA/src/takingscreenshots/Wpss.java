package takingscreenshots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wpss {
public static void main(String[] args) throws IOException {
	WebDriver  driver=new ChromeDriver();
	driver.get("");
	File srcFile = driver.findElement(By.id(null)).getScreenshotAs(OutputType.FILE);
	String timestamp = LocalDateTime.now().toString().replace(':', '-');
	File destfile = new File("\"./errorshot/ss\"+timestamp+\".png\"");
	FileUtils.copyFile(srcFile, destfile);
}
}
