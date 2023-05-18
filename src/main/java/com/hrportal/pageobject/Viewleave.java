package com.hrportal.pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.Base;

public class Viewleave extends Base{
	 public WebDriver driver;
	 By viewleaves = By.xpath("//*[@id=\"ui-basic\"]/ul/li[1]/a");
	 By viewleawicon= By.xpath(" /html/body/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[7]/center/a[1]/i");
	                          
	 By leaveDetail=By.id("tableBody");
	 
	 public Viewleave(WebDriver driver) {
  	   this.driver=driver;
     }

	 public void View_leaves(String startdate,String enddate,String days,String State ) throws InterruptedException {
    	
    	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
         wait.until(ExpectedConditions.elementToBeClickable(viewleaves)).click();
         Select dropdown = new Select(driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/label/select")));
		 dropdown.selectByVisibleText("100");  
		  
         String viewleavebtn=driver.findElement(leaveDetail).getText();
         Thread.sleep(2000);
         System.out.println(viewleavebtn);
        
         String AfterEditPencil="\"]/i";
         String BeforePencil="//*[@id=\"editLeave";
         //String toview="PL ";
		 
			  for(int ii = 1;ii<=100;ii++) {
				  while(viewleavebtn.contains(" PL "+" "+startdate+ " "+enddate +" "+ days+ " "+State)) {
					//  while(viewleavebtn.contains(" PL 2023-05-18 2023-05-18 1.00 Pending")) {
			  driver.findElement(By.xpath(BeforePencil+ii+AfterEditPencil)).click();
				  }
			  Thread.sleep(3000);
			  }
			  String viewleavebtn1= driver.findElement(leaveDetail).getText();
			  System.out.println("viewleavebtn1");
			  
			 // wait.until(ExpectedConditions.elementToBeClickable(viewleawicon)).click();
			  
		  }

		 
	         
        
    	
	 }


