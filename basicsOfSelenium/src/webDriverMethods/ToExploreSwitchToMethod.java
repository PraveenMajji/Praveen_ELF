package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreSwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/LENOVO%207XIN/Downloads/MultipleWindow.html");
		
		driver.findElement(By.xpath("//input[@value='Open Food Sites']" )).click();
		Thread.sleep(2000);
		
		String expectedPageTitle="Original Italian Recipes-Giallozafferano Recipes";
		Set<String> allWindowsID = driver.getWindowHandles();
		
		for(String windowId:allWindowsID) {
			driver.switchTo().window(windowId);
			String actualPageTitle=driver.getTitle();
			
			if(expectedPageTitle.equals(actualPageTitle)) {
				driver.manage().window().maximize();
				break;
				
			}
		}
	}
}
