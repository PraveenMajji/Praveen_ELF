package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WoodenStreet4x4x4 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//WebDriverWait explicitWait=new WebDriverWait(driver, 2);
		//Step:1-Go to wooden Street
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		//Step:2-Place Cursor on 4th NavbarElement and Select 4th category and select the 4th product from that category
		WebElement dining = driver.findElement(By.linkText("Dining"));
		Actions action=new Actions(driver);
		action.moveToElement(dining).perform();
		//Step:3:Fetch the Cost Of Product
		driver.findElement(By.xpath("//a[text()='8 Seater Dining Sets ']")).click();
		String costOfProduct=driver.findElement(By.xpath("(//a[text()='Janet 8 Seater Dining Set (Honey Finish)'])[1]/../..//strong")).getText();
		costOfProduct=costOfProduct.replace("Rs", "");
		 costOfProduct=costOfProduct.replace(",", "");
		 costOfProduct=costOfProduct.trim();
		 int cost = Integer.parseInt(costOfProduct);
		 if(cost>60000) {
			 System.out.println("too pricey");
		 }
		 else {
			WebElement addTocart = driver.findElement(By.xpath("(//p[text()=' Add to Cart'])[4]"));
			action.moveToElement(addTocart).perform();
			driver.findElement(By.xpath("(//p[text()=' Add to Cart'])[4]")).click();
			//explicitWait.until(ExpectedConditions.elementToBeClickable(addTocart));
		 }
	
	}
}



