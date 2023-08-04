package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InAppropriatebehaviourOfIsEnabled1 {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.oracle.com/in/database/technologies/oracle-database-software-downloads.html");
	driver.findElement(By.xpath("//td[text()=' Oracle Solaris (x86 systems, 64-bit)']/..//a[text()=' ZIP']")).click();
	Thread.sleep(5000);
	WebElement checkBox = driver.findElement(By.xpath("(//input[@name='licenseAccept'])[2]"));
	Thread.sleep(2000);
	//checkBox.click();
	Thread.sleep(2000);
	//here the button is Made with <a>
	WebElement button = driver.findElement(By.xpath("//a[text()='Download SOLARIS.X64_195000_db_home.zip']"));
	Thread.sleep(2000);
	//After selecting the checkbox Check for the enability - boolean true
	//before selecting the checkbox check for the disability - boolean true
	//this Is the inappropriate behaviour of the isEnabled()
	//Always it is the best practice to use It on <button> and <input>
	if (button.isEnabled()) {
	System.out.println("Boolean True");
}else {
	System.out.println("Boolean False");
}


}
}