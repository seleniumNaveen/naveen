package com.TestNG_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WD_TestNG { 
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
	public void tc001() throws Exception {
		d.navigate().to("https://opensource-demo.orangehrmlive.com/");
        Reporter.log("open url");
		d.findElement(By.name("txtUsername")).sendKeys("admin");
		d.findElement(By.name("txtPassword")).sendKeys("admin123");
		d.findElement(By.name("Submit")).click();
		Reporter.log("log in compleate");
		Reporter.log(d.getTitle());
	}
    @Test(priority=2)
	public void logout() throws Exception {
		d.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		d.findElement(By.linkText("Logout")).click();
		Reporter.log("logout completed");
		}
}

