package cooldrinks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Tc_CoolDrinks_001 {
	@Parameters("browserName")
	@Test(groups = "smoke")
	public void toOpenCocoCola(@Optional String bName) {
	//	System.out.println(a);
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=null;
		if(bName.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(bName.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.coca-colacompany.com/");
		driver.quit();
	}
}
