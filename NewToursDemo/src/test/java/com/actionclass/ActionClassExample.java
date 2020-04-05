package com.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uddin\\git\\NewToursDemo\\NewToursDemo\\src\\test\\resources\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		Actions action = new Actions(driver); 
		driver.get("https://www.zoopla.co.uk/");
		WebElement saleMenu = driver.findElement(By.xpath("(//*[@class='mnav__link has-subnav'])[1]")); 
		action.moveToElement(saleMenu);
		WebElement propertyForSale = driver.findElement(By.xpath("(//*[@class='subnav__link'])[1]")); 
		action.moveToElement(propertyForSale); 
		
		

		
	}

}
