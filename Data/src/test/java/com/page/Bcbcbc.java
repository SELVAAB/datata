package com.page;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Bcbcbc {
	
	
	public static void main(String[] args) throws IOException {
		
	File file =new File("./testcase/testdata.xlsx");
	FileInputStream input=new FileInputStream(file);
	XSSFWorkbook wb=new XSSFWorkbook(input);
	XSSFSheet sheet=wb.getSheetAt(0);
	for (int i= 0; i <=158; i++) {
		XSSFRow row = sheet.getRow(i);

		for(int j=0;j<=10;j++) {
			XSSFCell cell = row.getCell(j);
			String value = cell.getStringCellValue();
			System.out.println(value);
		}
	} 
	

}

	
	
	
	
	

}
