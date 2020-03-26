package com.excelutillity;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata {
	

	public  String excel_username(int i) throws IOException {
		  
		  FileInputStream fil = new FileInputStream(new File("E:\\SVSSNR\\SVSSNRPROJECT\\844834_Project\\src\\test\\resources\\Testdata\\Data.xlsx"));
		  
		  XSSFWorkbook workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=workbook.getSheet("Signupdata");
		  
		    
			  XSSFRow row =sheet.getRow(i);
			  XSSFCell cell=row.getCell(0);
			  String userna=cell.getStringCellValue();
			        
		return userna;
}
	
	
	public  String excel_password(int i) throws IOException {
		  
		  FileInputStream fil = new FileInputStream(new File("E:\\SVSSNR\\SVSSNRPROJECT\\844834_Project\\src\\test\\resources\\Testdata\\Data.xlsx"));
		  
		  XSSFWorkbook workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=workbook.getSheet("Signupdata");
		  
		  
			  XSSFRow row =sheet.getRow(i);
			  XSSFCell cell1=row.getCell(1);
			  String pwd=cell1.getStringCellValue();
    
		return pwd;
}
	
}


