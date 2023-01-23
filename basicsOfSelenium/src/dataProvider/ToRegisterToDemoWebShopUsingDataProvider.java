package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToRegisterToDemoWebShopUsingDataProvider {
	@DataProvider
	public String[][] registerData() throws Exception{
		FileInputStream fis=new FileInputStream(new File("./testData/Test.XLSX"));
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet infoSheet = workbook.getSheet("DemoWebShop");
		int rowCount = infoSheet.getPhysicalNumberOfRows()-1;
		int cellCount = infoSheet.getRow(0).getPhysicalNumberOfCells();
		String[][]arr=new String[rowCount][cellCount];
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				arr[i][j]=infoSheet.getRow(i+1).getCell(j).toString();
				
			}
		}
		return arr;
	}
	@Test(dataProvider = "registerData")
	public void registration(String[] data) {
		
		
		//System.out.println(data[0]+" "+data[1]);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-"+data[0]+"")).click();
		driver.findElement(By.id("FirstName")).sendKeys(data[1]);
		driver.findElement(By.id("LastName")).sendKeys(data[2]);
		driver.findElement(By.id("Email")).sendKeys(data[3]);
		driver.findElement(By.id("Password")).sendKeys(data[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(data[5]);
		driver.findElement(By.id("register-button")).click();
		driver.quit();
		
	}

}
