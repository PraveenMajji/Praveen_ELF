/* Write a script to remove the text from the text box in OpenSourceBilling
	app(email and password text box) ?*/
package personalAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemovingTextFromTextField {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(Keys.CONTROL +"a");
		driver.findElement(By.id("username")).sendKeys(Keys.DELETE);
		driver.findElement(By.name("pwd")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.name("pwd")).sendKeys(Keys.DELETE);
		

	}

}
