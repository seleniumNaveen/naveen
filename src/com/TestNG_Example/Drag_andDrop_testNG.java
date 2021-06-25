package com.TestNG_Example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test; 

import org.openqa.selenium.interactions.Actions; 
import static org.testng.Assert.assertEquals;

public class Drag_andDrop_testNG {
	WebDriver d;
	@BeforeMethod
	public void login()  {   
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_drivers\\chromedriver\\chromedriver.exe");  
		 d=new ChromeDriver(); 
		d.manage().window().maximize();  //To maximize the browser
	   }
	  @Test	
	  public void Drag_n_Drop() throws Exception {
		d.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(4000L); 
		/*Verifying title using assert statement. The common functionality of assert statement is ,in case of condition is true
		 *  then it will continue the execution , in case of condition is failed then it will stop the execution*/ 
		       //  Exp.Title                //ActualTitile 
		assertEquals("Droppable | jQuery UI",d.getTitle());
 //To Enter in to Frame
		d.switchTo().frame(0); 
		Actions a=new Actions(d); 
		a.dragAndDrop(d.findElement(By.id("draggable")),          
				d.findElement(By.id("droppable"))).perform();
		Thread.sleep(4000);
		Reporter.log("drag and drop");
		d.switchTo().defaultContent();
		Thread.sleep(5000);
	  }
		@AfterMethod
		public void close() {
		d.close();
	  }
  }








































