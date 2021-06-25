package com.seleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;

public class tc003_kB_wD {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_drivers\\chromedriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.navigate().to("https://www.google.com/");
		Thread.sleep(4000);
		System.out.println("open url");
		System.out.println(d.getTitle());
		d.findElement(By.name("q")).sendKeys("ntr");
		Thread.sleep(3000);
		d.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		d.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		d.findElement(By.name("q")).sendKeys(Keys.ARROW_UP);
		Thread.sleep(2000);
		d.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		d.close();
	}

}
