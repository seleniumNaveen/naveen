package com.seleniumExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
public class tc010_POI {
    public static void main(String[] args) throws Exception {
   	 FileInputStream f=new FileInputStream("D:\\selenium_drivers\\WriteData.xlsx");
   	 XSSFWorkbook wb= new XSSFWorkbook(f);
	XSSFSheet sht= wb.getSheet("test");
	System.out.println(sht.getSheetName());
	System.out.println(sht.getLastRowNum());
	System.out.println("Before updating cell data "+sht.getRow(2).getCell(1));
//write the data to excel file
	XSSFCell cell=sht.getRow(2).getCell(1);
	cell.setCellValue("N");
	f.close();
	FileOutputStream fo=new FileOutputStream("D:\\selenium_drivers\\WriteData.xlsx");
	wb.write(fo);
   	 System.out.println("Updated data after write is done  "+cell.getStringCellValue());
   	 fo.close();
	}
}
