package assignment;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToZomatoAndSwiggy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		driver.get("https://www.swiggy.com/");
		Navigation navigate = driver.navigate();
		navigate.back();
		navigate.forward();
		navigate.refresh();
		navigate.to("https://www.zomato.com/");

	}

}
