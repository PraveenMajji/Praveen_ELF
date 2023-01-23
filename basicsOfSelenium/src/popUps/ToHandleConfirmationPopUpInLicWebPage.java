package popUps;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmationPopUpInLicWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//WebDriverWait explicitWait=new WebDriverWait(driver, 6);
		driver.get("https://licindia.in/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		try{
			driver.findElement(By.linkText("Agents Portal")).click();
		}
		catch(Exception e) {
			
			js.executeScript("window.scrollBy(0,350);");	
			driver.findElement(By.linkText("Agents Portal")).click();
		}
		Alert confirmationAlertRef = driver.switchTo().alert();
		System.out.println(confirmationAlertRef.getText());
		confirmationAlertRef.accept();
		Set<String> allWindowIds = driver.getWindowHandles();
		String parentWindowId = driver.getWindowHandle();
		allWindowIds.remove(parentWindowId);
		for(String WindowId:allWindowIds) {
			driver.switchTo().window(WindowId);
		}
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		String msg = driver.findElement(By.xpath("//li[text()='Please enter your Agent Code or Email or Mobile']")).getText();
		System.out.println(msg);
	}

}
