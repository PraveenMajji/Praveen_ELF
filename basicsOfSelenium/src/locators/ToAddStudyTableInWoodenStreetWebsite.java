package locators;

import java.util.Set;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAddStudyTableInWoodenStreetWebsite {
	public static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Step:1-Go to wooden Street
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(1000);
		//Strp:2-Select study table
		driver.findElement(By.xpath("//p[text()='Study Tables']")).click();
		Thread.sleep(1000);
		//Step:3-Fetch the cost of the product
		 String costOfProduct = driver.findElement(By.xpath("((//div[contains(@id,'article')])[2]//div//strong[contains(text(),'Rs')]")).getText();
		 costOfProduct=costOfProduct.replace("Rs", "");
		 costOfProduct=costOfProduct.replace(",", "");
		 costOfProduct=costOfProduct.trim();
		 //Strp:4-Check the cost is greter than 10000
		 int cost = Integer.parseInt(costOfProduct);
		 if(cost>10000) {
			 System.out.println("too pricey");
		 }
		 else {
			 driver.findElement(By.xpath("//div[contains(@id,'article')])[2]//a")).click();
			 String parentWindow = driver.getWindowHandle();
				Set<String> allWindowIds = driver.getWindowHandles();
				allWindowIds.remove(parentWindow);
				for(String windowId:allWindowIds) {
					driver.switchTo().window(windowId);
				}
				driver.findElement(By.id("button-cart-buy-now")).click();
		 }
		
		
		
		
		

	}
	
}
