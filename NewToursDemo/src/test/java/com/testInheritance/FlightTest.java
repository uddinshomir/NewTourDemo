package com.testInheritance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flight.Flight;

public class FlightTest extends Flight {

	public static void main(String[] args) {
		FlightTest test = new FlightTest();
		test.chromeDriverSetup();
		WebDriver driver = new ChromeDriver(); 
		test.maximizeBrowser(driver);
		test.goToUrl(driver);
		test.userLogin(driver);
		test.oneWay(driver);

	}

}
