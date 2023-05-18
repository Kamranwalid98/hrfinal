package com.hrportal.pageobject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    	
    	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(Apply)).click();
		 Thread.sleep(2000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(FromDatePicker)).click();
		 
		 
         new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("ui-datepicker-div")));
    	 Thread.sleep(2000);
		 String monthyearval=driver.findElement(By.className("ui-datepicker-title")).getText();
		 Thread.sleep(2000);
		 System.out.println(monthyearval);
		 String month=monthyearval.split(" ")[0].trim();
		 String year=monthyearval.split(" ")[1].trim();
	while(!(month.equals("June") && year.equals("2023"))) {
	driver.findElement(By.xpath("//a[@title='Next']")).click();	
	 monthyearval=driver.findElement(By.className("ui-datepicker-title")).getText();
	Thread.sleep(2000);
	System.out.println(monthyearval);
	 month=monthyearval.split(" ")[0].trim();
	 year=monthyearval.split(" ")[1].trim();
	}
	driver.findElement(By.xpath("//a[text()='23']")).click();
	Thread.sleep(2000);
		 
	wait.until(ExpectedConditions.visibilityOfElementLocated(EndDatePicker)).click();
	Thread.sleep(2000);
	 new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("ui-datepicker-div")));
	 Thread.sleep(2000);
	 String newmonthyearval=driver.findElement(By.className("ui-datepicker-title")).getText();
	 Thread.sleep(2000);
	 System.out.println(newmonthyearval);
	 String newmonth=newmonthyearval.split(" ")[0].trim();
	 String newyear=newmonthyearval.split(" ")[1].trim();
    while(!(newmonth.equals("June") && newyear.equals("2023"))) {
        driver.findElement(By.xpath("//a[@title='Next']")).click();
        Thread.sleep(2000);
        newmonthyearval=driver.findElement(By.className("ui-datepicker-title")).getText();
        Thread.sleep(2000);
        System.out.println(newmonthyearval);
        newmonth=newmonthyearval.split(" ")[0].trim();
        newyear=newmonthyearval.split(" ")[1].trim();

  }
    driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[6]/a")).click();
	Thread.sleep(2000);
	driver.findElement(Reason).sendKeys("Planned leave");
	  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(submitBtn)); 
      ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
      Thread.sleep(3000);
	
     }

	
	
	

}
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 