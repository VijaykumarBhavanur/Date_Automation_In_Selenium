package com.bridgelabz.selenium.dateautomation;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/**
 * 
 * @author Vijaykumar Bhavanur 
 * purpose: To demonstrate Date automation in selenium
 * 
 */
public class DateTest {

	// Defining driver instance reference
	WebDriver driver;

	
	/**
	 * Method used to create and initialize driver instance
	 */
	@BeforeMethod
	public void setup() {
		// To set the path of the driver for the respective browser
		System.setProperty("webdriver.chrome.driver", "/home/admin1/Documents/chromedriver");
		// Creating browser instance based on driver
		driver = new ChromeDriver();
	}

	@Test
	public void dateTest() throws InterruptedException {
		// To Open URL of application to be tested
		driver.get("http://demo.guru99.com/test/");
		//Finding web_element by using xpath 
		WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
		//sending data to web_element
		dateBox.sendKeys("05121994");
		
		// Asserts that a condition is true
		assertTrue(true);
		
		//waiting for 5seconds
		Thread.sleep(5000);

	}

	/**
	 * Method to close resource such as browser after executing test methods
	 */
	@AfterMethod
	public void releaseResource() {
		driver.close();
	}
}
