package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumConcepts {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");	
    
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://www.google.com");
		
		
		
		
		
	}

}
