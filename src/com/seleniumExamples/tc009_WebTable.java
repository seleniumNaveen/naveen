package com.seleniumExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class tc009_WebTable {
  public static void main(String[] args)  throws Exception{
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium_drivers\\chromedriver\\chromedriver.exe");
	  WebDriver d=new ChromeDriver();
	  d.navigate().to("file:///D:/selenium_drivers/WebTable.html");
	  Thread.sleep(4000);
//count details
  int row=d.findElements(By.xpath("//*[@id=\'idCourse\']/tbody/tr")).size();
  int col=d.findElements(By.xpath("//*[@id=\'idCourse\']/tbody/tr[1]/td")).size();
  int row_col=d.findElements(By.xpath("//*[@id=\'idCourse\']/tbody/tr/td")).size();
	System.out.println(row);
	System.out.println(col);
	System.out.println(row_col);
//Data - cell 
	String cell=d.findElement(By.xpath("//*[@id=\'idCourse\']/tbody/tr[1]/td[2]")).getText();
	System.out.println(cell);
//Data - Table
   //DT var vv	
 for(int i=1; i<=row; i++) {
		String data=d.findElement(By.xpath("//*[@id=\'idCourse\']/tbody/tr["+i+"]")).getText();
		Thread.sleep(3000);
		System.out.println(data);
	  }
    d.close();
	}
  }
