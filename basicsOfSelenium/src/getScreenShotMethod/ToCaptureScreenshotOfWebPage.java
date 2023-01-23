package getScreenShotMethod;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureScreenshotOfWebPage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tempScreenshot = ts.getScreenshotAs(OutputType.FILE);
		File targetScreenshot = new File("./Screenshots/snap.png");
		//Using commons io jars
		//FileUtils.copyFile(tempScreenshot, targetScreenshot);
		// Using Inbuit methods
		FileHandler.copy(tempScreenshot, targetScreenshot);
		

	}

}
