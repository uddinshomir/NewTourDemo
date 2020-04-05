package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightFinder {
	
	WebDriver driver; 

	@Given("User on Website")
	public void user_on_Website() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uddin\\git\\NewToursDemo\\NewToursDemo\\src\\test\\resources\\driver\\chromedriver.exe");
	    driver = new ChromeDriver(); 
	    driver.get("http://www.newtours.demoaut.com/");
	
	}

	@When("User Logs in")
	public void user_Logs_in() {
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("selenium1994");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("smarttech");
		driver.findElement(By.xpath("//*[@name='login']")).click();
		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
	    
	}

	@When("User selects Round Trip")
	public void user_selects_Round_Trip() {
		driver.findElement(By.xpath("//*[@value='roundtrip']")).click();
	  
	}

	@Then("Round Trip is selected")
	public void round_Trip_is_selected() {
	  WebElement roundTripBtn = driver.findElement(By.xpath("//*[@value='roundtrip']")); 
	  System.out.println("Round Trip selected is " +  roundTripBtn.isSelected());
	    
	}

	@When("User selects One Way")
	public void user_selects_One_Way() {
	   WebElement OneWayBtn = driver.findElement(By.xpath("//*[@value='oneway']"));
	   OneWayBtn.click();
	    
	}

	@Then("One Way is selected")
	public void one_Way_is_selected() {
		WebElement OneWayBtn = driver.findElement(By.xpath("//*[@value='oneway']"));
	    System.out.println("One Way is selected " + OneWayBtn.isSelected());
	}



}
