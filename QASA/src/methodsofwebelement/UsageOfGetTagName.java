package methodsofwebelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTagName {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	//String actualloginButtonTagName = loginButton.getTagName();
	//System.out.println("actualloginButtonTagName is : <"+actualloginButtonTagName+">");
	List<WebElement> allformTags = driver.findElements(By.tagName("form"));
	for (WebElement formEle : allformTags) {
		String parentTagName=formEle.getTagName();
		//verify the form tag
		if (parentTagName.equals("form")) {
			System.out.println("The target button is in the <form>");
			try {
				WebElement loginButton = formEle.findElement(By.name("login"));
				String buttonTagName = loginButton.getTagName();
				//verify the tagname of the button 
				if (buttonTagName.equals("button")) {
					System.out.println("Button is made with <"+buttonTagName+">");
					String typeAttribute = loginButton.getAttribute("type");
					//verify the element's type attribute value Is submit or Not
					if (typeAttribute.isEmpty()) {
						System.out.println("Login Button neither type attribute nor it's value is matching our expecgtation.  ");
					}else {
						System.out.println("Login Button has type attribute and it's value is "+typeAttribute);
						loginButton.submit();
						Thread.sleep(5000);
					}
				}else {
					System.out.println("Button is made with <"+buttonTagName+">");
				}
			} catch (NoSuchElementException e) {
				System.out.println("Login Button is not found in the <form>");
			}	
		}else {
			System.out.println("The target button is not present in  the <form>");
		}
	}
	
	driver.manage().window().minimize();
	driver.quit();
}
}