package com.seleniumExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;


public class tc007_JavaScriptExicuter {
		public static void main(String[] args) throws Exception {
			   System.setProperty("webdriver.chrome.driver", "D:\\selenium_drivers\\chromedriver\\chromedriver.exe");
		 WebDriver d = new ChromeDriver();
		 d.manage().window().maximize();
 //Testcase Steps
		      System.out.println("launch chrome browser");
		   d.navigate().to("https://opensource-demo.orangehrmlive.com/");
			  System.out.println("open url");
	          Thread.sleep(4000);
			  System.out.println(d.getTitle());
			d.findElement(By.name("txtUsername")).sendKeys("admin");
			d.findElement(By.name("txtPassword")).sendKeys("admin123");
//using JSE to click on login btn;
			WebElement loginbtn=d.findElement(By.name("Submit"));
			JavascriptExecutor jse=(JavascriptExecutor)d;
			jse.executeScript("arguments[0].click();", loginbtn);
			 Thread.sleep(9000);
			 System.out.println("login compleated");
			 
			 d.findElement(By.id("welcome")).click();
			 Thread.sleep(500);
//using JSE to click on logout btn;			 
			WebElement logoutbtn=d.findElement(By.linkText("Logout"));
			JavascriptExecutor jse1=(JavascriptExecutor)d;
			jse1.executeScript("arguments[0].click();",logoutbtn);
			    Thread.sleep(5000);
			 d.close();
			  }
		}
