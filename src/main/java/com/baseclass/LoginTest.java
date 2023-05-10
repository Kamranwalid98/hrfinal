package com.baseclass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
      
	  WebDriver driver;
      By user=By.id("email");
      By pass=By.id("password");
      By submit_button=By.xpath("//*[@id=\"myButton\"]/button");
	  @BeforeTest
	  public void beforeTest()
	  {  
		   
     	    WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies(); 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		          
	  }
	  @Test(priority=0)
	  public void login() throws InterruptedException {
		  driver.get("http://streamshrapplication-env.eba-srcdj8aw.us-east-1.elasticbeanstalk.com/");
		  driver.findElement(user).sendKeys("gaurav.anand@streamssolutions.com");
    	  driver.findElement(pass).sendKeys("12345");
    	  Thread.sleep(7000);
    	  driver.findElement(submit_button).click();
    	  WebElement employee = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[1]/a/div[2]/span"));
    	  Assert.assertEquals(employee.getText(),"Gaurav Anand");
    	 
	  }
	  @Test(enabled=false)
	  public void loginWithInvalidCred() throws InterruptedException {
		  driver.get("http://streamshrapplication-env.eba-srcdj8aw.us-east-1.elasticbeanstalk.com/");
		  driver.findElement(user).sendKeys("gaurav.anand@streamssolutions.com");
    	  driver.findElement(pass).sendKeys("1234");   //wrong password
    	  Thread.sleep(7000);
    	  driver.findElement(submit_button).click();
    	  WebElement employee = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[1]/a/div[2]/span"));
    	  Assert.assertEquals(employee.getText(),"Gaurav _Anand");
	  }
	  By Apply = By.linkText("Apply");
	     By FromDatePicker =By.id("startDate");
	     By EndDatePicker =By.id("endDate");
	     By Reason =By.id("reason");
	     By Calendar =By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[@data-month=\"4\"][@data-year=\"2023\"]/a[contains(text(),'18')]"); 
	     //By Enddate =By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[@data-month="4\"][@data-year=\"2023\"]/a[contains(text(),'18')]");
	     By submitBtn =By.xpath("//button[@type=\"submit\"]");
	  @Test(dependsOnMethods = {"login"})
	  public void applyLeave() throws InterruptedException {
    	  System.out.println("applyleavepage");
		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(Apply)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(FromDatePicker)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(Calendar)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(EndDatePicker)).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(Calendar)).click();
          driver.findElement(Reason).sendKeys("sick_leave");
			/*
			 * Assert.assertEquals(driver.findElement(submitBtn).isDisplayed(), true);
			 * 
			 * wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
			 */
          WebElement element = wait.until(ExpectedConditions.elementToBeClickable(submitBtn)); 
          ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
          
	  }
	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }
}
	  
