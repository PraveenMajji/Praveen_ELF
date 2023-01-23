package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseAutomationOfBookMyBookWebPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Step 1:open the BookMyBook browser
		driver.get("https://www.bookmybook.co.in/");
		Thread.sleep(1000);
		//Step:2 Click on Login Button
		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("7330817465");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Praveen@1",Keys.ENTER);
		Thread.sleep(2000);
		

	}

}
