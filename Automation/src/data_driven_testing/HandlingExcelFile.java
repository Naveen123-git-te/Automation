package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//We are converting high level data into low level data
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
//create(input fis) will create Workbook interface type object and also load the low 
//level data into the workbook
		Workbook wb = WorkbookFactory.create(fis);
//Using wb reference we use getSheet(String sheetName) to get the particular sheet. 
//Using Sheet reference we call getRow(int index) to get the particular row.
//Using Row reference we call getCell(int index) to get the particular cell.
//Using Cell reference we call getStringCellValue() to get the String data.
	String value = wb.getSheet("createCustomer").getRow(1).getCell(0).getStringCellValue();
		System.out.println(value);
	}
} 
