package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToReadMultipleUrlFromExcelSheet {
	
	@DataProvider(parallel = true)
	public String[] data() throws IOException {
		FileInputStream fis=new FileInputStream(new File("./testData/Test.XLSX"));
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet infoSheet = workbook.getSheet("UrlDataProvider");
		int rowCount = infoSheet.getPhysicalNumberOfRows()-1;
		//int cellCount = infoSheet.getRow(0).getPhysicalNumberOfCells();
		String[]srr=new String[rowCount];
		for(int i=0;i<rowCount;i++) {
				srr[i]=infoSheet.getRow(i+1).getCell(0).toString();
		}
		return srr;
	}
	@Test(dataProvider = "data")
	public void LaunchWEbPage(String url) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);
		
	}
}
