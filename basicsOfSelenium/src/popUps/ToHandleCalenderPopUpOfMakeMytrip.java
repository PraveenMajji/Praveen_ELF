package popUps;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleCalenderPopUpOfMakeMytrip {

	public static void main(String[] args) {
		LocalDateTime sysDateTime = LocalDateTime.now().plusMonths(2);
		String month = sysDateTime.getMonth().name();
		int year = sysDateTime.getYear();
		int date = sysDateTime.getDayOfMonth();
		String monthName=""+month.charAt(0)+month.substring(1,month.length()).toLowerCase();
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		driver.get("https://www.makemytrip.com/");
		action.click().perform();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='"+monthName+" "+year+"']/../..//p[text()='"+date+"']")).click();
				break;
			}
			catch(NoSuchElementException e) {
			//	driver.findElement(By.xpath("//))
			}
		}
		//driver.findElement(By.linkText("Search")).click();
		
	}

}
