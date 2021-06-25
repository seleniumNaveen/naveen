package com.seleniumExamples;
import java.io.FileInputStream;
import jxl.Workbook;
import jxl.Sheet;

public class tc010_jxl {
     public static void main(String[] args) throws Exception {
    	 FileInputStream f=new FileInputStream("D:\\selenium_drivers\\ReadExcel_jxl.xls");
    	 Workbook wb= Workbook.getWorkbook(f);
    	 Sheet st=wb.getSheet(1);
    	 int row =st.getRows();
    	 int col =st.getColumns();
    	  System.out.println(row);
    	  System.out.println(col);
    	  for(int n=0;n<row;n++) {
    	  
    		  for(int c=0; c<col;c++) {
    	  
    		  String a=st.getCell(c,3).getContents();
    		  System.out.println(a);
    		  }
    		  String first_row = st.getCell(0, n).getContents();
    		  System.out.println(first_row);
	}

}
}