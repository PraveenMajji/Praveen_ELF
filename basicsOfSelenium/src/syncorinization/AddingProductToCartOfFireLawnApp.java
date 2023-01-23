package syncorinization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddingProductToCartOfFireLawnApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://firelawn.com/");
		WebDriverWait explicitWait=new WebDriverWait(driver, 10);
		driver.findElement(By.xpath("//span[text()='5.0']/../..//img[@alt='APPLE iPhone 14 Pro']")).click();
		driver.findElement(By.xpath("//input[@placeholder='580023']")).sendKeys("560076");
		WebElement check = driver.findElement(By.xpath("//button[@type='submit']"));
		explicitWait.until(ExpectedConditions.elementToBeClickable(check));
		check.click();
	}

}
