package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClearTheContectInTextAreas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php?module=Users&parent=Settings&view=Login&error=login");
		WebElement usernameTextbox = driver.findElement(By.xpath("//input[@id='username']"));
		Thread.sleep(1000);
		usernameTextbox.clear();
		usernameTextbox.sendKeys("Praveen");
		WebElement passwordtextbox = driver.findElement(By.xpath("//input[@name='password']"));
		Thread.sleep(1000);
		passwordtextbox.clear();
		passwordtextbox.sendKeys("Praveen@1");
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
	}

}
