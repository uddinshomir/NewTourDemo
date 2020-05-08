package com.testInheritance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.loginpage.Login;

public class NewToursTest extends Login {

	public static void main(String[] args) {
		NewToursTest test = new NewToursTest();
		test.chromeDriverSetup();
		WebDriver driver = new ChromeDriver(); 
		test.maximizeBrowser(driver);
		test.goToUrl(driver);
		test.userLogin(driver);
		

	}

}
