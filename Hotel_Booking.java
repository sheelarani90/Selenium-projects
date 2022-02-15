package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel_Booking {
	
	public static WebDriver driver=browserLaunch("chrome");
	
	public static void main(String[] args) {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("Sheela90");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("dob1421990");
		
		WebElement Login = driver.findElement(By.xpath("//input[@name='login']"));
		Login.click();
		
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		Select s =new Select(location);
		s.selectByIndex(2);
		
		WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s1=new Select(hotels);
		s1.selectByValue("Hotel Hervey");
		
		WebElement roomType = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select s2=new Select(roomType);
		s2.selectByVisibleText("Super Deluxe");
		
		WebElement roomNo = driver.findElement(By.id("room_nos"));
		Select s3=new Select(roomNo);
		s3.selectByVisibleText("2 - Two");
		
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.sendKeys("08/02/2022");
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.sendKeys("10/02/2022");
		
		WebElement adultroom = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select s4=new Select(adultroom);
		s4.selectByValue("3");
		
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		
		WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
		radiobutton.click();
		
		WebElement selectHotel = driver.findElement(By.id("continue"));
		selectHotel.click();
		
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("sheela");
		
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("rani");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("123 main st,Atlanta,Georgia-30303");
		
		WebElement CCno = driver.findElement(By.id("cc_num"));
		CCno.sendKeys("9876543217412589");
				
		WebElement CCtype = driver.findElement(By.id("cc_type"));
		Select s5=new Select(CCtype);
		s5.selectByValue("VISA");
		
		WebElement CCexpmonth = driver.findElement(By.id("cc_exp_month"));
		Select s6=new Select(CCexpmonth);
		s6.selectByValue("2");
		
		WebElement ccexpyear = driver.findElement(By.id("cc_exp_year"));
		Select s7=new Select(ccexpyear);
		s7.selectByVisibleText("2022");
		
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvv.sendKeys("987");
		
		WebElement booknow = driver.findElement(By.xpath("//input[@name='book_now']"));
		booknow.click();
	}

	private static WebDriver browserLaunch(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
