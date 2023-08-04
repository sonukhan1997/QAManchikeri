package frameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameInsideFrame {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	   driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
       driver.switchTo().frame("iframeResult");
       driver.switchTo().frame(0);
      String innerFrameText = driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']")).getText();
      System.out.println("innerFrameText = " + innerFrameText);
      driver.switchTo().parentFrame();
      String parentFrameText = driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width ')]")).getText();
      System.out.println("parentFrameText = " + parentFrameText);
}
}