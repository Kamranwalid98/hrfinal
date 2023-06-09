package com.baseclass;

import java.time.Duration;

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
		driver.manage().deleteAllCookies(); 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
		          
		driver.get("http://streamshrapplication-env.eba-srcdj8aw.us-east-1.elasticbeanstalk.com/");
   	    
     	Loginpage n1 = new Loginpage(driver);
     	//Dashboard n2 = new Dashboard(driver);
     	//String Startdate="23-06-2023";
     	String Enddate="23-06-2023";
     	String days="1.00";
     	String State="Pending";
     	
     Applyleave n3 =new Applyleave(driver);
     	n1.Employee();
    	//n2.Employee_Dashboard();
    	
    	String[] Date=n3.applyLeave();
    
    	Viewleave n4 =new Viewleave(driver);
    	//days=Date[1]- Date[0];
     	n4.View_leaves(Date[0], Date[1],days,State);
     	
	}

}
