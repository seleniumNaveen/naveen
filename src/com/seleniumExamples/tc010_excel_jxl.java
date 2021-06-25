package com.seleniumExamples;
 
import java.io.FileInputStream;
import jxl.Workbook;
import jxl.Sheet;

public class tc010_excel_jxl {
     public static void main(String[] args) throws Exception {
    	 FileInputStream f=new FileInputStream("D:\\selenium_drivers\\ReadExcel_jxl.xls");
    	 Workbook wb= Workbook.getWorkbook(f);
    	 Sheet sht= wb.getSheet(0);
    	 int row=sht.getRows();
    	    System.out.println(row);
    	for(int i=1;i<row;i++) {
    	 String A=sht.getCell(1,i ).getContents();
    	 String B=sht.getCell(2, i).getContents();
    	 String C=sht.getCell(3, i).getContents();
    System.out.println(A);   
    System.out.println(B);
    System.out.println(C);
    }
   	 String D=sht.getCell(3, 3).getContents();
     System.out.println(D);	 
	}
}
