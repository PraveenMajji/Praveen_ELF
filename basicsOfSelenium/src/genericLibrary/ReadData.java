package genericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	/***
	 *used to get the value assigned to the key-value pair
	 * This method will return in the form of string
	 * @param key
	 * @return
	 */
	public static  String fromPropertyFiles(String key) {
		FileInputStream fis=null;
		Properties properties=null;
		try {
			fis = new FileInputStream("./testData/configuration.properties");
			 properties=new Properties();
			 properties.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);	
	}
	/***
	 *  This method will return the String  value present in excel sheet
	 * @param sheet
	 * @param rowNo
	 * @param celNo
	 * @return
	 */
	public static String fromExcelSheet(String sheet,int rowNo,int celNo) {
		FileInputStream fis=null;
		Workbook workbook=null;
		try {
			fis=new FileInputStream("./testData/Test.XLSX");
			workbook=WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheet).getRow(rowNo).getCell(celNo).getStringCellValue();	
	}
	/***
	 * This method will return the boolean value present in excel sheet 
	 * @ sheet
	 * @param rowNo
	 * @param celNo
	 * @return
	 */
	public static boolean fromExcelSheetBoolean(String sheet,int rowNo,int celNo) {
		FileInputStream fis=null;
		Workbook workbook=null;
		try {
			fis= new FileInputStream("./testData/Test.XLSX");
			workbook=WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return workbook.getSheet(sheet).getRow(rowNo).getCell(celNo).getBooleanCellValue();
		}
	/***
	 * This method is used to get the local date and time
	 * @param sheet
	 * @param rowNo
	 * @param celNo
	 * @return
	 */
	public static LocalDateTime fromExcelSheetFileForDateTime(String sheet,int rowNo,int celNo) {
		FileInputStream fis=null;
		Workbook workbook=null;
		
			try {
				fis=new FileInputStream("./testData/Test.XLSX");
				workbook=WorkbookFactory.create(fis);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			
		return workbook.getSheet(sheet).getRow(rowNo).getCell(celNo).getLocalDateTimeCellValue();
	}
	/***
	 * This method is used to get the numerical values
	 * @param sheet
	 * @param rowNo
	 * @param celNo
	 * @return
	 */
	public static double fromExcelSheetFileForNumber(String sheet,int rowNo,int celNo) {
		FileInputStream fis=null;
		Workbook workbook=null;
		try {
			fis=new FileInputStream("./testData/Test.XLSX");
			try {
				workbook=WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return workbook.getSheet(sheet).getRow(rowNo).getCell(celNo).getNumericCellValue();
	}

}
