package ToScrollWebpageUsingJsExecutor;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalScrool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.album.alexflueras.ro/");
		//WebElement elementToBeSelected=driver.findElement(By.id("back"));
	//	js.executeScript("arguments[0].scrollIntoView(true)", elementToBeSelected);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//1.way
		//int element=2032;
		//js.executeScript("window.scrollTo(arguments[0],0)").element;
	//	2.Another way
		//js.executeScript("window.scrollTo(2032,212)");//Using switchto method
	
		for(;;) {//switchBy method
			try {
				driver.findElement(By.id("back"));
				break;
			}
			catch(NoSuchElementException e) {
				js.executeScript("window.scrollBy(14501,200)");
			}
		}
	}
}
