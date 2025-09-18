package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
//getLastRowNum() is used to get the index of last row containing data in the sheet
	int row = wb.getSheet("MultipleData").getLastRowNum();
for(int i=0;i<=row;i++) {//If we have multiple data in vertical
	String data = wb.getSheet("MultipleData").getRow(i).getCell(0).getStringCellValue();
	System.out.println(data);
}//getLastCellNum() is used to get the count of last cell containing data in the row
	short cell = wb.getSheet("MultipleData").getRow(0).getLastCellNum();
	for(int j=0;j<cell;j++) {//If we have multiple data in horizontal
	String data = wb.getSheet("MultipleData").getRow(0).getCell(j).getStringCellValue();
	System.out.println(data);	}
	int lastRow = wb.getSheet("MultipleData").getLastRowNum();
	for(int i=0;i<=lastRow;i++) {//This will iterate for number of rows
		short lastCell = wb.getSheet("MultipleData").getRow(i).getLastCellNum();
		for(int j=0;j<lastCell;j++) {//This will iterate for number of cells
String data = wb.getSheet("MultipleData").getRow(i).getCell(j).getStringCellValue();
	System.out.print(data+" ");
		}		System.out.println();
	}
}
}
