package popUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePopUpUsingRobotClass {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.easemytrip.com/");
	//	Robot robot=new Robot();
	//	robot.keyPress(KeyEvent.VK_TAB);
	//	robot.keyPress(KeyEvent.VK_TAB);
		//robot.keyPress(KeyEvent.VK_TAB);
	//	robot.keyPress(KeyEvent.VK_ENTER);
	//	robot.keyRelease(KeyEvent.VK_TAB);
	//	robot.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
