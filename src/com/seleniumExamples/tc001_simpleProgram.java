package com.seleniumExamples;

// to access for webdriver classes &methods
import org.openqa.selenium.WebDriver;
// to get acces for chrome browser
import org.openqa.selenium.chrome.ChromeDriver;
//to get acces for object identification:
import org.openqa.selenium.By;

public class tc001_simpleProgram {
	public static void main(String[] args) throws Exception {
		// test case steps
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_drivers\\chromedriver\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
		System.out.println("launch browser");
		Thread.sleep(5000);
		d.navigate().to("https://opensource-demo.orangehrmlive.com/");		
		System.out.println("enter url");
        System.out.println(d.getTitle()); 
		Thread.sleep(3000);
		d.close();
		System.out.println("application is close");
	}

}
