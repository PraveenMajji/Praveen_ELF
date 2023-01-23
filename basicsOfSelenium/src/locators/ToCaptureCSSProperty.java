package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureCSSProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement cssValue = driver.findElement(By.xpath("//strong[text()='Categories']"));
		System.out.println(cssValue.getCssValue("font-weight"));
		WebElement cssValue1 =driver.findElement(By.xpath("//input[@value='Register']"));
		System.out.println(cssValue1.getCssValue("box-shadow"));

	}

}
