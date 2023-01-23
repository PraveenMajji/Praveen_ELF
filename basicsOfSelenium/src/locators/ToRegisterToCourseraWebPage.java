package locators;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToRegisterToCourseraWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.coursera.org/");
		driver.findElement(By.linkText("Join for Free")).click();
		driver.findElement(By.id("name")).sendKeys("Praveen Kumar");
		driver.findElement(By.id("email")).sendKeys("majjipraveen21@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Praveen@1");
	}
}
