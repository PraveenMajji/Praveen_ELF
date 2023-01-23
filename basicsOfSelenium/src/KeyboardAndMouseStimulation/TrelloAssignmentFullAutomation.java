package KeyboardAndMouseStimulation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloAssignmentFullAutomation {
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
		//Automating 
		driver.findElement(By.xpath("//span[text()='Create new board']")).click();
		driver.findElement(By.xpath("//input[contains(@class,'nch-textfield__inpu')]")).sendKeys("TrelloAssignment",Keys.ENTER);
		driver.findElement(By.name("name")).sendKeys("ManualTesting",Keys.ENTER);
		driver.findElement(By.name("name")).sendKeys("Java",Keys.ENTER);
		driver.findElement(By.name("name")).sendKeys("Selenium",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Add a card']")).click();
	//	Actions action =new Actions(driver);
	//	action.moveByOffset(310, 144).perform();
		driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']")).sendKeys("Mock Completed",Keys.ENTER);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']")).sendKeys("Mock Scheduled",Keys.ENTER);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']")).sendKeys("Mock pending",Keys.ENTER);
		//driver.findElement(By.xpath("//div[text()='Assignment']")).click();
	/*	WebElement selenium = driver.findElement(By.xpath("//span[text()='Mock pending']"));
		WebElement java = driver.findElement(By.xpath("//span[text()='Mock Scheduled']"));
		
		action.dragAndDropBy(selenium, 272, 40).perform();
		action.dragAndDropBy(java, 300, 48).perform();*/

	}


}
