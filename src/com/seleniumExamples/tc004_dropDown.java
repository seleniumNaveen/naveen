package com.seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class tc004_dropDown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_drivers\\chromedriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println(d.getTitle());
		d.findElement(By.name("txtUsername")).sendKeys("admin");
		d.findElement(By.name("txtPassword")).sendKeys("admin123");
		d.findElement(By.name("Submit")).click();
		System.out.println("login compleate");
		Thread.sleep(2000);
// MouseOver Actions
		Actions ac = new Actions(d);
		ac.moveToElement(d.findElement(By.linkText("PIM"))).perform();
		  System.out.println(" click pim ");
		  Thread.sleep(3000);
		d.findElement(By.linkText("Employee List")).click();
		 System.out.println(" click employee list ");
// DropDown
		Select st = new Select(d.findElement(By.name("empsearch[employee_status]")));
		  Thread.sleep(3000);
		st.selectByVisibleText("Full-Time Permanent");
		  Thread.sleep(3000);
		d.findElement(By.name("empsearch[id]")).sendKeys("0091");
		  Thread.sleep(3000);
		d.findElement(By.id("searchBtn")).click();
		  Thread.sleep(3000);
		d.findElement(By.name("chkSelectRow[]")).click();
		  Thread.sleep(3000);
		d.findElement(By.name("btnDelete")).click();
		  Thread.sleep(3000);
		d.findElement(By.id("dialogDeleteBtn")).click();
		  Thread.sleep(3000);
		  System.out.println("employee deleted");
		d.findElement(By.id("welcome")).click();
		  Thread.sleep(500);
		d.findElement(By.linkText("Logout")).click();
		  System.out.println("logout orangHRM");
		  Thread.sleep(1000);
		d.close();
		  System.out.println("close applicatiom");

	}

}
