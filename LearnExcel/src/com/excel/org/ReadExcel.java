package com.excel.org;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("//Users//amar//Downloads//A-New-01007339.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);

		System.out.println(sheet1.getRow(0).getCell(0).getStringCellValue());
	
		wb.close();
}
}
