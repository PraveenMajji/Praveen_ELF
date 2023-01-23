package framesConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToMapsInGoogleAppsUsingFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[1]")).click();
		driver.findElement(By.xpath("//iframe[@name='app']"));
		Thread.sleep(2000);
		driver.switchTo().frame("app");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Maps']")).click();

	}

}
