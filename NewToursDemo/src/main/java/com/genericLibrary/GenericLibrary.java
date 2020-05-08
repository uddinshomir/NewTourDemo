package com.genericLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.screenShot;

public class GenericLibrary {
	
	WebDriver driver;
	
		
	public void openBrowser() {
		String chromeKey = "webdriver.chrome.driver"; 
		String chromeDriverPath = "src/test/resources/driver/chromedriver.exe"; 
		System.setProperty(chromeKey, chromeDriverPath); 
		driver = new ChromeDriver();
	}
	
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	
	public void goToUrl() {
		String URL = "http://newtours.demoaut.com/"; 
		driver.get(URL);
	}
	
	public void userLogin() {
		
		WebElement userNameBox = driver.findElement(By.xpath("//*[@name='userName']"));
		userNameBox.sendKeys("selenium1994");
		
		
		WebElement passWordBox = driver.findElement(By.xpath("//*[@name='password']")); 
		passWordBox.sendKeys("smarttech");
		
		
		WebElement signInBtn = driver.findElement(By.xpath("//*[@value='Login']")); 
		signInBtn.click();
		
		screenShot.captureScreenShot(driver, "New Tours Login"); 
	}
	
	

}
