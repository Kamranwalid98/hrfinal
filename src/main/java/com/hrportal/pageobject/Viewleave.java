package com.hrportal.pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.Base;

public class Viewleave extends Base{
	 public WebDriver driver;
	 By viewleaves = By.xpath("//*[@id=\"ui-basic\"]/ul/li[1]/a");
	 By view_applied_leaves = By.xpath("//*[@id=\"tableBody\"]/tr[2]/td[7]/center/a[1]/5");
	 By delete_applied_leaves = By.xpath("/html/body/div/div[1]/div[2]/div/div/div/div/div/div/div/div/div[2]/div/table/tbody/tr[2]/td[7]/center/a[3]/i");
	 

	//*[@id="tableBody"]/tr[10]/td[7]/center/a[1]/i
	 
	 
	 
	 public Viewleave(WebDriver driver) {
  	   this.driver=driver;
     }
	 
	 public void View_leaves() throws InterruptedException {
    	 String Viewleave =driver.getTitle();
    	 System.out.println(Viewleave);
    	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
         wait.until(ExpectedConditions.elementToBeClickable(viewleaves)).click();
    	 driver.findElement(viewleaves).click();
    	 Thread.sleep(7000);
    	 System.out.println(view_applied_leaves);
    	 
    	 driver.findElement(view_applied_leaves).click();
    	 System.out.println(view_applied_leaves);
    	 //WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
         //wait1.until(ExpectedConditions.elementToBeClickable(view_applied_leaves)).click();
         
         Thread.sleep(2000);
    	 System.out.println("viewleawicon");
    	 driver.navigate().back();
    	 Thread.sleep(7000);
    	 driver.findElement(delete_applied_leaves).click();
    	 
    	 
    	 
 		

}
}