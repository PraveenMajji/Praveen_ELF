package KeyboardAndMouseStimulation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingContextTextMethonInTrelloWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicitWait=new WebDriverWait(driver, 10);
		driver.get("https://trello.com/home");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("user")).sendKeys("majjipraveen1@gmail.com",Keys.ENTER);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
		driver.findElement(By.id("password")).sendKeys("Praveen@121021",Keys.ENTER);
		driver.findElement(By.xpath("(//span[text()='Boards'])[1]")).click();
		driver.findElement(By.xpath("(//div[text()='Actions'])[1]")).click();
		WebElement manual = driver.findElement(By.xpath("//span[text()='manual']"));
		Actions action=new Actions(driver);
		action.contextClick(manual).perform();
		List<WebElement> contextMenu = driver.findElements(By.xpath("//a[contains(@class,'quick-card-editor')]"));
		for(WebElement menu:contextMenu) {
			System.out.println(menu.getText());
		}
		
	}

}
