package com.sortArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortArrayList {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uddin\\git\\NewToursDemo\\NewToursDemo\\src\\test\\resources\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.amazon.com/");
		WebElement searchBar = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		searchBar.sendKeys("iphone");
		searchBar.submit();
		
		List<WebElement> pricesWebElement = driver.findElements(By.xpath("//*[@class='a-price-whole']"));
		System.out.println(pricesWebElement.size());
		
		ArrayList<String> stringPrices = new ArrayList<String>(); 
		
		for(int i = 0; i < pricesWebElement.size() ; i++ ) {
			String price = pricesWebElement.get(i).getText(); 
			String replacedPrice = price.replaceAll("[^\\d.]", "");
			stringPrices.add(replacedPrice); 
		}
		
		System.out.println(stringPrices);
		
	
		stringPrices.removeAll(Collections.singleton(null)); 
		stringPrices.removeAll(Collections.singleton("")); 
		
		System.out.println(stringPrices);
		
		ArrayList<Integer> intPrice = new ArrayList<Integer>();  
		
		for(int i = 0; i < stringPrices.size(); i++) {
			String prices = stringPrices.get(i); 
			int integerPrices = Integer.parseInt(prices); 
			intPrice.add(integerPrices); 
		}
		
		System.out.println(intPrice);
		
		
		
		Collections.sort(intPrice);
		System.out.println(intPrice);
		
		
	} 

}
