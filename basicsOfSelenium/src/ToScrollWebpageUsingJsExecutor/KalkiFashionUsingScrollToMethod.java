package ToScrollWebpageUsingJsExecutor;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KalkiFashionUsingScrollToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.kalkifashion.com/");
		
		
		WebElement elementToBeScrolled=driver.findElement(By.xpath("//h2[text()='Saree Picks']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
	//	js.executeScript("window.scrollTo(723,4004);");//Not preferred in real time
		js.executeScript("arguments[0].scrollIntoView(false)",elementToBeScrolled );
		
				
			
		

	}

}
