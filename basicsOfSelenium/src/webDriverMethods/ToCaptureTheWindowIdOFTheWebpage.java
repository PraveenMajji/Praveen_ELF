package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTheWindowIdOFTheWebpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://online.kfc.co.in/");
		//Thread.sleep(2000);
		String windowId=driver.getWindowHandle();
		System.out.println(windowId);
	}
}
