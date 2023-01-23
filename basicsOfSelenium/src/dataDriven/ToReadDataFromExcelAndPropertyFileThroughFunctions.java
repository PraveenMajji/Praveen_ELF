package dataDriven;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericLibrary.ReadData;
/**
 * 
 * @author LENOVO 7XIN
 *
 */
public class ToReadDataFromExcelAndPropertyFileThroughFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ReadData.fromExcelSheet("String_sheet", 1, 4));
		System.out.println(ReadData.fromPropertyFiles("Name"));
		/*String key = ReadData.fromPropertyFiles("ChromeBrowserKey");
		String value = ReadData.fromPropertyFiles("ChromeDriverPath");
		String url = ReadData.fromPropertyFiles("url");
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);*/
		System.out.println(ReadData.fromExcelSheetBoolean("Boolean_sheet", 0, 0));
		System.out.println(ReadData.fromExcelSheetFileForDateTime("String_sheet", 2, 4));
		System.out.println(ReadData.fromExcelSheetFileForNumber("Number_sheet", 13, 13));
		

	}

}
