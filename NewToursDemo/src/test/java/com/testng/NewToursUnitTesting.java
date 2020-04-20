package com.testng;

import org.testng.annotations.Test;

import com.genericLibrary.GenericLibrary;

public class NewToursUnitTesting extends GenericLibrary {
	
	@Test
	public void execution() {
		NewToursUnitTesting obj = new NewToursUnitTesting();
		obj.openBrowser();
		obj.maximizeBrowser();
		obj.goToUrl();
		obj.userLogin();
	}

}
