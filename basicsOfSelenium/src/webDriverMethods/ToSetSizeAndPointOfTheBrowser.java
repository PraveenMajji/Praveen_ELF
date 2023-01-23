package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetSizeAndPointOfTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/courses/free/");
		Thread.sleep(2000);
		Dimension sizeOfTheBrowser=new Dimension(800, 800);
		driver.manage().window().setSize(sizeOfTheBrowser);
		Thread.sleep(2000);
		Point positionOfTheBrowser=new Point(0, 0);
		driver.manage().window().setPosition(positionOfTheBrowser);
	}
}
