package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLoginToActiTimeUsingDataProvider {
	@DataProvider
	public String[][]loginCredentails() throws IOException{
		String[][]arr= {
				{"admin","manager"},
				{"trainee","trainee"}
		};
		
		return arr;
	}
	@Test(dataProvider ="loginCredentails")
	public void loginToActiTime(String[] credentials) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(credentials[0]);
		driver.findElement(By.name("pwd")).sendKeys(credentials[1]);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
