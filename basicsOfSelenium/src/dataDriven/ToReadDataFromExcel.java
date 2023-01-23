package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Step:1 Creating file input stream type object
		File abspath= new File("./testData/test.XLSX");
		FileInputStream fis=new FileInputStream(abspath);
		Workbook workbook = new XSSFWorkbook(fis);
	/*	 boolean check = workbook.getSheet("Boolean_sheet").getRow(0).getCell(0).getBooleanCellValue();
		String name = workbook.getSheet("String_sheet").getRow(1).getCell(4).getStringCellValue();
		 double number = workbook.getSheet("Number_sheet").getRow(13).getCell(13).getNumericCellValue();
		System.out.println(name);
		System.out.println(number);
		System.out.println(check);*/

		String key = workbook.getSheet("Boolean_sheet").getRow(1).getCell(0).getStringCellValue();
		 String value = workbook.getSheet("Boolean_sheet").getRow(2).getCell(0).getStringCellValue();
		String url = workbook.getSheet("Boolean_sheet").getRow(3).getCell(0).getStringCellValue();
		 System.setProperty(key, value);
		 WebDriver driver=new ChromeDriver();
		 driver.get(url);

	}

}
