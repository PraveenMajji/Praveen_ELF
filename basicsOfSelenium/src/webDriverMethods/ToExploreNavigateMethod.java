package webDriverMethods;

import javax.swing.text.NavigationFilter;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreNavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coursera.org/");
		Thread.sleep(2000);
		driver.get("https://udemy.com/");
		Thread.sleep(2000);
		Navigation navigate=driver.navigate();
		navigate.back();
		Thread.sleep(1000);
		navigate.forward();
		Thread.sleep(1000);
		navigate.refresh();
		navigate.to("https://www.coursera.org/");
	//	driver.get("https://www.coursera.org/");

	}
}
