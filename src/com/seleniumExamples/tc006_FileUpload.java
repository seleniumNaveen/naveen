package com.seleniumExamples; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;


public class tc006_FileUpload {
public static void main(String args[]) throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\selenium_drivers\\chromedriver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.navigate().to("https://opensource-demo.orangehrmlive.com/");
	 System.out.println(d.getTitle());
	 System.out.println("opened url");
		d.findElement(By.name("txtUsername")).sendKeys("admin");
		d.findElement(By.name("txtPassword")).sendKeys("admin123");
		d.findElement(By.name("Submit")).click();
		System.out.println("login to orangHRM");
		  Thread.sleep(3000);
			d.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
 //MouseOver 
		  d.manage().window().maximize(); 
		Actions ac = new Actions(d);
		ac.moveToElement(d.findElement(By.linkText("PIM"))).perform();  
           System.out.println(" click pim ");
           Thread.sleep(3000);
        d.findElement(By.linkText("Add Employee")).click();
        d.findElement(By.name("firstName")).sendKeys("selenium");
		d.findElement(By.name("lastName")).sendKeys("naveen");
//FileUpload uploade images & files		
	 WebElement fileInput=d.findElement(By.name("photofile"));
		fileInput.sendKeys("D:\\snipping tool.PNG");
		Thread.sleep(4000);
		d.findElement(By.xpath("//input[@value='Save'][@type='button']")).click();
		Thread.sleep(4000);
		d.findElement(By.id("btnSave")).click();
		
		d.findElement(By.id("personal_DOB")).click();
//dropDown using DateofBirth.
		Select st=new Select(d.findElement(By.className("ui-datepicker-month")));
		st.selectByVisibleText("Nov");
		  Thread.sleep(4000);
		Select s=new Select(d.findElement(By.className("ui-datepicker-year")));
		s.selectByValue("1996");
		  Thread.sleep(4000);
		 d.findElement(By.linkText("7")).click(); 
		d.findElement(By.id("btnSave")).click();
//logout		
		d.findElement(By.id("welcome")).click();
		  Thread.sleep(500);
		d.findElement(By.linkText("Logout")).click();
		  System.out.println("logout orangHRM");
		  Thread.sleep(1000);
		d.close();
		  System.out.println("close applicatiom");

}
}
