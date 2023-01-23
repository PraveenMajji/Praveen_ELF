package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWithBooleanMethodsInWebElementsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement display = driver.findElement(By.xpath("//div[@class='atProductName']"));
		//System.out.println(display.isDisplayed());
		display=driver.findElement(By.name("username"));
		System.out.println(display.isSelected());
	}

}
