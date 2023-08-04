package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfCloseAndQuit {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//it will the close the window which the current driver reference.
		//it will not close the browser aPi in the backend of the same session
		//driver.close();
		//post condition
		//Terminate the session
		//Close the browser window under the driver control/reference
		//close the browser API in the Back end of the current session
		driver.quit();
	}

}
