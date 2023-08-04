package alocators;

        import org.openqa.selenium.By;
        import org.openqa.selenium.JavascriptExecutor;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

        public class launchFacebook {
        	
	    public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
	    WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.fb.com");
		System.out.println("facebook empty webpage launched");	
		driver.manage().window().maximize();
		WebElement id=driver.findElement(By.id("email"));
		Thread.sleep(3000);
		id.sendKeys("9449060109");
		System.out.println("Username given");
		Thread.sleep(5000);
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("Powerstar@1997");
		System.out.println("Password given");
		WebElement eye=driver.findElement(By.className("_9lsa"));
		Thread.sleep(8000);
		eye.click();
		System.out.println("Hide icon disabled");
		Thread.sleep(5000);
		WebElement click=driver.findElement(By.name("login"));
		click.click();
		System.out.println("Logged in");
		Thread.sleep(8000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,1000)");
		System.out.println("Successfully facebook home page displayed");
	}

}
