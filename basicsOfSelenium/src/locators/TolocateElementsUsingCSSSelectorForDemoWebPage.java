package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolocateElementsUsingCSSSelectorForDemoWebPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement register = driver.findElement(By.cssSelector("a[href='/register']"));
		register.click();
		driver.findElement(By.cssSelector("input[id=\'gender-male']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id=\'FirstName\']")).sendKeys("Error");
		driver.findElement(By.cssSelector("input[id=\'LastName']")).sendKeys("CssSelector");
		driver.findElement(By.cssSelector("input[id=\'Email']")).sendKeys("majjipraveen21@gmai.com");
		driver.findElement(By.cssSelector("input[id=\'Password']")).sendKeys("Error@123");
		driver.findElement(By.cssSelector("input[id=\'ConfirmPassword']")).sendKeys("Error@123");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id=\'register-button']")).click();
	}
}
