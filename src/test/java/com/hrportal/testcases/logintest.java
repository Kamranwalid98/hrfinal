package com.hrportal.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.baseclass2;
import com.hrportal.pageobject.Loginpage;

public class logintest extends baseclass2 {
	Loginpage Loginpage;
	logintest() throws IOException {
		super();
	}

@BeforeMethod
	
	public void setup () throws IOException
	{

//	initialization();
//	Loginpage=new Loginpage();
//	Loginpage.clickonsubmit();
	}
@Test
    public void validatelogin() {
	//Loginpage.clickonsubmit();
}



@AfterMethod
public void teardown() {
	driver.quit();
}

}
