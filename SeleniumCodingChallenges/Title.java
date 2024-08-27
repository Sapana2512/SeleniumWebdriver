package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class Title {
	
	public static void main(String[]args) {
		WebDriver  driver =new ChromeDriver();
		Title.validLoginTest(driver);
		InvaliduserNameTest(driver);
		InvalidPasswordTest(driver);
		driver.quit();
	}
	private static void validLoginTest(WebDriver driver) {
		
		driver.get("https://www.saucedemo.com");
		WebElement username =driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("standard_user");
		WebElement pasword =driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pasword.sendKeys("secret_sauce");
		WebElement loginbtn=driver.findElement(By.id("login-button"));
		loginbtn.click();
		
		//verify user is directed to the home page
		String currentUrl= driver.getCurrentUrl();
		if(currentUrl.equals("https://www.saucedemo.com/inventory.html")) {
			System.out.println("Test case1 Valid login: Passed");
		}
		else {
		System.out.println("Test case 1 Valid login:Failed");
		}
		
	}
	
	private static void InvaliduserNameTest(WebDriver driver) {
		driver.get("https://www.saucedemo.com");
		WebElement username =driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("standard123");
		WebElement pasword =driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pasword.sendKeys("secret_sauce");
		WebElement loginbtn=driver.findElement(By.id("login-button"));
		loginbtn.click();
		
		// Verify error message is displayed
		WebElement errorMessage =driver.findElement(By.xpath("//div[@class='error-message-container error']"));
		if(errorMessage.getText().equals("Epic sadface: Username and password do not match any user in this service"
			)) {
			System.out.println("Test case 2 InvalidUsername :Passed");
		}
		else {
			System.out.println("Test case 2 InvalidUsername  :Failed");
		}
	}
	
	private static void InvalidPasswordTest(WebDriver driver) {
		driver.get("https://www.saucedemo.com");
		WebElement username =driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("standard_user");
		WebElement pasword =driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pasword.sendKeys("secret_789");
		WebElement loginbtn=driver.findElement(By.id("login-button"));
		loginbtn.click();
		// Verify error message is displayed
		WebElement errorMessage =driver.findElement(By.xpath("//div[@class='error-message-container error']"));
		if(errorMessage.getText().equals("Epic sadface: Username and password do not match any user in this service"
				)) {
				System.out.println("Test case 2 InvalidPassword :Passed");
			}
			else {
				System.out.println("Test case 2 InvalidPassword  :Failed");
			}
		}
	}
		
		
		
	

	

	

	
	


