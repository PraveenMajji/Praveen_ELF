package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadMultipleEmployeeDataFromExcelSheet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(new File("./testData/Test.XLSX"));
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet infoSheet = workbook.getSheet("EmployeeInfo");
		int rowCount = infoSheet.getPhysicalNumberOfRows();
		int cellCount = infoSheet.getRow(0).getPhysicalNumberOfCells();
		String sarr[][]=new String[rowCount][cellCount];
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				sarr[i][j]=infoSheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		for(String arr[]:sarr) {
			for(String data:arr) {
				System.out.print(data+" ");
			}
			System.out.println();
		}
		

	}

}
