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
     By FromDatePicker =By.id("startDate");
     By EndDatePicker =By.id("endDate");
     By Reason =By.id("reason");
     By submitBtn =By.xpath("//button[@type=\"submit\"]");
	 public Applyleave(WebDriver driver) {
 	   this.driver=driver;
       }
     public void applyLeave() throws InterruptedException {
    	 System.out.println("applyleavepage");
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Apply")));
		 driver.findElement(FromDatePicker).click();
		 Thread.sleep(2000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Calendar"))).click();
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
   	
   	
    	for(int rowNum=1; rowNum>=7;rowNum++) {
   	    for(int colNum=2; colNum>=7;colNum++) {
 
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

    
  	  
  	  

    }


