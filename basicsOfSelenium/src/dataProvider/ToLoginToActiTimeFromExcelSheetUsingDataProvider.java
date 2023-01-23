package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLoginToActiTimeFromExcelSheetUsingDataProvider {
	
	@DataProvider
	public String[][] loginCredentials() throws Exception{
		FileInputStream fis=new FileInputStream(new File("./testData/Test.XLSX"));
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet infoSheet = workbook.getSheet("ActiTimeTestData");
		int rowCount = infoSheet.getPhysicalNumberOfRows()-1;
		int cellCount = infoSheet.getRow(0).getPhysicalNumberOfCells();
		String[][]srr=new String[rowCount][cellCount];
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				srr[i][j]=infoSheet.getRow(i+1).getCell(j).toString();
			}
		}
		return srr;
	}
	@Test(dataProvider = "loginCredentials")
	public void actitime(String[] credentials) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicitWait=new WebDriverWait(driver, 5);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(credentials[0]);
		driver.findElement(By.name("pwd")).sendKeys(credentials[1]);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.name("pwd")));
		//driver.quit();
	}

}
