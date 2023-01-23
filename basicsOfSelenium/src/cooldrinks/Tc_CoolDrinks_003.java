package cooldrinks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tc_CoolDrinks_003 {
	@Parameters("browserName")
	@Test
	public void toOpenMountainDue(@Optional String bName) {
		
		WebDriver driver=null;
		if(bName.equalsIgnoreCase("Chrome")) {
			//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(bName.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.mountaindew.com//");
		driver.quit();
	}

}
