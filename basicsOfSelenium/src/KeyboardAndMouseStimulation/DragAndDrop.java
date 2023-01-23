package KeyboardAndMouseStimulation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicitWait=new WebDriverWait(driver, 1);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frameElement);
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement trash = driver.findElement(By.id("trash"));
		Actions action =new Actions(driver);
		action.dragAndDrop(image1, trash).perform();
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h5[text()='High Tatras 1']")));
		action.dragAndDrop(image2, trash).perform();
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h5[text()='High Tatras 2']")));
		action.dragAndDrop(image3, trash).perform();
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h5[text()='High Tatras 3']")));
		action.dragAndDrop(image4, trash).perform();
		WebElement gallery = driver.findElement(By.id("gallery"));
	//	explicitWait.until(ExpectedConditions.elementToBeSelected(image1));
		action.clickAndHold(image1).perform();
		action.moveByOffset(58, 57).perform();
		action.release(gallery).perform();
		action.clickAndHold(image2).perform();
		action.moveByOffset(167, 93).perform();
		action.release(gallery).perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("Accepted Elements")).click();
		WebElement frame = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[2]"));
		driver.switchTo().frame(frame);
		WebElement DragMe = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement dropIt = driver.findElement(By.id("droppable"));
		action.dragAndDrop(DragMe, dropIt).perform();
	System.out.println(dropIt.getText());
	

	}

}
