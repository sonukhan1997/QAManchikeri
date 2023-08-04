package alocators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sortable {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	Actions actions=new Actions(driver);
	driver.get("https://jqueryui.com/sortable/");
	driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
	List<WebElement> allItems = driver.findElements(By.xpath("//li[@class='ui-state-default ui-sortable-handle']"));
	for(WebElement sortableEle:allItems) {
		//System.out.println(sortableEle.getText());
		if(sortableEle.getText().equals("Item 1")) {
			//actions.scrollByAmount(0, 220).pause(2000).moveToElement(sortableEle).clickAndHold().moveByOffset(0, 75).build().perform();
			actions.scrollByAmount(0, 240).pause(4000).dragAndDropBy(sortableEle, 0, 134).pause(4000).build().perform();
		}
	}
}
}
