package com.TestNG_Example;
import java.io.File;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

 public class Screenshorts_testNG {
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
	@Test(priority=1) 
	
	public void login() throws Exception {
		try {
		d.navigate().to("https://opensource-demo.orangehrmlive.com/");
        Reporter.log("open url");
		d.findElement(By.name("txtUsername")).sendKeys("admin");
		d.findElement(By.name("txtPassword")).sendKeys("admin123");
		d.findElement(By.name("Submit")).click();
		Reporter.log("log in compleate");
		Reporter.log(d.getTitle());
		
		Actions ac =new Actions(d);
		ac.moveToElement(d.findElement(By.linkText("PIM"))).perform();
		d.findElement(By.linkText("Add Employee")).click();
		Reporter.log("clicked to sub menu");
		d.findElement(By.name("firstName")).sendKeys("Naveen");
		d.findElement(By.name("lastName")).sendKeys("Chava");
		d.findElement(By.name("employeeId")).sendKeys("07111996");
		d.findElement(By.id("btnSave")).click(); 
		Reporter.log("added employee details");
		Thread.sleep(2000);
		d.findElement(By.id("btnSave")).click();
		d.findElement(By.name("personal[optGender]")).click();
		d.findElement(By.id("btnSave")).click();
		}
		catch(Exception e) {
		File f1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(f1, new File("D:\\naveen.PNG"));
	     }
		d.quit();
	  }
	  @Test(priority=2)
		public void logout() throws Exception {
			d.findElement(By.id("welcome")).click();
			Thread.sleep(3000);
			d.findElement(By.linkText("Logout")).click();
			Reporter.log("logout completed");
			}
 }
	
  
 
   





