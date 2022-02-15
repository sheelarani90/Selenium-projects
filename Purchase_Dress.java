package org.miniproject;
import java.util.concurrent.TimeUnit;

 

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;

 

public class Purchase_Dress {

 

              public static void main(String[] args) throws InterruptedException {

 

                             System.setProperty("webdriver.chrome.driver",

                                           "C:\\Users\\308310\\SeleniumConcepts\\SeleniumConcepts\\Driver\\chromedriver.exe");

                                                          WebDriver driver = new ChromeDriver();

                                                         driver.get("http://automationpractice.com/index.php");

                                                          driver.manage().window().maximize();

                                     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

                                    

                                     WebElement Signin = driver.findElement(By.xpath("//a[@class='login']"));

                                                          Signin.click();

                                                         

                                                          WebElement email = driver.findElement(By.id("email"));

                                     email.sendKeys("pricilla.grace@yahoo.co.in");

                            

                                     WebElement pwd = driver.findElement(By.id("passwd"));

                                     pwd.sendKeys("12345@");

                                    

                                     WebElement signin = driver.findElement(By.xpath("//i[@class='icon-lock left']"));

                                     signin.click();

                                    

                                     WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));

                                    

                                    Actions ac=new Actions(driver);

                                    ac.moveToElement(women).build().perform();

                                   

                                    WebElement casualDress = driver.findElement(By.xpath("//a[text()='Casual Dresses']"));

                                    

                                    casualDress.click();

                                    

                                   WebElement printedDRess = driver.findElement(By.xpath("//img[@title='Printed Dress']"));

                                    ac.moveToElement(printedDRess).build().perform();

                                    

                                    WebElement Quickview = driver.findElement(By.xpath("//span[text()='Quick view']"));

                                    ac.moveToElement(Quickview).build().perform();

                                    Quickview.click();

                                   //frame

                                   WebElement frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));

             

                                            driver.switchTo().frame(frame);

                                   

                                            WebElement Quantity = driver.findElement(By.xpath("//i[@class='icon-plus']"));

                                    Quantity.click();

                                   

                                  WebElement size = driver.findElement(By.id("group_1"));

                                   Select s=new Select(size);

                                   s.selectByValue("2");

                                   

                                    WebElement addtocart = driver.findElement(By.id("add_to_cart"));

                                    addtocart.click();

                                    driver.switchTo().defaultContent();

                                   WebElement checkout1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));

                                   checkout1.click();

                                  

                                   WebElement checkout2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));

                                   checkout2.click();

                                  

                                   WebElement checkout3 = driver.findElement(By.xpath("//button[@name='processAddress']"));

                                   checkout3.click();

                                  

                                   WebElement agree = driver.findElement(By.id("cgv"));

                                   agree.click();

                            

                                   WebElement checkout4 = driver.findElement(By.xpath("//button[@name='processCarrier']"));

                                   checkout4.click();

                                   

                                   WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));

                                   payment.click();

                            

                                   WebElement confirm = driver.findElement(By.xpath("//span[text()='I confirm my order']"));

                                   confirm.click();

                              

              }

 

}

 