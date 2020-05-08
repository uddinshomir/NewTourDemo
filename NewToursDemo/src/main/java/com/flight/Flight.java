package com.flight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.loginpage.Login;

public class Flight extends Login {
	
	public void oneWay(WebDriver driver) {
		driver.findElement(By.xpath("//*[@value='oneway']")).click();
	}

}
