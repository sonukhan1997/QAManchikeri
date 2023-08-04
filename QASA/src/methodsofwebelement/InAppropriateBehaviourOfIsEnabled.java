package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InAppropriateBehaviourOfIsEnabled {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.oracle.com/in/database/technologies/oracle-database-software-downloads.html");
driver.findElement(By.xpath("//td[text()=' Oracle Solaris (x86 systems, 64-bit)']/..//a[text()=' ZIP']")).click();
Thread.sleep(5000);
WebElement checkBox = driver.findElement(By.xpath("(//input[@name='licenseAccept'])[1]"));
Thread.sleep(2000);
checkBox.click();
Thread.sleep(2000);
WebElement button = driver.findElement(By.xpath("//a[text()='Download SOLARIS.X64_195000_db_home.zip']"));
Thread.sleep(2000);
if (button.isEnabled()) {
	System.out.println("Boolean True");
}else {
	System.out.println("Boolean False");
}


}
}