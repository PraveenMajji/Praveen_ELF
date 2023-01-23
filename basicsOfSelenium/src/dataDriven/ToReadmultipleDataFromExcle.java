package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadmultipleDataFromExcle {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(new File("./testData/Test.XLSX"));
		
		Workbook workbook=WorkbookFactory.create(fis);
		
		Sheet infoSheet = workbook.getSheet("StudentInfo");
		int rowCount = infoSheet.getPhysicalNumberOfRows();
		int cellCount = infoSheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] sarr=new String[rowCount][cellCount];
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				sarr[i][j]=infoSheet.getRow(i).getCell(j).toString();
			}
		}
		for(String[]arr:sarr) {
			for(String data:arr) {
				System.out.print(data+" ");
			}
			System.out.println();
		}

	}

}
