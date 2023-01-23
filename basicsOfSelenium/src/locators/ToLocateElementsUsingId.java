package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateElementsUsingId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("majjipraveen1@gmail.com");
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("Praveen@1");
		//WebElement forgotPassword = driver.findElement(By.partialLinkText("password?"));
		//WebElement forgotPassword = driver.findElement(By.partialLinkText("Forgot"));
		WebElement forgotPassword = driver.findElement(By.partialLinkText("d?"));
		forgotPassword.click();
	}

}
