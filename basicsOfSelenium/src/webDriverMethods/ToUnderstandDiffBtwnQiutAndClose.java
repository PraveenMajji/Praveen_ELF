package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandDiffBtwnQiutAndClose {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO%207XIN/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']" )).click();
		Thread.sleep(2000);
		Set<String>allWindowIds=driver.getWindowHandles();
		System.out.println("Size of set:"+allWindowIds.size());
		for(String windowId:allWindowIds) {
			System.out.println(windowId);
		}
		driver.quit();

	}
}
