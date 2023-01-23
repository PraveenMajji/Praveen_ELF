package KeyboardAndMouseStimulation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			WebDriverWait explicitWait=new WebDriverWait(driver, 2);
			driver.get("https://trello.com/home");
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("user")).sendKeys("majjipraveen1@gmail.com",Keys.ENTER);
			explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
			driver.findElement(By.id("password")).sendKeys("Praveen@121021",Keys.ENTER);
			driver.findElement(By.xpath("//div[text()='Assignment']")).click();
			WebElement selenium = driver.findElement(By.xpath("//span[text()='Mock pending']"));
			WebElement java = driver.findElement(By.xpath("//span[text()='Mock Scheduled']"));
			Actions action =new Actions(driver);
			action.dragAndDropBy(selenium, 272, 40).perform();
			action.dragAndDropBy(java, 300, 48).perform();

		}


}
