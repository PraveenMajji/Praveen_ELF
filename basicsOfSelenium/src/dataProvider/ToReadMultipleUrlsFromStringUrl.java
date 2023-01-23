package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToReadMultipleUrlsFromStringUrl {
	@DataProvider(parallel = true)
	public String[] data() {
		String[]s= {
				"https://www.swiggy.com/\r\n",
				"https://www.zomato.com/\r\n",
				"https://online.kfc.co.in/\r\n",
				"https://www.pvrcinemas.com/\r\n",
				"https://www.dominos.co.in/\r\n"
				};
		return s;
	}
	@Test(dataProvider = "data")
	public void launchUrl(String url) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);
		driver.quit();
	}

}
