package org.tcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main(String[] args) throws IOException {
		
	//File Location	
	File f=new File ("C:\\Users\\LIBIN\\eclipse-workspace1\\EtsyCom\\src\\test\\resources\\TestDatas\\TestData.xlsx");
	
	//Read the value from excel
	FileInputStream fin=new FileInputStream(f);
	
	//Type of workbook
	Workbook w= new XSSFWorkbook(fin);
	
	// Get the sheet
	Sheet s= w.getSheet("greens");
	
    for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
    	
    	Row row=s.getRow(i);
    	
    for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		
    	Cell cell=row.getCell(j);
    	System.out.println(cell);
	} 	
    	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
