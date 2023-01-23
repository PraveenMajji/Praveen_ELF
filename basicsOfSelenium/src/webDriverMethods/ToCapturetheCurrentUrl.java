package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCapturetheCurrentUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO%207XIN/Downloads/MultipleWindow.html");
		String storeCurrentUrl=driver.getCurrentUrl();
		System.out.println(storeCurrentUrl);
	//	to close the page
		//driver.close();		
	}
}
