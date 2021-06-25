package com.seleniumExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.concurrent.TimeUnit;

public class tc005_waitStatements {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","D:\\selenium_drivers\\chromedriver\\chromedriver.exe");
					WebDriver d = new ChromeDriver();
					d.manage().window().maximize();
						d.navigate().to("https://opensource-demo.orangehrmlive.com/");
						System.out.println(d.getTitle());
						d.findElement(By.name("txtUsername")).sendKeys("admin");
						d.findElement(By.name("txtPassword")).sendKeys("admin123");
//ExipliteWait;- wait until login btn need to be loaded cund:
	  WebDriverWait wait =new WebDriverWait(d,5000);
		wait.until(ExpectedConditions
				.elementToBeClickable(d.findElement(By.name("Submit"))));
		    System.out.println("exiplict compleated");
         d.findElement(By.name("Submit")).click();
 //impliciteWait;- page need to be loaded
		d.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		  System.out.println("log in compleated");
		d.findElement(By.id("welcome")).click() ;
		Thread.sleep(500);
		d.findElement(By.linkText("Logout")).click();
		System.out.println("logout compleate");
		d.close();
		
		
	}

}




