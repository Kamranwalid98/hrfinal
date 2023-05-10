package com.hrportal.actiondriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Actionclass {

	public static void ScrollByVisiblityOfElement(WebDriver driver, WebElement name ) {
		
	}
    public static void click( WebDriver driver,WebElement LocatorName) {
    	Actions act =new Actions(driver);
    	act.moveToElement(LocatorName).click().build().perform();
    	By users= By.id("twotabsearchtextbox");
    	
    	
    }
}
