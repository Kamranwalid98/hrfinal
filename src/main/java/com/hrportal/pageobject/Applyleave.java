package com.hrportal.pageobject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.Base;

public class Applyleave extends Base{
 public WebDriver driver;
     
 
     
     By Apply = By.linkText("Apply");
     By FromDate =By.id("startDate");
     By EndDate =By.id("endDate");
     By Reason =By.xpath("//*[@id=\"reason\"]");
     By DateTable =By.id("ui-datepicker-div");
     By Startdate =By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[2]/a");
     By Enddate =By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]/a");
   //*[@id="ui-datepicker-div"]/table/tbody/tr[2]/td[4]/a
     //html/body/div[3]/table/tbody/tr[2]/td[4]/a
     By Close_button =By.xpath("/html/body/div[2]/div/div/div[3]/button");
     //By Close_button =By.linkText("Close");
   //*[@id="successModalemployeeDash"]/div/div/div[3]/button
     
    // By Date =By.xpath("//a[normalize-space()='9']");
     
     public Applyleave(WebDriver driver) {
    	   this.driver=driver;
       }
     public void Apply_leave() throws InterruptedException {
    	 System.out.println("applyleavepage");
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		  WebDriverWait q=new WebDriverWait(driver,Duration.ofSeconds(7));
		  q.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Apply")));
		 
 
 		
	   	 driver.findElement(Apply).click();
		 // driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[4]/a")).click();
		  Thread.sleep(2000);
		 String Apply=driver.getCurrentUrl();
		 System.out.println(Apply);
		 System.out.println("initalize");
  	  
  	     Thread.sleep(2000);
          driver.findElement(FromDate).click();
        //  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));
			/*
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(DateTable)).click();
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(Startdate)).click()
			 */
;          
        
       
         Thread.sleep(2000);
         driver.findElement(EndDate).click();
        // wait.until(ExpectedConditions.visibilityOfElementLocated(Enddate)).click()
         ;          
       
         System.out.println("end");

         driver.findElement(Reason).sendKeys("sick_leave");
         driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div/div[2]/form/button[1]")).click();
        // driver.switchTo().alert().getText().contains("Leave applied successfully");
        // driver.switchTo().alert().accept();
               //  String Leaveappliedpopup= driver.switchTo().alert().getText();
                // System.out.println(Leaveappliedpopup);
                 //driver.findElement(Close_button).click();
                // driver.switchTo().alert().dismiss();
                 driver.navigate().refresh();

       
  	  // driver.findElement(Date).click();
  	   
  	  
  	  
  	  
    }

}
