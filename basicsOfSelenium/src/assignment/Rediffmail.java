package assignment;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rediffmail {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			WebDriverWait explicitWait=new WebDriverWait(driver, 10);
			driver.get("https://www.rediff.com/");
			driver.findElement(By.linkText("Sign in")).click();
			driver.findElement(By.id("login1")).sendKeys("sumanthElfBatch@rediffmail.com",Keys.TAB);
			driver.findElement(By.id("password")).sendKeys("Testing@123",Keys.ENTER);
			driver.findElement(By.xpath("//b[text()='Write mail']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[text()='To:']/..//input[@placeholder='Enter name or email']")).sendKeys("sumanthElfBatch@rediffmail.com",Keys.ENTER);
			driver.findElement(By.xpath("//li[contains(@class,'fld_sub')]//input[@type='text']")).sendKeys("Majji Praveen Kumar",Keys.TAB);
			driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
			WebElement frame = driver.findElement(By.xpath("//iframe[contains(@title, 'Rich Text Editor,')]"));
			driver.switchTo().frame(frame);
			driver.findElement(By.xpath("//body[contains(@class,'cke_editable')]")).sendKeys("Hi Sir Good Morning");
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//a[contains(@class,'send_ng_')]")).click();
			driver.findElement(By.linkText("Inbox")).click();
			try {
			driver.findElement(By.xpath("//span[text()='Majji Praveen Kumar']/..//cite[@title='Select mail']")).click();
			driver.findElement(By.xpath("//span[text()='Delete']")).click();
			driver.findElement(By.xpath("//button[text()='Ok']")).click();
			}
			catch(Exception e ) {
				driver.navigate().refresh();
				driver.findElement(By.xpath("//cite[@title='Refresh Inbox']")).click();
			}
			
			
			
			//driver.findElement(By.xpath("//span[text()='Delete']")).click();
			//driver.findElement(By.xpath("//button[text()='OK']")).click();
			driver.findElement(By.id("rdNotify"));
			explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.id("rdNotify")));
			TakesScreenshot ts=(TakesScreenshot)driver;
			File tempScreenshot = ts.getScreenshotAs(OutputType.FILE);
			File targetScreenshot = new File("./Screenshots/redif4.png");
			System.out.println("webpage screenshot is captured");
			FileHandler.copy(tempScreenshot, targetScreenshot);

	}
}
