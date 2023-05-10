package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hrportal.pageobject.Dashboard;
import com.hrportal.pageobject.Loginpage;
import com.hrportal.pageobject.Applyleave;
import com.hrportal.pageobject.Viewleave;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static void main(String[] args) throws InterruptedException {
	//public void driversetup() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://streamshrapplication-env.eba-srcdj8aw.us-east-1.elasticbeanstalk.com/");
   	     driver.manage().window().maximize();
     	Loginpage n1 = new Loginpage(driver);
     	//Dashboard n2 = new Dashboard(driver);
     	Applyleave n3 =new Applyleave(driver);
     	n1.Employee();
    	//n2.Employee_Dashboard();
    	n3.Apply_leave();
    	Viewleave n4 =new Viewleave(driver);
     	n4.View_leaves();
     	
	}

}
