package seleniumwebdriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setUp() throws InterruptedException  {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		}
	
	@Test
	
	public void googletitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	
	 @AfterMethod
	 
	 public void tearDown() { driver.quit(); }
	 
	
	
	
}
