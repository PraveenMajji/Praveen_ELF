package KeyboardAndMouseStimulation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveCursorUsingMoveToElementMethodWithOffSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.reliancedigital.in/");
		driver.findElement(By.xpath("//button[text()='No, don’t.']")).click();
		WebElement homeAppliancesWebNavBar = driver.findElement(By.xpath("//div[text()='Home Appliances']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(homeAppliancesWebNavBar).perform();
		actions.moveToElement(homeAppliancesWebNavBar, 167, 0).perform();

	}

}
