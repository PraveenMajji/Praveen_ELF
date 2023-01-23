package popUps;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleCalenderpopUpForAirbnbWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime sysDateTime = LocalDateTime.now();
		int year = sysDateTime.getYear();
		int day = sysDateTime.getDayOfMonth();
		String month = sysDateTime.getMonth().name();
		String monthName = ""+month.charAt(0)+month.substring(1,month.length()).toLowerCase();
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicitWait=new WebDriverWait(driver, 5);
		driver.get("https://www.airbnb.co.in/");
		//explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Close']")));
	//	driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
		driver.findElement(By.xpath("(//img[@id='FMP-target'])[1]")).click();
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		for(String webElement:allWindowIds) {
			driver.switchTo().window(webElement);
		}
		driver.findElement(By.xpath("//div[@data-testid='little-search-icon']")).click();
		driver.findElement(By.xpath("//div[text()='Check in']")).click();
		driver.findElement(By.xpath("//div[@data-testid='calendar-day-"+day+"/"+month+"/"+year+"']")).click();
		//driver.findElement(By.xpath("//h3[text()='"+monthName+" "+year+"']/../../..//div[text()='"+day+"']")).click();

	}

}
