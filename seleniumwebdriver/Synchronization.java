package seleniumwebdriver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {
	
	//implicit wait...is always applied globally ---is available for all webelements
	//dynamic in nature
	//it can be chnaged anywhere and any time in your code
	
	
	public static void main (String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver .get("https://www.facebook.com");
		
		WebElement firstname= driver.findElement(By.name("firstname"));
		WebElement lastname= driver.findElement(By.name("lastname"));
		
		sendKeys(driver,firstname,10,"Tom");
		
		
		
	}
	//Explicit wait
			//1.no explicit  keyword or method
			//available with WebDriverWait with some ExpectedCondition
			//Specific to element
			//dynamic in nature
	//we should never use implicit wait & explicit wait together
	//selenium webdriver will wait for the element first because of IMPLICIT WAIT and then WAIT will be applied
	//hence total synchronization wait will be increased of each element
	
	

	public static void sendKeys(WebDriver driver,WebElement element,int i,String value) {

	//	new WebDriverWait(driver,i).until(ExpectedConditions.visibilityOf(element));
		//element.sendKeys(value);
	}
	
	
	

}
