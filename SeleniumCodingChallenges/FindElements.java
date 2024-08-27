package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	
	public static void main (String args[]) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		List <WebElement> linklist =driver.findElements(By.tagName("a"));
		//size of linklist
		System.out.println(linklist.size());
		
		for (int i =0;i<linklist.size();i++) {
			String LinkText=linklist.get(i).getText();
			System.out.println(LinkText);
			
		}
		
	}

}
