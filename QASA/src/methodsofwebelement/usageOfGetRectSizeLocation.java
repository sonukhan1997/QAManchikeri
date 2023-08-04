package methodsofwebelement;
    import org.openqa.selenium.By;
	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.Point;
	import org.openqa.selenium.Rectangle;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class usageOfGetRectSizeLocation {
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			WebElement emailTextField = driver.findElement(By.id("email"));
			Dimension emailDimension = emailTextField.getSize();
			System.out.println("emailDimension = " + emailDimension);
			int emailWidth = emailDimension.getWidth();
			System.out.println("emailWidth = " + emailWidth);
			int emailHeight = emailDimension.getHeight();
			System.out.println("emailHeight = " + emailHeight);
			Point emailPoint = emailTextField.getLocation();
			System.out.println("emailPoint = " + emailPoint);
			int emailStartX = emailPoint.getX();
			System.out.println("emailStartX = " + emailStartX);
			int emailStartY = emailPoint.getY();
			System.out.println("emailStartY = " + emailStartY);
			WebElement passwordTextField = driver.findElement(By.id("passContainer"));
			Dimension passwordDimension = passwordTextField.getSize();
			System.out.println("passwordDimension = " + passwordDimension);
			int passwordWidth = passwordDimension.getWidth();
			System.out.println("passwordWidth = " + passwordWidth);
			int passwordHeight = passwordDimension.getHeight();
			System.out.println("passwordHeight = " + passwordHeight);
			Point passwordPoint = passwordTextField.getLocation();
			System.out.println("passwordPoint = " + passwordPoint);
			int passwordStartX = passwordPoint.getX();
			System.out.println("passwordStartX = " + passwordStartX);
			int passwordStartY = passwordPoint.getY();
			System.out.println("passwordStartY = " + passwordStartY);
			Rectangle emailRect = emailTextField.getRect();
			//System.out.println("emailRect = " + emailRect);
			int emailRectWidth = emailRect.getWidth();
			System.out.println("emailRectWidth = " + emailRectWidth);
			int emailRectHeight=emailRect.getHeight();
			System.out.println("emailRectHeight = " + emailRectHeight);
			int emailRectStartX=emailRect.getX();
			System.out.println("emailRectStartX = " + emailRectStartX);
			int emailRectStartY=emailRect.getY();
			System.out.println("emailRectStartY = " + emailRectStartY);
			Rectangle passwordRect = passwordTextField.getRect();
			//System.out.println("passwordRect = " + passwordRect);
			int passwordRectWidth = passwordRect.getWidth();
			System.out.println("passwordRectWidth = " + passwordRectWidth);
			int passwordRectHeight=passwordRect.getHeight();
			System.out.println("passwordRectHeight = " + passwordRectHeight);
			int passwordRectStartX=passwordRect.getX();
			System.out.println("passwordRectStartX = " + passwordRectStartX);
			int passwordRectStartY=passwordRect.getY();
			System.out.println("passwordRectStartY = " + passwordRectStartY);
			driver.manage().window().minimize();
			driver.quit();
			
			
		}
		}

	

