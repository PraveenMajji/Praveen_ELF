package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTitleOfWebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://tourism.ap.gov.in/home");
		String titleOfThePage=driver.getTitle();
		System.out.println(titleOfThePage);
		//String windowId=driver.getWindowHandle();
		//System.out.println(windowId);
		

	}
}
