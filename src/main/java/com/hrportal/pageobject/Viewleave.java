package com.hrportal.pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.Base;

public class Viewleave extends Base{
	 public WebDriver driver;
	 By viewleaves = By.xpath("//*[@id=\"ui-basic\"]/ul/li[1]/a");
	 By viewleawicon= By.xpath(" /html/body/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[7]/center/a[1]/i");
	                           // /html/body/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div[2]/div/table/tbody/tr[2]/td[7]/center/a[1]/i
	 //By leaveDetail=By.xpath(" /html/body/div/div[2]/div/div/div/div/div/div/div/form/fieldset/div[1]/div[1]/div/div[2]/text()");
	// By delete_applied_leaves = By.xpath("/html/body/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div[2]/div/table/tbody/tr[2]/td[7]/center/a[3]/i");
	 By leaveDetail=By.id("tableBody");
	 public Viewleave(WebDriver driver) {
  	   this.driver=driver;
     }

	 public void View_leaves() throws InterruptedException {
    	
    	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
         wait.until(ExpectedConditions.elementToBeClickable(viewleaves)).click();
       
        String viewleavebtn=driver.findElement(leaveDetail).getText();
       System.out.println(viewleavebtn);
		  if(viewleavebtn.contains("32	PL	2023-05-31	2023-05-31	1.00	Pending	\r\n"
		  		+ "")) {
		  System.out.println("null"); 
		  
		  }
		  else{
			  Select dropdown = new Select(driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/label/select")));
			  dropdown.selectByVisibleText("100");  
			  
			  String viewleavebtn1= driver.findElement(leaveDetail).getText();
			  System.out.println("hello");
			  if() {
				driver.get
			}
			  
			 // wait.until(ExpectedConditions.elementToBeClickable(viewleawicon)).click();
			  
		  }
		 
        
         Thread.sleep(7000);
        
        // driver.navigate().back();
         driver.close();
    	
    	// driver.findElement(delete_applied_leaves).click();
    	 
               Dimension lastRowcount=driver.findElement(By.xpath("//*[@id=\"tableBody\"]")).findElement(By.tagName("tr")).getSize();
         For (int i=0; i<=lastRowcount; )
         "/html/body/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div[2]/div/table/tbody/tr["i"]/td[3]"
    	 
 		

}
}