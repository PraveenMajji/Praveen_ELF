package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolocateElementsOnRegisterPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement registerButton = driver.findElement(By.linkText("Register"));
		registerButton.click();
		WebElement gender = driver.findElement(By.id("gender-male"));
		gender.click();
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Majji");
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("Praveen");
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("majjipraveen1@gmail.com");
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("Praveen@1");
		WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
		confirmPassword.sendKeys("Praveen@1");
		WebElement register = driver.findElement(By.id("register-button"));
		register.click();
	
		

	}

}
