package com.seleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.interactions.Actions;

public class tc002_LoginL_out_verify_mouseover {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_drivers\\chromedriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.navigate().to("https://opensource-demo.orangehrmlive.com/");
		// verify title
		// actual result compare expected result
		if (d.getTitle().equals("OrangeHR")) {
			System.out.println("title is matched");
		} else {
			System.out.println("title is not matched");
			System.out.println(d.getTitle());
		}
		System.out.println("opened url");
		d.findElement(By.name("txtUsername")).sendKeys("admin");
		d.findElement(By.name("txtPassword")).sendKeys("admin123");
		d.findElement(By.name("Submit")).click();
		System.out.println("login to orangHRM");
		Thread.sleep(2000);
// mouse over
		Actions ac = new Actions(d);
		ac.moveToElement(d.findElement(By.linkText("Admin"))).perform();
		d.findElement(By.linkText("Job")).click();
		d.findElement(By.linkText("Work Shifts")).click();
		d.findElement(By.name("btnAdd")).click();
		d.findElement(By.name("workShift[name]")).sendKeys("night shift");
		d.findElement(By.id("workShift_workHours_from")).sendKeys("23:30");
		Thread.sleep(2000);
		ac.moveToElement(d.findElement(By.linkText("PIM"))).perform();
		Thread.sleep(2000);
// click on sub menu
		d.findElement(By.linkText("Add Employee")).click();
		System.out.println("clicked to sub menu");
		d.findElement(By.name("firstName")).sendKeys("Naveen");
		d.findElement(By.name("lastName")).sendKeys("Chava");
		d.findElement(By.name("employeeId")).sendKeys("07111996");
		d.findElement(By.id("btnSave")).click();
		System.out.println("added employee details");
		Thread.sleep(2000);
		d.findElement(By.id("btnSave")).click();
		d.findElement(By.name("personal[optGender]")).click();
		d.findElement(By.id("btnSave")).click();

		d.findElement(By.id("welcome")).click();
		Thread.sleep(500);
		d.findElement(By.linkText("Logout")).click();
		System.out.println("logout orangHRM");
		Thread.sleep(1000);
		d.close();
		System.out.println("close applicatiom");

	}

}
