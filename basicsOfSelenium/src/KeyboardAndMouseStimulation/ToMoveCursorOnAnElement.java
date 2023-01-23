package KeyboardAndMouseStimulation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveCursorOnAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		WebElement diningWebElement = driver.findElement(By.linkText("Dining"));
		Actions actions=new Actions(driver);
		
		
		//moveToElement Method
		//actions.moveToElement(diningWebElement).perform();
		
		
		//moveByOffSet Method
		actions.moveByOffset(404, 162).perform();
		
		
		
		
	}

}
