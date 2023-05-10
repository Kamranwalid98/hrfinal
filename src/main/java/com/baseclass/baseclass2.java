package com.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass2 {
     public static  Properties prop;
	 public static WebDriver driver;
	 public baseclass2() throws IOException {
		 prop = new Properties();
			
			try {
				FileInputStream fs = new FileInputStream ("C:/Users/KamranKhan/eclipse-workspace/com.hrportal/configuraton/config.Properties");
				prop.load(fs);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 
	 }
	 public static void Employee(){
			/*
			 * String browserName=prop.getProperty("browser"); if
			 * (browserName.equals("chrome")) { WebDriverManager.chromedriver().setup();
			 * WebDriver driver = new ChromeDriver(); } else if (browserName.equals("edge"))
			 * { WebDriverManager.edgedriver().setup(); WebDriver driver = new
			 * ChromeDriver();
			 * 
			 * }else if (browserName.equals("mozilla")) {
			 * //WebDriverManager.geckodriver().setup(); WebDriver driver = new
			 * ChromeDriver(); }
			 */
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(prop.getProperty("URL"));
	        
	        
	        
	 }
	
}
	 
	 
	        
	 	


