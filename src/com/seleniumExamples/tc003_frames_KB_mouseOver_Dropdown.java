package com.seleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class tc003_frames_KB_mouseOver_Dropdown {
	public static void main(String[] args) throws Exception {
		   System.setProperty("webdriver.chrome.driver", "D:\\selenium_drivers\\chromedriver\\chromedriver.exe");
	 WebDriver d = new ChromeDriver();
	       System.out.println("launch chrome browser");
	   d.navigate().to("https://opensource-demo.orangehrmlive.com/");
		  System.out.println("open url");
          Thread.sleep(2000);
		  System.out.println(d.getTitle());
		d.findElement(By.name("txtUsername")).sendKeys("admin");
		d.findElement(By.name("txtPassword")).sendKeys("admin123");	
//keyBoard 
//click TAB and ENter using keyboard actions
	 Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		  System.out.println("click tab");
		  Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		  System.out.println("click enter");
		  Thread.sleep(4000);
          System.out.println("log in compleated");
//MouseOver Actions
	 Actions ac = new Actions(d);
	   ac.moveToElement(d.findElement(By.linkText("PIM"))).perform();
		  System.out.println(" click pim ");
		  Thread.sleep(3000); 
		d.findElement(By.linkText("Employee List")).click();
		  System.out.println(" click employee list ");
        d.findElement(By.name("btnAdd")).click();
		  Thread.sleep(3000);
		d.findElement(By.name("firstName")).sendKeys("selenium");
		d.findElement(By.name("lastName")).sendKeys("naveen");
        d.findElement(By.id("btnSave")).click();
		  System.out.println(" add employe name and save ");
          Thread.sleep(4000);
        d.findElement(By.id("btnSave")).click();
        d.findElement(By.name("personal[optGender]")).click();
 //dropdown       
        Select st=new Select(d.findElement(By.name("personal[cmbNation]")));
        st.selectByVisibleText("Indian");
          System.out.println("select by nationality");
          Thread.sleep(3000);
        Select s=new Select(d.findElement(By.name("personal[cmbMarital]")));
        s.selectByVisibleText("Married");
          Thread.sleep(3000);
        d.findElement(By.id("personal_txtOtherID")).sendKeys("4825225");
           Thread.sleep(3000);
        d.findElement(By.id("btnSave")).click();
		  Thread.sleep(3000);
		   System.out.println("save new employ details");
		ac.moveToElement(d.findElement(By.linkText("My Info"))).perform();
		  Thread.sleep(500);
		d.findElement(By.id("welcome")).click();
		  System.out.println("enter click welcom ");
// choose frames concept: 1st step is wait statement 
		               // 2nd step object identification: xpath with single attribute and multi attributes
		               // 3rd step frames(check confirm or not). syntax:- 
		                                  //enter into frame   d.switchTo().frame("");
		                                  //exit into frame    d.switchTo().defaultContent();
		  Thread.sleep(500); // wait statement by using java: 
		d.findElement(By.linkText("Logout")).click();
		  System.out.println(" logout compleated");
        d.quit();
     
	}

}
