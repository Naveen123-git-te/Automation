package data_driven_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
//setCellValue(String value) will just modify the data present in the cell in low level
	wb.getSheet("createCustomer").getRow(1).getCell(1).setCellValue("ABC");
//In order to set the data to an empty cell create a cell using createCell(int index)
	wb.getSheet("createCustomer").getRow(1).createCell(3).setCellValue("Pass");
//In order to create a new sheet we use createSheet(String sheetName), to create a new row
//we use createRow(int index)
	wb.createSheet("Sheet2").createRow(0).createCell(0).setCellValue("RCB");
//In order to convert low level data into high level we create object of FileOutputStream
	FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
//To write the high level data into the actual excel file we use write(outPut fos)
	wb.write(fos);
	wb.close();
}
}
