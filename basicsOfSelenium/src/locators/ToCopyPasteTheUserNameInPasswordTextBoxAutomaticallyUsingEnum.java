package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCopyPasteTheUserNameInPasswordTextBoxAutomaticallyUsingEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin",Keys.CONTROL+"A");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(Keys.CONTROL+"p");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(Keys.ENTER);

	}

}
