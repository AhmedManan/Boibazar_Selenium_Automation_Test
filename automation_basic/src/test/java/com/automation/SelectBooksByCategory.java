package com.automation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectBooksByCategory extends BaseDriver {
	
	String url ="https://www.boibazar.com/";
	
	@Test
	public void SelectCategory() throws InterruptedException {
		driver.get(url);	
        driver.manage().window().maximize();
		Thread.sleep(5000); // 1000 = 1sec
		
		driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'লেখক')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'কাজী নজরুল ইসলাম')]")).click();
		Thread.sleep(2000); // 1000 = 1sec
		
		//Verify Page Title
		String title=driver.getTitle();
		String expected="কাজী নজরুল ইসলাম এর বই সমূহ অনলাইনে কিনুন | বইবাজার.কম";
        Assert.assertEquals(title, expected, "Text does not match the expected value.");
        
		//Verify Page Url        
		String pageUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.boibazar.com/author-books/Kazi-Nazrul-Islam";
        Assert.assertEquals(pageUrl, expectedUrl, "Text does not match the expected value.");
		
		}

}
