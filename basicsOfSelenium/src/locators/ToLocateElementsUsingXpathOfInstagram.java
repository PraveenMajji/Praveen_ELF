package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementsUsingXpathOfInstagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("majjipraveen1@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Praveen@21");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}

}