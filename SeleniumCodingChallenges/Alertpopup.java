package Day1;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {
	
	public static void main (String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");//click on signin
		driver.findElement(By.name("proceed")).click();
		Alert alert = driver.switchTo().alert();	
		System.out.println(alert.getText());
		String text = alert.getText();
		if(text.equals("Please enter a valid user name")) {
			System.out.println("corrcet alert message");
		}
		else {
			System.out.println("Incorrect alert message");
		}
			
		alert.accept(); //click on ok button
		//alert.dismiss();
	}

}
