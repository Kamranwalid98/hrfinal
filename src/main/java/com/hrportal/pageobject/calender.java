package com.hrportal.pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calender {

	
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://streamshrapplication-env.eba-srcdj8aw.us-east-1.elasticbeanstalk.com/");
  	     driver.manage().window().maximize();
    	 Loginpage n1 = new Loginpage(driver);
    	 n1.Employee();
    	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Apply"))).click();
		 Thread.sleep(7000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("startDate"))).click();
		 Thread.sleep(7000);
         new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("ui-datepicker-div")));
    	 Thread.sleep(7000);
		 String monthyearval=driver.findElement(By.className("ui-datepicker-title")).getText();
		 Thread.sleep(7000);
		 System.out.println(monthyearval);
		 String month=monthyearval.split(" ")[0].trim();
		 String year=monthyearval.split(" ")[1].trim();
	while(!(month.equals("June") && year.equals("2023"))) {
	driver.findElement(By.xpath("//a[@title='Next']")).click();	
	 monthyearval=driver.findElement(By.className("ui-datepicker-title")).getText();
	Thread.sleep(7000);
	System.out.println(monthyearval);
	 month=monthyearval.split(" ")[0].trim();
	 year=monthyearval.split(" ")[1].trim();
	}
	driver.findElement(By.xpath("//a[text()='23']")).click();
	}

}
