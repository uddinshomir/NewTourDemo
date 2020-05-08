package com.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.setup.Setup;

public class Login extends Setup {
	
	
	public void userLogin(WebDriver driver) {
		
		WebElement userNameBox = driver.findElement(By.xpath("//*[@name='userName']"));
		userNameBox.sendKeys("selenium1994");
		
		
		WebElement passWordBox = driver.findElement(By.xpath("//*[@name='password']")); 
		passWordBox.sendKeys("smarttech");
		
		
		WebElement signInBtn = driver.findElement(By.xpath("//*[@value='Login']")); 
		signInBtn.click();
	}

}
