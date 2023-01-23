//Write a script to check whether the Zomato logo is displayed or not ?
package personalAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckLogoIsDisplayedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://online.kfc.co.in/");
		boolean logo = driver.findElement(By.xpath("(//img[@alt='KFC LOGO'])[1]")).isDisplayed();
		if(logo==true) {
			System.out.println("Logo is displayed");
		}
		else {
			System.out.println("Logo is not displayed");
		}
		driver.close();
		

	}

}
