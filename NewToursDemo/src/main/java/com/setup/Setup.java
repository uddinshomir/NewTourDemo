package com.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {
	
	
	
	public void chromeDriverSetup() {
		String chromeKey = "webdriver.chrome.driver"; 
		String chromeDriverPath = "src/test/resources/driver/chromedriver.exe"; 
		System.setProperty(chromeKey, chromeDriverPath); 
	}
	
	public void maximizeBrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public void goToUrl(WebDriver driver) {
		String URL = "http://newtours.demoaut.com/"; 
		driver.get(URL);
	}

}
