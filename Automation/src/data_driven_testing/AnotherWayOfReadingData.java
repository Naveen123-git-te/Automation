package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AnotherWayOfReadingData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
//Whenever we need to use the same reference for multiple time we store them in reference variables
	Sheet createCustSheet = wb.getSheet("CreateCustomer");
	Row firstRow = createCustSheet.getRow(1);
	Cell cell = firstRow.getCell(1);
	String data = cell.getStringCellValue();
	System.out.println(data);
}
}
