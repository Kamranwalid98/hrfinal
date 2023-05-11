package com.hrportal.pageobject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
<<<<<<< HEAD
   //  By Startdate =By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[2]/a");
     By Enddate =By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]/a");
     By Close_button =By.xpath("/html/body/div[2]/div/div/div[3]/button");
     By submitBtn =By.xpath("//button[@type=\"submit\"]");
    // 
  public Applyleave(WebDriver driver) {
 	   this.driver=driver;
       }
     public void Apply_leave() throws InterruptedException {
    	 System.out.println("applyleavepage");
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Apply")));
		driver.findElement(FromDate).click();
		 Thread.sleep(2000);
		 System.out.println(driver.getCurrentUrl());
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Calendar"))).click();
  	     Thread.sleep(2000);
  	    String date="2023-05-18";
     	String dateArr[]=date.split("-");
    	String day=dateArr[2];
    	String month=dateArr[1];
   	    String year=dateArr[0];
     	String beforeXpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[";
   	    String afterXpath="]/td[@data-month=\"";
   	    String afterXpath1="\"][@data-year=\"2023\"]";
   	    String afterXpath2="/a[contains(text(),'18')]\")";
   	    final int totalWeekDays=7;
   	//boolean flag=false;
   	
    	for(int rowNum=1; rowNum>=7;rowNum++) {
   	    for(int colNum=2; colNum>=7;colNum++) {
//By Calendar =By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[@data-month=\"4\"][@data-year=\"2023\"]/a[contains(text(),'18')]"); 
   	    String dayVal=driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+afterXpath1+afterXpath2)).getText();
   	    System.out.println(dayVal);
   			
   		if(dayVal.equals(day)) {
   		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(beforeXpath+rowNum+afterXpath+colNum+afterXpath1+afterXpath2))).click();
   	   			
   		       }
   			
   	     	}
      	}
    	System.out.println("end");

        driver.findElement(Reason).sendKeys("sick_leave");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(submitBtn)); 
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
     }
=======
     By Startdate =By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[@data-month=\"4\"][@data-year=\"2023\"]/a[contains(text(),'18')]"); 
     By Enddate =By.xpath("/html[1]/body[1]/div[3]/table[1]/tbody[1]/tr[3]/td[2]/a[1]");
    // By Close_button =By.xpath("/html/body/div[2]/div/div/div[3]/button");
   
     public Applyleave(WebDriver driver) {
    	   this.driver=driver;
       }
     public void Apply_leave() throws InterruptedException {
    	  System.out.println("applyleavepage");
		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(Apply)).click();
		  driver.findElement(DateTable).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(Startdate)).click();
		  driver.findElement(Startdate).click();
		  
			/*
			 * WebDriverWait Jk=new WebDriverWait(driver,Duration.ofSeconds(7));
			 * JK.until(ExpectedConditions.visibilityOfElementLocated(Startdate)).click();
			 * // driver.findElement(Startdate).click(); Thread.sleep(2000);
			 */			 
          driver.findElement(EndDate).click();
          System.out.println("end");
          driver.findElement(Reason).sendKeys("sick_leave");
          driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div/div[2]/form/button[1]")).click();
        // driver.switchTo().alert().getText().contains("Leave applied successfully");
        // driver.switchTo().alert().accept();
               //  String Leaveappliedpopup= driver.switchTo().alert().getText();
                // System.out.println(Leaveappliedpopup);
                 //driver.findElement(Close_button).click();
                // driver.switchTo().alert().dismiss();
                 

       
  	  // driver.findElement(Date).click();
  	   
  	  
  	  
  	  
>>>>>>> b5bbeb3177263a4f614ee37d7532e4cc980dc89e
    }


