package seleniumwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver .get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("Test");
		driver.findElement(By.xpath("input[starts-with(@id,'test_']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("Test");
        //for links custom x path
        driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
        //size of linklist
        List <WebElement> linklist =driver.findElements(By.tagName("a"));
        System.out.println(linklist.size());
        for (int i =0;i<linklist.size();i++) {
        	
        	String linkName=linklist.get(i).getText();
        	System.out.println(linkName);
        	
        }
        
        
        
	}
	
	

}
