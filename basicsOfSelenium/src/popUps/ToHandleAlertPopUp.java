package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.firelawn.com/");
		driver.findElement(By.id("fl_login_btn")).click();
		driver.findElement(By.id("fl_email")).sendKeys("abcd@testyantra.com",Keys.TAB);
		driver.findElement(By.id("fl_password")).sendKeys("nopassword",Keys.ENTER);
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[@aria-label='Account settings']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Edit Profile')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys(Keys.CONTROL+"a");
		//driver.findElement(By.id("lastName")).sendKeys(Keys.DELETE);
		//Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys("Maggy");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Thread.sleep(1000);
		Alert alertObjRef = driver.switchTo().alert();
		System.out.println(alertObjRef.getText());
		Thread.sleep(1000);
		alertObjRef.accept();
		

	}

}
