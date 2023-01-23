package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToAnApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ferrari.com/en-IN");
		driver.get("https://tourism.ap.gov.in/home");
	}
}
