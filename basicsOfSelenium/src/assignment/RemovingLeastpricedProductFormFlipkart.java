package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RemovingLeastpricedProductFormFlipkart {
	public static WebDriver driver;
	public static WebDriverWait explicitWait;
	public static int countOfmobilesAdded=0;

	public static void main(String[] args) throws InterruptedException {
	
		// Step:1:Open Chrome Browser and Navigate to Flipkart.
		
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");	
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//Step:3&4: search and add product
		searchAndAddPhoneToCart("Apple");
		searchAndAddPhoneToCart("realme");
		searchAndAddPhoneToCart("Samsung");
	//	Step:5 remove least priced product
		
		}
	
	//Step:2: Search and Add 3 different products
	public static void searchAndAddPhoneToCart(String productName) throws InterruptedException {
		countOfmobilesAdded++;
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys(productName,Keys.ENTER);
		/*explicitWait=new WebDriverWait(driver, 15);
		explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'"+productName+"')")));*/
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(@data-tkid,'SEARCH')/a")).click();
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		for(String windowId:allWindowIds) {
			driver.switchTo().window(windowId);
		}
		Thread.sleep(4000);
		//explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add to cart']")));
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[.='Place Order']")));
		Thread.sleep(4000);
		driver.close();
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.name("q")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.name("q")).sendKeys(Keys.DELETE);		
	}
}
