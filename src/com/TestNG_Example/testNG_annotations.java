package com.TestNG_Example;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG_annotations {

	@BeforeClass
	 public void openapp() {
		 Reporter.log(" open app");
	  }
	@AfterClass
	 public void closeapp() {
			 Reporter.log(" close app");
		  } 	
	
@BeforeMethod
 public void login() {
	 Reporter.log("login compleate");
  } 
@AfterMethod
  public void logout() {
	 Reporter.log("logout compleate");	
   }
@Test(priority=2)  //one @Test is equal to on2 Testcases
public void addemp() {
	Reporter.log("add emp compleate");
}
@Test(priority=1)
public void delemp() {
	Reporter.log("del emp compleate");
}

 }
