package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPlaceHolderText {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demo.actitime.com/");
	 WebElement usernameTextField = driver.findElement(By.id("username"));
	 String expectedUsernamePlaceHolderText = "Username";
	 System.out.println("expectedUsernamePlaceHolderText = " + expectedUsernamePlaceHolderText);
	 String actualUsernamePlaceHolderText = usernameTextField.getAttribute("placeholder");
	 System.out.println("actualUsernamePlaceHolderText = " + actualUsernamePlaceHolderText);
	 if (actualUsernamePlaceHolderText.equals(expectedUsernamePlaceHolderText)) {
		System.out.println("Pass: The Username Placeholder text is verified and it is found correct.");
	}else {
		System.out.println("Fail: The Username Placeholder text is verified and it is found incorrect.");
	}
	 String expectedpasswordPlaceHolderText = "Password"; 
	 System.out.println("expectedpasswordPlaceHolderText = " + expectedpasswordPlaceHolderText );
	 String actualpasswordPlaceHolderText = driver.findElement(By.name("pwd")).getAttribute("placeholder");
	 System.out.println("actualpasswordPlaceHolderText = " + actualpasswordPlaceHolderText);
	 if (actualpasswordPlaceHolderText.equals(expectedpasswordPlaceHolderText)) {
		 System.out.println("Pass: The Password placeholder text is verified and it Is found correct.");
	}else {
		System.out.println("Fail: The Password placeholder text is verified and It is found incorrect");
	}
	 driver.manage().window().minimize();
	 driver.quit();
}
}