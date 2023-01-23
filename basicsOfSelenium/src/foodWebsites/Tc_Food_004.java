package foodWebsites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_Food_004 {
	@Test(groups = "regression",dependsOnGroups = "smoke")
	public void toOpenburgerKing() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.bk.com/");
		driver.quit();
	}
	@Test
	public void toPrintHi() {
		System.out.println("hi");
	}


}
