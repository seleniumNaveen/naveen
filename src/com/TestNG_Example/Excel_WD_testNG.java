package com.TestNG_Example;import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import java.io.FileInputStream;

import org.openqa.selenium.By;

public class Excel_WD_testNG { 
	WebDriver d;
	@BeforeClass
	public void startup() {
		System.setProperty("webdriver.chrome.driver","D:\\selenium_drivers\\chromedriver\\chromedriver.exe");
	d=new ChromeDriver();
		  Reporter.log("chrome  open");		
   }
	@AfterClass
	public void teardown() {
		d.close();
		 Reporter.log("app close");
	 }
	 @Test	
	 public void tc001() throws Exception {
		//Excel    //Reading un and pw from excel assining to variables
		FileInputStream f = new FileInputStream("D:\\selenium_drivers\\ReadExcel_jxl.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet st=wb.getSheet(3);
		String un=st.getCell(1, 0 ).getContents();
		String pw=st.getCell(2, 0).getContents();
		Reporter.log(un);
		Reporter.log(pw);
		Thread.sleep(4000);
		
		d.navigate().to("https://opensource-demo.orangehrmlive.com/");
        Reporter.log("open url");
		d.findElement(By.name("txtUsername")).sendKeys(un);
		d.findElement(By.name("txtPassword")).sendKeys(pw);
		d.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		Reporter.log("log in compleate");
		Reporter.log(d.getTitle());
		d.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		d.findElement(By.linkText("Logout")).click();
		Reporter.log("logout completed");
	}
}



