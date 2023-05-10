package com.hrportal.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage extends Base {
	
      public WebDriver driver;
       
      
       By user = By.id("email");
       By user1 =By.id("password");
       By user2 = By.xpath("//*[@id=\"myButton\"]/button");
       
       public Loginpage(WebDriver driver) {
    	   this.driver=driver;
       }
      public void Employee() throws InterruptedException {
    	  
    	  driver.findElement(user).sendKeys("gaurav.anand@streamssolutions.com");
    	  driver.findElement(user1).sendKeys("12345");
    	  Thread.sleep(7000);
    	  driver.findElement(user2).click();
    	  
      }
      
		/*
		 * public static void main(String [] args) {
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver(); Loginpage n1= new Loginpage(driver); n1.Employee(); }
		 */
}
