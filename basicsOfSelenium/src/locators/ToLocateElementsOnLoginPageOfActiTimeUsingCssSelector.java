package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementsOnLoginPageOfActiTimeUsingCssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id=\'username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name=\'pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("a[id=\'loginButton']")).click();

	}
}
