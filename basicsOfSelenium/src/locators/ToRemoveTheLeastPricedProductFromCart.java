package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToRemoveTheLeastPricedProductFromCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7330817465");
		//emailid.clear();
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.clear();
		Thread.sleep(1000);
		pwd.sendKeys("Praveen@21",Keys.ENTER);
		Thread.sleep(1000);
		WebElement searchBar = driver.findElement(By.xpath("//input[contains(@title,'Search for products, brands and more')]"));
		searchBar.clear();
		searchBar.sendKeys("apple mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//body/div[1]/div/div[3]/div[1]/div[2]/div[2]//a")).click();
		
		//driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 12 Mini (Black, 64 GB)')]/../..//div[@class='_30jeq3 _1_WHN1']")).click();
		Thread.sleep(1000);
		String parentWindowId = driver.getWindowHandle();
		 Set<String> allwindowid = driver.getWindowHandles();
		 allwindowid.remove(parentWindowId);
		 for(String windowid:allwindowid) {
			 driver.switchTo().window(windowid);
		 }
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']")).sendKeys("560076");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(1000);
		driver.close();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
