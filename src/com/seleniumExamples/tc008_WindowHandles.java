package com.seleniumExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import java.util.ArrayList;

public class tc008_WindowHandles {
    public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_drivers\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.navigate().to("file:///D:/selenium_drivers/multiplewindows.html");
            System.out.println("open url");
            Thread.sleep(4000);
        d.findElement(By.id("btn2")).click();
            Thread.sleep(4000);
        d.findElement(By.id("btn3")).click();            
            Thread.sleep(4000);

    ArrayList<String> windinfo=new ArrayList<String>(d.getWindowHandles());
        d.switchTo().window(windinfo.get(2));
          System.out.println("opend w 2");
          Thread.sleep(4000);
        d.close();         
          Thread.sleep(4000);        
          System.out.println("close  w 2");
        d.switchTo().window(windinfo.get(0));
          System.out.println("open w 1");
          Thread.sleep(4000);
        d.switchTo().window(windinfo.get(1));
          System.out.println("open w 3");
          Thread.sleep(4000);
        d.close();
          System.out.println("close w 3");
         Thread.sleep(4000);
        d.quit();
        }

}
