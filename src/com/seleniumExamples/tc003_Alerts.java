package com.seleniumExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
public class tc003_Alerts {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
// we are open the application.
		//any alert display on the webpage. 
		//to use this syntax of alerts 
		//suppose ex;- choose one application open
		               //giving the username after thst directly click login
		              // diplay the alert 
		//to write syntax
		Alert a=d.switchTo().alert();
		System.out.println(a.getText());
	 // ok
		a.accept();
	// cancle	
		a.dismiss();
	}

}
