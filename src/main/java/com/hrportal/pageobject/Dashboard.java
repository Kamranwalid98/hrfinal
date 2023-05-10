package com.hrportal.pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.Base;

public class Dashboard extends Base{
	 public WebDriver driver;
     
     
     By Attendance = By.linkText("Attendance");
     By Holidaylist =By.xpath("//i[@class='mdi mdi-calendar-month menu-icon']");
     By viewleaves = By.xpath("//*[@id=\"ui-basic\"]/ul/li[1]/a");
     
     public Dashboard(WebDriver driver) {
  	   this.driver=driver;
     }
     public void Employee_Dashboard() throws InterruptedException {
    	 String loginpage =driver.getTitle();
 		
 		System.out.println(loginpage);
 		 WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(7));
         w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"sidebar\"]/ul/li[4]/a")));
        
	   	driver.findElement(Holidaylist).click();
		 // driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[4]/a")).click();
		  Thread.sleep(2000);
		 String Holidaylist=driver.getCurrentUrl();
		 System.out.println(Holidaylist);
  	     driver.findElement(Attendance).click();
  	   String Attendance=driver.getCurrentUrl();
		 System.out.println(Attendance);
		 Thread.sleep(10000);
  	     driver.navigate().back();
  	     driver.findElement(viewleaves).click();
  	   String viewleaves=driver.getCurrentUrl();
  		 System.out.println(viewleaves);
  		 
  	  
  	  
  	  
    }

}
