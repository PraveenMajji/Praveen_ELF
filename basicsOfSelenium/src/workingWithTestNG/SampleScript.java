package workingWithTestNG;

import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleScript {
	@Test(priority = 1,enabled = false)
	public static void  createAccount() {//it'll accept static method but it is better to use non-static method
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://karnatakatourism.org/");
		Reporter.log("From Create Acount");
		driver.quit();
		
	}
	@Test(invocationCount = -1,threadPoolSize = 3)
	public void registerAccount() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://tourism.ap.gov.in/home");
		Reporter.log(" From Register Account");
		driver.quit();
	}
	@Test(priority =0,timeOut = 3000)
	public void modifyAccount() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.keralatourism.holiday/");
		Reporter.log("From Modify Account");
		driver.quit();
	}

}
