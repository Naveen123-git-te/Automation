package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/** It is a generic class which contains generic methods to read data from property file, excel file 
 * and write data into excel file
 * @author Qspiders 
 */
public class FileLib {
/**
 * It is a generic method to read data from property file
 * @param keyName
 * @return the value associated with the mentioned keyName
 * @throws IOException
 */
public String readPropertyData(String keyName) throws IOException {
	FileInputStream fis=new FileInputStream("./data/commondata.properties");
	Properties p=new Properties();
	p.load(fis);
	String data = p.getProperty(keyName);
	return data;}
/**It is a generic method to read data from excel file
 * @param sheetName @param row @param cell
 * @return It will return the String value present in mentioned sheet, row and cell
 * @throws EncryptedDocumentException @throws IOException */
public String readExcelData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	return data;
}/**It is a generic method to write data into mentioned sheetName, row index, cell index and value
 * @param sheetName @param row  @param cell @param value
 * @throws EncryptedDocumentException @throws IOException*/
public void writeExcelData(String sheetName,int row,int cell,String value) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(value);
	FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
	wb.write(fos);
	wb.close();
}
}
